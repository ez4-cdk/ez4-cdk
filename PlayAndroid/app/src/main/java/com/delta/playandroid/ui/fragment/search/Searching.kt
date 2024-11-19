package com.delta.playandroid.ui.fragment.search

import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.data.model.bean.entity.Hotkey
import com.delta.playandroid.databinding.SearchSearchingBinding
import com.delta.playandroid.ui.adapter.SearchAdapter
import com.delta.playandroid.viewmodel.SearchViewModel

class Searching(
    private val searchViewModel: SearchViewModel,
    private val onSearchTextClickListener: SearchAdapter.onSearchTextClickListener
):BaseFragment<SearchSearchingBinding>(R.layout.search_searching,SearchSearchingBinding::bind){
    private lateinit var hotkeyAdapter: SearchAdapter<Hotkey>
    private lateinit var historyAdapter: SearchAdapter<String>
    override fun initView() {
        databinding.lifecycleOwner = this
        databinding.searchViewModel = searchViewModel

        searchViewModel.loadHotKey()
        searchViewModel.loadSearchHistory()

        hotkeyAdapter = SearchAdapter(onSearchTextClickListener)
        historyAdapter = SearchAdapter(onSearchTextClickListener)

        // Hotkey  --  cardview
        searchViewModel.hotKey.observe(this) {
            hotkeyAdapter.addInfo(it, databinding.hotkeyCardContainer)
        }

        // SearchHistory  -- cardview
        searchViewModel.searchHistory.observe(this) {
            historyAdapter.addInfo(it, databinding.historyCardContainer)
        }

    }
}