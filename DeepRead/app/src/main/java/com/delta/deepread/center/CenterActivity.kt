package com.delta.deepread.center

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.delta.deepread.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class CenterActivity:AppCompatActivity() {

    private lateinit var viewPager:ViewPager2
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.center)

        initView()
    }

    fun switchToDeskBook(){
        bottomNavigationView.selectedItemId = R.id.navigation_book
    }


    private fun initView() {

        // viewpager
        viewPager = findViewById(R.id.content)
        val adapter = ContentAdapter(this)
        viewPager.isUserInputEnabled = false
        viewPager.adapter = adapter

        // bottomNavigationView
        bottomNavigationView = findViewById(R.id.navigation)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.navigation_bookstore -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.navigation_book -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.navigation_music -> {
                    viewPager.currentItem = 2
                    true
                }
                else -> false
            }
        }
    }

}