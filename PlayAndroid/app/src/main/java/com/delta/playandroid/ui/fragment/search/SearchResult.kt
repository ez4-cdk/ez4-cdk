package com.delta.playandroid.ui.fragment.search

import android.content.Intent
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.paging.PagingData
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.databinding.SearchResultRvBinding
import com.delta.playandroid.ui.activity.LoginActivity
import com.delta.playandroid.ui.activity.WebViewActivity
import com.delta.playandroid.ui.adapter.ArticleListAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchResult(
    private val pagingData: PagingData<Article>
):BaseFragment<SearchResultRvBinding>(R.layout.search_result_rv,SearchResultRvBinding::bind),
    ArticleListAdapter.uncollectedClickListener {
    private val resultAdapter:ArticleListAdapter = ArticleListAdapter(false,this)
    override fun initView() {
        databinding.lifecycleOwner = this

        databinding.searchResultRv.layoutManager = LinearLayoutManager(requireContext())
        databinding.searchResultRv.adapter = resultAdapter

        viewLifecycleOwner.lifecycleScope.launch {
            resultAdapter.submitData(pagingData)
        }
    }

    override fun onArticleItemClick(url: String) {
        val intentToWebView = Intent(requireActivity(), WebViewActivity::class.java)
        intentToWebView.putExtra("url", url)
        startActivity(intentToWebView)
    }

    override suspend fun onArticleCollect(id: Int): Boolean {
        return if ((requireActivity().application as WanAndroidApp).user.value == null) {
            lifecycleScope.launch(Dispatchers.Main) {
                Toast.makeText(requireContext(), "收藏失败，请登录.", Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireActivity(), LoginActivity::class.java)
                startActivity(intentToLogin)
            }
            false
        } else {
            // collect
            false
        }
    }

    override suspend fun onArticleUnCollect(id: Int): Boolean {
        return if ((requireActivity().application as WanAndroidApp).user.value == null) {
            lifecycleScope.launch(Dispatchers.Main) {
                Toast.makeText(requireContext(), "收藏失败，请登录.", Toast.LENGTH_SHORT).show()
                val intentToLogin = Intent(requireActivity(), LoginActivity::class.java)
                startActivity(intentToLogin)
            }
            false
        } else {
            // uncollect
            false
        }
    }
}