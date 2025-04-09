package com.delta.playandroidpro.collect.ui.fragment

import android.content.Intent
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.ui.adapter.CollectArticlesAdapter
import com.delta.playandroidpro.collect.CollectViewModel
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.CollectFmBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @description 收藏文章页面
 * @author delta
 * @date 2025/3/3 11:36
 */
class CollectedArticles :
    BaseFragment<CollectFmBinding>(R.layout.collect_fm, CollectFmBinding::inflate),
    CollectArticlesAdapter.onArticleClickInterFace {
        private val viewModel:CollectViewModel by activityViewModels()
    private lateinit var adapter: CollectArticlesAdapter
    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        viewModel.initCookie((requireActivity().application as PlayAndroidPro).getCookie().toString())

        adapter = CollectArticlesAdapter(
            (requireActivity().application as PlayAndroidPro).getUser(),
            this
        )

        binding.collectRv.layoutManager = LinearLayoutManager(this.context)
        binding.collectRv.adapter = adapter

        viewModel.collectedArticles.observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                it.collectLatest {
                    adapter.submitData(it)
                }
            }
        }

        viewModel.getCollectedArticles()
    }

    override suspend fun onCollectArticle(article: Article): Boolean {
        return viewModel.collectArticle(article).also {
            if (it) {
                (requireActivity().application as PlayAndroidPro).getUser()?.collectIds?.add(article.originId)
            }
        }
    }

    override suspend fun onDiscollectArticle(article: Article): Boolean {
        return viewModel.disCollectArticle(article).also {
            if (it) {
                (requireActivity().application as PlayAndroidPro).getUser()?.collectIds?.remove(
                    article.originId
                )
            }
        }
    }

    override suspend fun onShowArticleInWeb(article: Article) {
        startActivity(Intent(requireContext(), WebActivity::class.java).apply {
            putExtra(
                "url",
                article.link
            )
        })
    }

    override suspend fun editArticle(article: Article): Boolean =
        viewModel.editArticle(article).also {
            if (!it) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(requireContext(), "修改失败", Toast.LENGTH_SHORT).show()
                }
            }
        }

    override suspend fun addOutsideArticle(article: Article): Boolean =
        viewModel.addCollectArticle(article).also {
            if (it) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(requireContext(), "添加成功", Toast.LENGTH_SHORT).show()
                    adapter.refresh()
                }
            }
        }
}