package com.delta.playandroid.ui.fragment.home

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.databinding.BannerAndRvBinding
import com.delta.playandroid.ui.activity.LoginActivity
import com.delta.playandroid.ui.activity.WebViewActivity
import com.delta.playandroid.ui.adapter.ArticleListAdapter
import com.delta.playandroid.ui.adapter.BannerAdapter
import com.delta.playandroid.viewmodel.ArticleViewModel
import com.delta.playandroid.viewmodel.BannerViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeRoot :BaseFragment<BannerAndRvBinding>(R.layout.banner_and_rv,BannerAndRvBinding::bind)
    ,BannerAdapter.onBannerClickListener
    ,ArticleListAdapter.uncollectedClickListener{

    private val articleViewModel:ArticleViewModel by viewModels()
    private val bannerViewModel:BannerViewModel by viewModels()

    private lateinit var articleListAdapter: ArticleListAdapter
    private lateinit var bannerAdapter: BannerAdapter

    /**
     * @Date:2024/11/19
     * @Destription:加上了忘记写的自动轮播功能
     */
    private val handler = Handler(Looper.getMainLooper())
       private val runnable = object : Runnable {
           override fun run() {
               databinding.headPageBanner.setCurrentItem(
                   if (databinding.headPageBanner.currentItem <= 1){
                       databinding.headPageBanner.currentItem + 1
                   }else{
                       0
                   }
               )
               handler.postDelayed(this, 3000)
           }
       }

    private fun startBanner() {
        handler.post(runnable)
    }

    private fun stopBanner(){
        handler.removeCallbacks(runnable)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        requireActivity().title = "首页"
        articleListAdapter.notifyDataSetChanged()
    }

    override fun onStart() {
        super.onStart()
        startBanner()

    }

    //轮播图
    private fun initBanner() {
        bannerAdapter = BannerAdapter(this)
        val headBannerLayoutManager = LinearLayoutManager(requireContext())
        headBannerLayoutManager.orientation = LinearLayoutManager.VERTICAL
        databinding.headPageBanner.adapter = bannerAdapter
        databinding.headPageBanner.orientation = ViewPager2.ORIENTATION_VERTICAL
        bannerViewModel.fetchData()
    }

    //轮播图下的recyclerView
    private fun initHeadArticleRecyclerView() {
        articleListAdapter = ArticleListAdapter(
            (requireActivity().application as WanAndroidApp).collectArticles.value?:ArrayList(),
            false,
            this
        )
        databinding.headPageRv.adapter = articleListAdapter
        databinding.headPageRv.layoutManager = LinearLayoutManager(requireContext())
        articleViewModel.setUser((requireActivity().application as WanAndroidApp).user.value)
    }

    override fun initView() {

        // 绑定ViewModel
        databinding.articleViewModel = articleViewModel
        databinding.bannerViewModel = bannerViewModel

        // 观察生命周期变更
        databinding.lifecycleOwner = viewLifecycleOwner

        initHeadArticleRecyclerView()
        initBanner()

        articleViewModel.exceptionMSG.observe(this){
            Toast.makeText(this.context, it, Toast.LENGTH_SHORT).show()
        }

        // 响应首页文章列表
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                articleViewModel.articles.collectLatest {
                    articleListAdapter.submitData(it)
                }
            }
        }

        // 响应首页轮播图
        bannerViewModel.banners.observe(viewLifecycleOwner) { bannerList ->
            bannerAdapter.addIt(bannerList)
        }

        (requireActivity().application as WanAndroidApp).user.observe(this){
            articleViewModel.setUser(it)
        }

    }

    override fun onPause() {
        super.onPause()
        stopBanner()
    }

    override fun onBannerClick(url: String) {
        val intentToWebView = Intent(requireContext(),WebViewActivity::class.java)
        intentToWebView.putExtra("url",url)
        startActivity(intentToWebView)
    }

    override fun onArticleItemClick(url: String) {
        val intentToWebView = Intent(requireContext(),WebViewActivity::class.java)
        intentToWebView.putExtra("url",url)
        startActivity(intentToWebView)
    }

    override suspend fun onArticleCollect(article: Article):Boolean{
        return if((requireActivity().application as WanAndroidApp).user.value == null){
            lifecycleScope.launch(Dispatchers.Main){
                Toast.makeText(requireContext(),"收藏失败，请登录.",Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intentToLogin)
            }
            false
        }else{
            if(articleViewModel.collect(article.id)){
                (requireActivity().application as WanAndroidApp).addCollectArticle(article)
                true
            }else{
                false
            }
        }
    }

    override suspend fun onArticleUnCollect(article: Article): Boolean {
        return if((requireActivity().application as WanAndroidApp).user.value == null){
            lifecycleScope.launch(Dispatchers.Main){
                Toast.makeText(requireContext(),"收藏失败，请登录.",Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intentToLogin)
                requireActivity().finish()
            }
            false
        }else{
            if(articleViewModel.uncollect(article.id)){
                (requireActivity().application as WanAndroidApp).removeCollectArticle(article)
                true
            }else{
                false
            }
        }
    }
}
