package com.delta.playandroidpro.collect.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @description 收藏页面的适配器：收藏页面有文章和网站两个tab
 * @author delta
 * @date 2025/3/3 11:34
 */
class CollectAdapter(
    activity: FragmentActivity,
    private val fragments:ArrayList<Fragment>
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}
