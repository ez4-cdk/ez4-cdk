package com.delta.playandroidpro.center.system.ui.fragment

import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.system.SystemViewModel
import com.delta.playandroidpro.center.system.ui.adapter.ColumnAdapter
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.databinding.ColumnsBinding

/**
 * @description 知识体系，第二页
 * @author delta
 * @date 2025/2/25 18:30
 */
class Columns : BaseFragment<ColumnsBinding>(R.layout.columns, ColumnsBinding::inflate),
    ColumnAdapter.onColumnClickListener {
    private val viewModel: SystemViewModel by activityViewModels()
    private val columnAdapter by lazy { ColumnAdapter(this) }
    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {

        binding.columnContainer.layoutManager = LinearLayoutManager(requireContext())
        binding.columnContainer.adapter = columnAdapter
        viewModel.getSystemColumn()

        viewModel.systemColumns.observe(viewLifecycleOwner) {
            columnAdapter.addInfo(it)
        }
    }

    override fun onColumnClick(column: Column, position: Int) {
        viewModel.setCurrentColumn(column)
        (parentFragment as? System)?.onExpandColumn(position)
    }
}