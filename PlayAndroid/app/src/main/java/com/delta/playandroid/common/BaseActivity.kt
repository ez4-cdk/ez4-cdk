package com.delta.playandroid.common

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.delta.playandroid.R

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var root:FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_childs_root)
        root = findViewById(R.id.root)
        initView()
    }

    abstract fun initView()
}