package com.delta.playandroid.ui.fragment.project

import androidx.fragment.app.viewModels
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.TabAndViewpagerBinding
import com.delta.playandroid.ui.adapter.TabViewpagerAdapter
import com.delta.playandroid.viewmodel.ProjectViewModel
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProjectRoot : BaseFragment<TabAndViewpagerBinding>(R.layout.tab_and_viewpager,TabAndViewpagerBinding::bind) {
    private val projectViewModel:ProjectViewModel by viewModels()
    private lateinit var tabViewpagerAdapter:TabViewpagerAdapter
    override fun initView() {
        databinding.lifecycleOwner = viewLifecycleOwner

        tabViewpagerAdapter = TabViewpagerAdapter(requireActivity())
        databinding.viewpager.adapter = tabViewpagerAdapter

        projectViewModel.fetchData()

        TabLayoutMediator(databinding.tabLayout,databinding.viewpager){tab,position->
            tab.setText(tabViewpagerAdapter.getFragmentTitle(position))
        }.attach()

        projectViewModel.projects.observe(viewLifecycleOwner){
            tabViewpagerAdapter.setUp(it)
        }
    }

    override fun onResume() {
        super.onResume()
        requireActivity().title = "项目"
    }
}