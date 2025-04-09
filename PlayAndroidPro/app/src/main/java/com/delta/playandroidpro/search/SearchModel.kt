package com.delta.playandroidpro.search

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.search.bean.SearchDataSource
import com.delta.playandroidpro.search.bean.SearchService
import com.delta.playandroidpro.search.bean.entity.Hotkey
import com.delta.playandroidpro.search.room.HistoryDataBase
import com.delta.util.net.ServiceBuilder
import com.delta.playandroidpro.search.room.HistoryTag
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:01
 */
class SearchModel {
    suspend fun fetchHotKey(_hotkeys: MutableLiveData<ArrayList<Hotkey>>) {
        val response = ServiceBuilder.buildService(SearchService::class.java).hotkey()
        if (response.isSuccessful && response.body() != null) {
            _hotkeys.postValue(response.body()!!.data as ArrayList<Hotkey>?)
        }
    }

    fun loadLocalHistory(
        _history: MutableLiveData<ArrayList<String>>,
        context: LiveData<Context?>,
        user: LiveData<User>
    ) {
        val historyString = HistoryDataBase
            .getInstance(context.value!!)
            .historyDao()
            .getHistoryByUsername(
                user.value!!.username
            )
        val histories = historyString.split(",").toMutableList() ?: mutableListOf()
        _history.postValue(ArrayList(histories))
    }

    fun saveLocalHistory(
        context: LiveData<Context?>,
        user: LiveData<User>,
        history: LiveData<ArrayList<String>>,
        _exception: MutableLiveData<String>
    ) {
        val result = HistoryDataBase
            .getInstance(context.value!!)
            .historyDao()
            .modifyHistory(
                HistoryTag(
                    user.value!!.username, history.value?.joinToString(",") ?: ""
                )
            )

        if (result == -1) {
            _exception.postValue("保存失败")
        }
    }

    fun checkIfExistsUserHistory(context: LiveData<Context?>, user: LiveData<User>): Boolean {
        val result = HistoryDataBase
            .getInstance(context.value!!)
            .historyDao()
            .getHistoryByUsername(
                user.value!!.username
            )
        if (result.isNotEmpty()) {
            return true
        }
        return false
    }

    fun updateLocalHistory(
        context: LiveData<Context?>,
        user: LiveData<User>,
        history: LiveData<ArrayList<String>>,
        _exception: MutableLiveData<String>
    ) {
        val historyString = history.value?.joinToString(",") ?: ""
        val result = HistoryDataBase
            .getInstance(context.value!!)
            .historyDao()
            .modifyHistory(
                HistoryTag(
                    user.value!!.username, historyString
                )
            )

        if (result == 0) {
            _exception.postValue("更新失败")
        }
    }


    fun search(
        _searchResultFlow: MutableStateFlow<PagingData<Article>>,
        key: String,
        searchViewModel: SearchViewModel
    ) {
        val pagerFlow = Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = true),
            pagingSourceFactory = { SearchDataSource(key) }
        ).flow

        searchViewModel.viewModelScope.launch {
            pagerFlow.collectLatest {
                _searchResultFlow.value = it
            }
        }
    }

    suspend fun collectArticle(
        _exception: MutableLiveData<String>,
        article: Article,
        cookie: String
    ): Boolean {
        ServiceBuilder.buildService(SearchService::class.java, cookie)
            .collectInsideArticle(article.id).let {
            if (it.isSuccessful && it.body() != null) {
                if (it.body()?.errorCode == 0) {
                    return true
                } else {
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }

    suspend fun discollectArticle(
        _exception: MutableLiveData<String>,
        article: Article,
        cookie: String
    ): Boolean {
        ServiceBuilder.buildService(SearchService::class.java, cookie)
            .disCollectInsideArticle(article.id).let {
            if (it.isSuccessful && it.body() != null) {
                if (it.body()?.errorCode == 0) {
                    return true
                } else {
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }
}