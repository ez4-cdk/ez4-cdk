package com.delta.playandroidpro.center.coin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description 积分活动
 * @author delta
 * @date 2025/3/5 10:45
 */
class CoinActivity:AppCompatActivity() {
    private lateinit var viewModel: CoinViewModel
    private lateinit var adapter: DetailInfoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coin)

        initView()
    }

    private fun initView() {
        viewModel = ViewModelProvider(this).get(CoinViewModel::class.java).also {
            it.setUser((application as PlayAndroidPro).getUser()!!)
            it.setCookie((application as PlayAndroidPro).getCookie().toString())
        }
        adapter = DetailInfoAdapter()
        val rv = findViewById<RecyclerView>(R.id.coin_recyclerview)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
        viewModel.coinDetail.observe(this){
            lifecycleScope.launch {
                it.collectLatest {
                    adapter.submitData(it)
                }
            }
        }
        viewModel.getCoinDetailInfo()
    }
}