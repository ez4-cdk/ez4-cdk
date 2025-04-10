package com.delta.playandroidpro.collect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.collect.ui.adapter.CollectAdapter
import com.delta.playandroidpro.collect.ui.fragment.CollectedWebsites
import com.delta.playandroidpro.collect.ui.fragment.CollectedArticles
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * @description 收藏活动
 * @author delta
 * @date 2025/3/3 11:51
 */
class Collect : AppCompatActivity() {
    private lateinit var viewModel: CollectViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.collect)
        initView()
    }

    private fun initView() {

        viewModel = ViewModelProvider(this).get(CollectViewModel::class.java).also {
            it.setCookie((application as PlayAndroidPro).getCookie().toString())
        }

        val collectArticlesFM = CollectedArticles()
        val collectedWebsitesFM = CollectedWebsites()


        val tabVPAdapter = CollectAdapter(this, arrayListOf(collectArticlesFM, collectedWebsitesFM))

        // tablayout
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        // tabVp
        val tabVp = findViewById<ViewPager2>(R.id.tabVP)
        tabVp.adapter = tabVPAdapter
        tabVp.setCurrentItem(intent.getIntExtra("START_PAGE", 0), false)

        TabLayoutMediator(tabLayout, tabVp) { tab, position ->
            tab.text = when (position) {
                0 -> "收藏文章列表"
                1 -> "收藏网站列表"
                else -> ""
            }
        }.attach()

        tabVp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }
}
