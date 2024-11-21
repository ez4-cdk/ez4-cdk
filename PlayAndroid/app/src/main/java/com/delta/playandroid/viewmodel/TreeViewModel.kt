package com.delta.playandroid.viewmodel

import androidx.paging.PagingData
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import com.delta.playandroid.common.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class TreeViewModel @Inject constructor(private val systemRepo: SystemRepo) :BaseViewModel() {
    private var _cid: Int = -1

    lateinit var articles:Flow<PagingData<Article>>
    fun fetchData() {
        articles = systemRepo.getArticlePaging(_cid)
    }
    fun setCid(cid:Int){
        _cid = cid
        fetchData()
    }

    suspend fun collect(id:Int):Boolean{
        val result = systemRepo.collectArticle(id)
        when(result){
            is Result.Success -> return true
            is Result.Error -> return false
        }
    }

    suspend fun uncollect(id:Int):Boolean{
        val result = systemRepo.unCollectArticle(id)
        when(result){
            is Result.Success -> return true
            is Result.Error -> return false
        }
    }

}