package com.delta.playandroidpro.search

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.delta.playandroidpro.R
import com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter
import com.delta.playandroidpro.search.ui.fragment.SearchInfo
import com.delta.playandroidpro.search.ui.fragment.SearchResult

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class Search : AppCompatActivity(), SearchInfoAdapter.OnQueryTextClickListener {
    private val searchInfo by lazy { SearchInfo() }
    private val searchResult by lazy { SearchResult() }
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        initView()

        supportFragmentManager.beginTransaction()
            .add(R.id.search_container, searchInfo)
            .add(R.id.search_container, searchResult)
            .hide(searchResult)
            .commit()
    }

    override fun onResume() {
        super.onResume()
        showSearchInfo()
    }

    private fun initView() {
        findViewById<ImageView>(R.id.back).setOnClickListener {
            finish()
        }

        searchView = findViewById(R.id.sv_search)
        searchView.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                showSearchInfo()
            }
        }
        val searchViewListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                showSearchResult()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                showSearchInfo()
                return true
            }
        }
        searchView.setOnQueryTextListener(searchViewListener)

        findViewById<Button>(R.id.btn_action).setOnClickListener {
            searchViewListener.onQueryTextSubmit(searchView.query.toString())
        }
        showSearchInfo()
    }

    private fun showSearchInfo() {
        supportFragmentManager.beginTransaction()
            .show(searchInfo)
            .hide(searchResult)
            .commit()
    }

    private fun showSearchResult() {
        supportFragmentManager.beginTransaction()
            .show(searchResult)
            .hide(searchInfo)
            .commit()
    }

    override fun onSearchTextClick(text: String) {
        searchView.setQuery(text, true)
        searchResult.search(text)
    }

}