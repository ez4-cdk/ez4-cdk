package com.delta.playandroidpro.center

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @description home fragment adapter
 * @author delta
 * @date 2025/2/8 11:05
 */
class CenterAdapter(activity: FragmentActivity, private val fragments:ArrayList<Fragment>) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments.get(position)
}
