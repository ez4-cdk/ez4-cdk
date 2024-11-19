package com.delta.playandroid.ui.fragment.system

import androidx.fragment.app.viewModels
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.TabAndViewpagerBinding
import com.delta.playandroid.ui.adapter.TabViewpagerAdapter
import com.delta.playandroid.viewmodel.TabViewpagerViewModel
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PageInCards(
    private val columnId:Int,
    private val childId:Int
):BaseFragment<TabAndViewpagerBinding>(R.layout.tab_and_viewpager,TabAndViewpagerBinding::bind) {


    private lateinit var viewPagerAdapter: TabViewpagerAdapter
    private val tabViewpagerViewModel:TabViewpagerViewModel by viewModels()


    override fun initView() {
        databinding.lifecycleOwner = viewLifecycleOwner

        viewPagerAdapter = TabViewpagerAdapter(requireActivity())
        databinding.viewpager.adapter = viewPagerAdapter

        tabViewpagerViewModel.columnId = columnId
        tabViewpagerViewModel.fetchData()

        TabLayoutMediator(databinding.tabLayout,databinding.viewpager){tab,position->
            tab.setText(viewPagerAdapter.getFragmentTitle(position))
        }.attach()

        tabViewpagerViewModel.column.observe(viewLifecycleOwner){
            requireActivity().setTitle(it.name)
            viewPagerAdapter.setUp(it)
        }

        viewPagerAdapter.cidMap.observe(viewLifecycleOwner){ cidMap->
            databinding.viewpager.setCurrentItem(cidMap.get(childId)!!,true)
        }

    }

}