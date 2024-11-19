package com.delta.playandroid.data.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.source.ArticleInCardItemPagingDataSource
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * 系统模块仓库
 * 卡片数据
 * 卡片数据下的文章 -- paging3
 */
class SystemRepo @Inject constructor(
    private val apiClient: ApiClient
){

    private val apiService = apiClient.getSystemService

    companion object{
        @Volatile
        private var instance: SystemRepo? =null
        fun getInstance(apiClient: ApiClient): SystemRepo {
            return instance ?: synchronized(this){
                instance ?: SystemRepo(apiClient).also { instance = it }
            }
        }

    }

    //卡片里面每个tag tag{cid,name}
    private var _cards = MutableLiveData<ArrayList<Column>>()
    val cards:LiveData<ArrayList<Column>> get() = _cards

    // 获取卡片数据
    suspend fun fetchCardsData(): Result<Unit> {
        return try {
            val response = apiService.data()
            if (response.isSuccessful && response.body() != null) {
                val currentList = _cards.value ?: ArrayList()
                currentList.addAll(response.body()!!.data)
                _cards.postValue(currentList)
                Result.Success(Unit)
            } else {
                Result.Error(Exception("Error in fetching cards data"))
            }
        } catch (exception: Exception) {
            Result.Error(exception)
        }
    }

    //根据columnId查询column
    fun getColumnByColumnId(columnId:Int): Column? {
        val columns = cards.value
        for (column in columns!!){
            if (column.id == columnId){
                return column
            }
        }
        return null
    }

    // 获取指定卡片下的文章列表
    fun getArticlePaging(cid:Int):Flow<PagingData<Article>>{
        return Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = true),
            pagingSourceFactory = {ArticleInCardItemPagingDataSource(apiService,cid)}
        ).flow
    }

}