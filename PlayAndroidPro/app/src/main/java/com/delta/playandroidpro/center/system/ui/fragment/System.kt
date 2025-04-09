package com.delta.playandroidpro.center.system.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
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

    val columnFM by lazy { Columns() }
    val articleFM by lazy { Articles() }

    override fun loading() {
        // 加载逻辑
    }

    override fun loaded() {
        // 加载完成逻辑
    }

    override fun initView() {
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
