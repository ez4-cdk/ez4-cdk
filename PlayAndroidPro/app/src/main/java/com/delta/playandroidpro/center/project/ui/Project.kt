package com.delta.playandroidpro.center.project.ui

import android.content.Intent
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.project.ProjectViewModel
import com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.ProjectsBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class Project : BaseFragment<ProjectsBinding>(R.layout.projects, ProjectsBinding::inflate),
    ProjectAdapter.onProjectItemClickListener {
    private val viewModel by lazy { ProjectViewModel() }
    private val projectAdapter by lazy { ProjectAdapter(this) }
    override fun loading() {
        binding.projectsProgressBar.visibility = View.VISIBLE
    }

    override fun loaded() {
        binding.projectsProgressBar.visibility = View.GONE
    }

    override fun initView() {
        binding.tabRv.layoutManager = LinearLayoutManager(this.context)
        binding.tabRv.adapter = projectAdapter

        viewModel.getProjectList()
        viewModel.projectList.observe(this) {
            viewModel.getArticleUnderColumn(it[0].id)

            // 初始化顶部标签
            for (column in it) {
                binding.tabLayout.addTab(binding.tabLayout.newTab().setText(column.name))
            }
        }
        projectAdapter.addLoadStateListener {
            when (it.refresh) {
                is LoadState.Loading -> {
                    loading()
                }
                is LoadState.NotLoading -> {
                    loaded()
                }
                is LoadState.Error -> {
                }
            }
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.currentArticleList.collectLatest {
                    projectAdapter.submitData(it)
                }
            }
        }


        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewModel.getArticleUnderColumn(viewModel.projectList.value?.get(tab?.position!!)?.id!!)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    override fun onItemClick(url: String) {
        startActivity(Intent(this.context, WebActivity::class.java).apply {
            putExtra("url", url)
        })
    }

    override fun onFirstItemLoaded() {
        loaded()
    }

}