package com.delta.playandroidpro.search.ui.fragment

import android.content.Intent
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.SearchResultBinding
import com.delta.playandroidpro.search.SearchViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class SearchResult
    : BaseFragment<SearchResultBinding>(R.layout.search_result, SearchResultBinding::inflate),
    ArticleAdapter.onArticleClickInterFace {
    private val adapter by lazy {
        ArticleAdapter(
            (requireActivity().application as PlayAndroidPro).getUser(),
            this
        )
    }
    private val viewModel :SearchViewModel by activityViewModels()
    private val cookie by lazy {
        (requireActivity().application as PlayAndroidPro).getCookie().toString()
    }

    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        binding.searchResultRv.layoutManager = LinearLayoutManager(this.context)
        binding.searchResultRv.adapter = adapter

        lifecycleScope.launch {
            viewModel.searchResult.collectLatest {
                adapter.submitData(it)
            }
        }
    }

    fun search(text: String) {
        viewModel.search(text)
    }

    override suspend fun onCollectArticle(article: Article): Boolean {
        return viewModel.collectArticle(article, cookie).also {
            if (it){
                (requireActivity().application as PlayAndroidPro).getUser()?.collectIds?.add(article.id)
            }
        }
    }

    override suspend fun onDiscollectArticle(article: Article): Boolean {
        return viewModel.discollectArticle(article, cookie).also {
            if (it){
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