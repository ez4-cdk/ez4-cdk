package com.delta.playandroid.ui.fragment.collect

import android.app.AlertDialog
import android.content.Intent
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.map
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.data.model.bean.entity.Website
import com.delta.playandroid.databinding.AddCollectWebBinding
import com.delta.playandroid.databinding.RvPageBinding
import com.delta.playandroid.databinding.WebsiteItemBinding
import com.delta.playandroid.ui.activity.WebViewActivity
import com.delta.playandroid.ui.adapter.WebListAdapter
import com.delta.playandroid.viewmodel.CollectViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CollectWebs(
    private val collectViewModel: CollectViewModel
) : BaseFragment<RvPageBinding>(R.layout.rv_page, RvPageBinding::bind),
    WebListAdapter.clickInterface {

    private lateinit var websAdapter: WebListAdapter

    override fun initView() {

        collectViewModel.getCollectWebs()
        collectViewModel.websites.observe(this) {
            websAdapter.submitList(it)
        }

        websAdapter = WebListAdapter(requireContext(),this)

        databinding.rv.layoutManager = LinearLayoutManager(this.context)
        databinding.rv.adapter = websAdapter

    }

    override fun onResume() {
        super.onResume()
        requireActivity().title = "收藏网站"
    }

    override fun onItemClick(url: String) {
        val intentToWebView = Intent(requireContext(), WebViewActivity::class.java)
        intentToWebView.putExtra("url", url)
        startActivity(intentToWebView)
    }

    override suspend fun onWebAdd(title: String, link: String): Boolean
    = collectViewModel.addCollectWebsite(title,link)

    override suspend fun onWebEdit(id: Int, title: String, link: String): Boolean
    = collectViewModel.editCollectWebsite(id,title,link)

    override suspend fun onWebDelete(id: Int): Boolean
    = collectViewModel.deleteCollectWebsite(id)

    override suspend fun onRefresh() {
        collectViewModel.getCollectWebs()
    }
}