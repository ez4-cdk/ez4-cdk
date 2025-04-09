package com.delta.playandroidpro.center.system.ui.fragment

import android.content.Intent
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.system.SystemViewModel
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.ArticlesBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description 标签下文章的界面
 * @author delta
 * @date 2025/2/26 16:15
 */
class Articles : BaseFragment<ArticlesBinding>(R.layout.articles, ArticlesBinding::inflate),
    ArticleAdapter.onArticleClickInterFace {
    private val viewModel: SystemViewModel by activityViewModels()

    private var tabList = ArrayList<String>()
    private val adapter by lazy {
        ArticleAdapter(
            (requireActivity().application as PlayAndroidPro).getUser(),
            this
        )
    }
    private var expandPosition: Int = -1
    private val cookie by lazy {
        (requireActivity().application as PlayAndroidPro).getCookie().toString()
    }

    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {

        binding.tabRv.layoutManager = LinearLayoutManager(this.context)
        binding.tabRv.adapter = adapter

        viewModel.getArticleUnderColumn(viewModel.currentColumn.value!!.children[expandPosition].id)

        // 一级目录下的标签
        viewModel.currentColumn.observe(viewLifecycleOwner) {
            tabList.clear()
            for (column in it.children) {
                tabList.add(column.name)
            }
            setUpTabLayout(tabList)
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.currentArticleList.collectLatest {
                    adapter.submitData(it)
                }
            }
        }

        // 异常处理
        viewModel.exception.observe(this) {
            Toast.makeText(this.context, it, Toast.LENGTH_SHORT).show()
        }

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewModel.getArticleUnderColumn(viewModel.currentColumn.value!!.children[tab?.position!!].id)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun setUpTabLayout(tabList: ArrayList<String>) {
        binding.tabLayout.removeAllTabs()
        for (tab in tabList) {
            binding.tabLayout.addTab(binding.tabLayout.newTab().setText(tab))
        }

        if (expandPosition >= 0 && expandPosition < tabList.size) {
            binding.tabLayout.getTabAt(expandPosition)?.select()
        }
    }

    override suspend fun onCollectArticle(article: Article): Boolean {
        return viewModel.collectArticle(article, cookie)
    }

    override suspend fun onDiscollectArticle(article: Article): Boolean {
        return viewModel.discollectArticle(article, cookie)
    }

    override suspend fun onShowArticleInWeb(article: Article) {
        val intent = Intent(requireContext(), WebActivity::class.java)
        intent.putExtra("url", article.link)
        startActivity(intent)
    }

    fun setExpandPosition(position: Int) {
        expandPosition = position
    }
}