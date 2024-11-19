package com.delta.playandroid.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.ui.fragment.project.RvInProjectPage
import com.delta.playandroid.ui.fragment.system.RvInPage

class TabViewpagerAdapter(activity:FragmentActivity):FragmentStateAdapter(activity) {
    private var _cidMap = MutableLiveData<HashMap<Int,Int>>()
    val cidMap:LiveData<HashMap<Int,Int>> get() = _cidMap

    fun setUp(column:Column){
        val hashMap = HashMap<Int,Int>()
            for (child in column.children){
                fragmentList.add(RvInPage(child.id))
                fragmentTitleList.add(child.name)
                hashMap.put(child.id,hashMap.size)
            }
        notifyItemInserted(0)
        _cidMap.postValue(hashMap)
    }


    fun setUp(columns:ArrayList<Column>){
        for (column in columns){
            fragmentList.add(RvInProjectPage(column.id))
            fragmentTitleList.add(column.name)
        }
        notifyItemInserted(0)
    }

    var fragmentList = ArrayList<Fragment>()
    var fragmentTitleList = ArrayList<String>()

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment = fragmentList.get(position)

    fun getFragmentTitle(position: Int) = fragmentTitleList.get(position)

}