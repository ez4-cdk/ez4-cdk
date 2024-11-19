package com.delta.playandroid.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.repository.CollectRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.Website
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class CollectViewModel @Inject constructor(
    private val collectRepo: CollectRepo
):BaseViewModel(){
    var articles:Flow<PagingData<Article>> = collectRepo.getArticles()
    val websites = collectRepo.collectWebs

    private var _exceptionMSG = MutableLiveData<String>()
    val exceptionMSG: LiveData<String> get() = _exceptionMSG

    // 获取收藏网站列表
    fun getCollectWebs(){
        viewModelScope.launch (Dispatchers.IO){
            val res = collectRepo.getCollectWebs()
            when(res){
                is Result.Error->{
                    _exceptionMSG.postValue(res.exception.message)
                }
                is Result.Success->{
                }
            }
        }
    }

    // 收藏文章
    fun collect(id:Int):Boolean{
        var result = true
        viewModelScope.launch (Dispatchers.IO){
            val res = collectRepo.collectInsideArticle(id)
            when(res){
                is Result.Error->{
                    _exceptionMSG.postValue(res.exception.message)
                    result = false
                }
                is Result.Success->{
                    result = true
                }
            }
        }
        return result
    }

    // 取消收藏
    suspend fun uncollect(id:Int,originId:Int):Boolean{
        val res = collectRepo.unCollectInsideArticle(id,originId)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }

    // 编辑收藏文章
    suspend fun editCollectArticle(id:Int,title:String,link:String,author:String):Boolean{
        val res = collectRepo.editCollectArticle(id,title,link,author)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }

    // 收藏网站
    suspend fun addCollectWebsite(name:String,link:String):Boolean{
        val res = collectRepo.collectWebsite(name,link)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }

    // 添加收藏文章
    suspend fun addCollectArticle(name:String,link:String,author: String):Boolean{
        val res = collectRepo.collectArticle(name,link,author)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }

    // 编辑收藏网站
    suspend fun editCollectWebsite(id:Int,name:String,link:String):Boolean{
        val res = collectRepo.editCollectWebsite(id,name,link)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }

    // 删除收藏网站
    suspend fun deleteCollectWebsite(id:Int):Boolean{
        val res = collectRepo.deleteCollectWebsite(id)
        return when(res){
            is Result.Success -> true
            is Result.Error -> {
                _exceptionMSG.postValue(res.exception.message)
                false
            }
        }
    }
}