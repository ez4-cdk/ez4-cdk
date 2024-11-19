package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.User
import com.delta.playandroid.data.model.repository.HomeRepo
import com.delta.playandroid.data.model.repository.CollectRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.delta.playandroid.common.Result
import kotlinx.coroutines.launch

@HiltViewModel
class ArticleViewModel @Inject constructor(
    private val homeRepo: HomeRepo,
    private val collectRepo: CollectRepo
):BaseViewModel(){
    val articles:Flow<PagingData<Article>> = homeRepo.getArticles()

    private var _exceptionMSG = MutableLiveData<String>()
    val exceptionMSG: LiveData<String> get() = _exceptionMSG
    fun setUser(user: User?){
        homeRepo.setUser(user)
    }

    // 收藏文章
    suspend fun collect(id:Int):Boolean{
        val res = homeRepo.collectInsideArticle(id)
        if (res is Result.Error){
            _exceptionMSG.postValue(res.exception.message)
            return false
        }
        return true
    }

    // 取消收藏
    suspend fun uncollect(id:Int):Boolean{
        val res = homeRepo.unCollectInsideArticle(id)
        if (res is Result.Error){
            _exceptionMSG.postValue(res.exception.message)
            return false
        }
        return true
    }

    fun refreshCollectedArticle(){
        viewModelScope.launch {

        }
    }
}