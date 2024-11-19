package com.delta.playandroid.viewmodel

import android.graphics.pdf.PdfDocument.Page
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataScope
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Hotkey
import com.delta.playandroid.data.model.repository.SearchRepo
import com.delta.playandroid.data.source.SearchDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import java.util.Queue
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val SearchRepo: SearchRepo) : BaseViewModel() {


    /**
     * 搜索热词
     * hotkey
     */
    val hotKey: LiveData<ArrayList<Hotkey>> get() = SearchRepo.hotkey
    fun loadHotKey() {
        viewModelScope.launch(Dispatchers.IO) {
            SearchRepo.fetchHotKey()
        }
    }


    /**
     * 搜索历史
     * searchHistory
     */
    val searchHistory: LiveData<ArrayList<String>> get() = SearchRepo.searchHistory

    fun loadSearchHistory() {
        viewModelScope.launch(Dispatchers.IO) {
            SearchRepo.readSearchHistory()
        }
    }


    /**
     * 搜索
     * searchResult
     */
    val searchInput = MutableLiveData("")

    // 监听搜索文本变化
    fun onSearchTextChange(newText: String?) {
        searchInput.value = newText
    }

    // 互斥锁
    private var _mutex = Mutex()

    private val _searchResults = MutableStateFlow<PagingData<Article>>(PagingData.empty())
    val searchResults: StateFlow<PagingData<Article>> = _searchResults

    /**
     * 清空历史
     */
    fun cleanHistory() {
        viewModelScope.launch(Dispatchers.IO) {
            SearchRepo.clearSearchHistory()
        }
    }

    suspend fun getSearchResultByPaging(key: String) {
        viewModelScope.launch(Dispatchers.IO){
            Pager(
                config = PagingConfig(
                    pageSize = 20,
                    enablePlaceholders = false
                ),
                pagingSourceFactory = {
                    SearchDataSource(SearchRepo.apiService, key)
                }
            ).flow
                .collectLatest {
                    _searchResults.value = it
                }
        }
    }

    fun search() {
        viewModelScope.launch(Dispatchers.IO) {
            if (_mutex.isLocked) {
                return@launch
            } else {
                _mutex.lock()
                try {
                    val key = searchInput.value

                    if (!key.equals("")) {
                        runBlocking {
                            SearchRepo.saveSearchHistory(key!!)
                        }
                        SearchRepo.saveSearchHistory()
                    }

                    SearchRepo.saveSearchHistory()

                    getSearchResultByPaging(key ?: "")

                } catch (exception: Exception) {
                    exception.printStackTrace()
                } finally {
                    _mutex.unlock()
                }
            }
        }
    }

}