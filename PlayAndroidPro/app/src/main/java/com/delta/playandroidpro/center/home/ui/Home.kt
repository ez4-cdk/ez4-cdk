package com.delta.playandroidpro.center.home.ui

import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.viewpager2.widget.ViewPager2
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.HomeViewModel
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter
import com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.HomeBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description 首页
 * @author delta
 * @date 2025/2/8 16:51
 */
class Home:BaseFragment<HomeBinding>(R.layout.home,HomeBinding::inflate),BannerAdapter.onBannerClick,
    ArticleAdapter.onArticleClickInterFace {
    private lateinit var viewModel: HomeViewModel

    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java).also {
            it.setCookie((requireActivity().application as PlayAndroidPro).getCookie().toString())
        }

        //轮播图
        viewModel.bannerList.observe(this){
            bannerAdapter.setBannerList(it)
        }
        initBanner()

        //首页文章
        viewModel.articleList.observe(this){
            lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED){
                    it.collectLatest {
                        articleAdapter.submitData(it)
                    }
                }
            }
        }
        initArticleList()
    }
    private lateinit var articleAdapter: ArticleAdapter
    private fun initArticleList() {
        viewModel.getArticleList()
        articleAdapter = ArticleAdapter((requireActivity().application as PlayAndroidPro).getUser(),this)
        binding.headPageRv.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(requireContext())
        binding.headPageRv.adapter = articleAdapter
    }

    private lateinit var bannerAdapter: BannerAdapter
    override fun onResume() {
        super.onResume()
        handler.post(bannerRun)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(bannerRun)
    }

    private val handler =Handler(Looper.getMainLooper())
    private val bannerRun= object :Runnable{
        override fun run() {
            binding.headPageBanner.setCurrentItem(
                if(binding.headPageBanner.currentItem <=1){
                    binding.headPageBanner.currentItem+1
                }else{
                    0
                }
            )
            handler.postDelayed(this,3000)
        }
    }

    private fun initBanner() {
        bannerAdapter = BannerAdapter(this)
        binding.headPageBanner.adapter = bannerAdapter
        binding.headPageBanner.orientation =ViewPager2.ORIENTATION_HORIZONTAL
        viewModel.getBannerList()
    }

    override fun onBannerClick(url: String) {
        val intent = Intent(requireContext(), WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    override suspend fun onCollectArticle(article: Article):Boolean =
        viewModel.collectArticle(article).also {
            if (it) {
                (requireActivity().application as PlayAndroidPro).getUser()?.collectIds?.add(article.id)
            }
        }

    override suspend fun onDiscollectArticle(article: Article): Boolean {
        return viewModel.discollectArticle(article).also {
            if (it) {
                (requireActivity().application as PlayAndroidPro).getUser()?.collectIds?.remove(article.id)
            }
        }
    }

    override suspend fun onShowArticleInWeb(article: Article) {
        val intent = Intent(requireContext(), WebActivity::class.java)
        intent.putExtra("url", article.link)
        startActivity(intent)
    }

}