package com.delta.playandroidpro.collect.ui.fragment

import android.content.Intent
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Website
import com.delta.playandroidpro.collect.CollectViewModel
import com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.common.WebActivity
import com.delta.playandroidpro.databinding.CollectFmBinding

/**
 * @description 收藏网站页面
 * @author delta
 * @date 2025/3/3 11:51
 */
class CollectedWebsites: BaseFragment<CollectFmBinding>(R.layout.collect_fm, CollectFmBinding::inflate),
    CollectWebsitesAdapter.onWebsiteOperationsInterFace {
    private lateinit var adapter: CollectWebsitesAdapter
    private val viewModel:CollectViewModel by activityViewModels()
    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        viewModel.initCookie((requireActivity().application as PlayAndroidPro).getCookie().toString())

        adapter = CollectWebsitesAdapter(this)

        binding.collectRv.layoutManager = LinearLayoutManager(this.context)
        binding.collectRv.adapter = adapter

        viewModel.collectedWebsites.observe(this){
            adapter.setWebsiteList(it)
        }

        viewModel.getCollectedWebsites()
    }

    override suspend fun onCollectWebsite(website: Website): Boolean {
        return viewModel.collectWebsite(website)
    }

    override suspend fun onDiscollectWebsite(website: Website): Boolean {
        return viewModel.disCollectWebsite(website)
    }

    override fun onShowWebContents(website: Website) {
        startActivity(Intent(requireActivity(),WebActivity::class.java).apply { putExtra("url",website.link) })
    }

    override suspend fun onEditWebsite(website: Website): Boolean =
        viewModel.editWebsite(website)

    override suspend fun onReloadData() {
        viewModel.getCollectedWebsites()
    }
}