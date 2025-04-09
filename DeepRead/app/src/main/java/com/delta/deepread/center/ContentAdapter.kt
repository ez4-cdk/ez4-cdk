package com.delta.deepread.center

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.delta.deepread.center.read.bookshelf.ui.Bookshelf
import com.delta.deepread.center.music.ui.Music
import com.delta.deepread.center.read.desk.ui.Desktop


class ContentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    private val fragments = listOf(Bookshelf(), Desktop(), Music())

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0,1,2 -> fragments[position]
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}