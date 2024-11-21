package com.delta.playandroid.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.delta.playandroid.R
import com.delta.playandroid.databinding.CollectRootBinding
import com.delta.playandroid.ui.adapter.ViewpagerAdapter
import com.delta.playandroid.ui.fragment.collect.CollectArticles
import com.delta.playandroid.ui.fragment.collect.CollectWebs
import com.delta.playandroid.viewmodel.CollectViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CollectActivity:AppCompatActivity(){

    private lateinit var binding:CollectRootBinding
    private lateinit var fragmentsAdapter:ViewpagerAdapter
    private val collectViewModel: CollectViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.collect_root)

        initView()
    }

    private fun initView() {
        val fragments = arrayListOf<Fragment>(
            CollectArticles(collectViewModel),
            CollectWebs(collectViewModel)
        )
        fragmentsAdapter = ViewpagerAdapter(this, fragments)
        binding.viewpager.adapter = fragmentsAdapter

        binding.viewpager.setCurrentItem(intent.getIntExtra("START_PAGE",0),false)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // 处理返回按钮点击事件
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}