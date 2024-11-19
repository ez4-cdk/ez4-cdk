package com.delta.playandroid.ui.fragment.home

import android.content.Intent
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

    override fun onResume() {
        super.onResume()
        requireActivity().title = "首页"
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
        articleListAdapter = ArticleListAdapter(false,this)
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

    override suspend fun onArticleCollect(id:Int):Boolean{
        return if((requireActivity().application as WanAndroidApp).user.value == null){
            lifecycleScope.launch(Dispatchers.Main){
                Toast.makeText(requireContext(),"收藏失败，请登录.",Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intentToLogin)
            }
            false
        }else{
            articleViewModel.collect(id)
        }
    }

    override suspend fun onArticleUnCollect(id: Int): Boolean {
        return if((requireActivity().application as WanAndroidApp).user.value == null){
            lifecycleScope.launch(Dispatchers.Main){
                Toast.makeText(requireContext(),"收藏失败，请登录.",Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intentToLogin)
            }
            false
        }else{
            articleViewModel.uncollect(id)
        }
    }
}
