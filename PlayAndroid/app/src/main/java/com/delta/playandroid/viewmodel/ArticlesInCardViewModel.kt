package com.delta.playandroid.viewmodel

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class ArticlesInCardViewModel @Inject constructor(private val systemRepo: SystemRepo) :BaseViewModel() {
    private var _cid: Int = -1

    lateinit var articles:Flow<PagingData<Article>>
    fun fetchData() {
        articles = systemRepo.getArticlePaging(_cid)
    }
    fun setCid(cid:Int){
        _cid = cid
        fetchData()
    }
}