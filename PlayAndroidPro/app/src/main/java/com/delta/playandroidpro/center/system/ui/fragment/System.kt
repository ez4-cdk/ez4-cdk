package com.delta.playandroidpro.center.system.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.system.SystemViewModel
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.databinding.FrameRootBinding

/**
 * @description 初始页面为标签页面，点击展开标签下的文章
 * @author delta
 * @date 2025/2/26 16:14
 */
class System : BaseFragment<FrameRootBinding>(R.layout.frame_root, FrameRootBinding::inflate) {
    private lateinit var viewModel: SystemViewModel
    private lateinit var columnFM: Columns
    private lateinit var articleFM: Articles

    override fun loading() {
        // 加载逻辑
    }

    override fun loaded() {
        // 加载完成逻辑
    }

    override fun initView() {

        viewModel = ViewModelProvider(this).get(SystemViewModel::class.java).also {
            it.setCookie((requireActivity().application as PlayAndroidPro).getCookie().toString())
        }

        columnFM = Columns()
        articleFM = Articles()

        childFragmentManager.beginTransaction()
            .add(R.id.root, columnFM)
            .commit()
    }

    fun onExpandColumn(position: Int) {
        articleFM.setExpandPosition(position)
        childFragmentManager.beginTransaction()
            .replace(R.id.root, articleFM)
            .addToBackStack(null)
            .commit()
    }
}
