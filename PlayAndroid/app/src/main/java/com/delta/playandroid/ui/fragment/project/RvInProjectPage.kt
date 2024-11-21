package com.delta.playandroid.ui.fragment.project

import android.content.Intent
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.RvPageBinding
import com.delta.playandroid.ui.activity.WebViewActivity
import com.delta.playandroid.ui.adapter.ProjectListAdapter
import com.delta.playandroid.viewmodel.TreeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RvInProjectPage(
    private val cid: Int
): BaseFragment<RvPageBinding>(R.layout.rv_page, RvPageBinding::bind)
    , ProjectListAdapter.onProjectItemClickListener{
    private val rvViewModel: TreeViewModel by viewModels()

    private lateinit var rvAdapter: ProjectListAdapter
    override fun initView() {
        databinding.articleVM = rvViewModel

        databinding.lifecycleOwner = viewLifecycleOwner

        rvAdapter = ProjectListAdapter(this)

        databinding.rv.adapter = rvAdapter
        databinding.rv.layoutManager = LinearLayoutManager(requireContext())

        rvViewModel.setCid(cid)

        // 响应首页文章列表
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                rvViewModel.articles.collectLatest {
                    rvAdapter.submitData(it)
                }
            }
        }
    }


    override fun onItemClick(url: String) {
        val intentToWebView = Intent(requireContext(), WebViewActivity::class.java)
        intentToWebView.putExtra("url",url)
        startActivity(intentToWebView)
    }
}