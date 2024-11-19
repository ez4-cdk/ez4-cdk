package com.delta.playandroid.data.model.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.delta.playandroid.data.api.ApiClient
import javax.inject.Inject
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Website
import com.delta.playandroid.data.source.CollectArticlesDS
import kotlinx.coroutines.flow.Flow

class CollectRepo @Inject constructor(
    private val apiClient: ApiClient
) {
    val apiService = apiClient.getCollectAPI
    companion object{
        @Volatile
        private var instance: CollectRepo? =null
        fun getInstance(apiClient:ApiClient): CollectRepo {
            return instance ?: synchronized(this){
                instance ?: CollectRepo(apiClient).also { instance = it }
            }
        }
    }
    /**
     * 收藏文章列表
     */

    fun getArticles(): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = true),
            pagingSourceFactory = { CollectArticlesDS(apiService) }
        ).flow
    }

    /**
     * 收藏站内文章
     */
    suspend fun collectInsideArticle(id:Int):Result<Unit>{
        return try {
            val response = apiService.collectInsideArticle(id)
            Log.d("CollectRepo",response.body().toString())
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 取消收藏
     */
    suspend fun unCollectInsideArticle(id:Int,originID:Int):Result<Unit>{
        return try {
            val response = apiService.unCollectInsideArticle(id,originID)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 编辑收藏文章
     */
    suspend fun editCollectArticle(id:Int,title:String,link:String,author:String):Result<Unit>{
        return try {
            val response = apiService.editCollectArticle(id,title,link,author)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Log.d("CollectRepo",exception.message.toString())
            Result.Error(exception)
        }
    }

    /**
     * 收藏网址列表
     */

    private var _collectWebs = MutableLiveData<List<Website>>()
    val collectWebs: LiveData<List<Website>> get() = _collectWebs
    suspend fun getCollectWebs():Result<Unit> {
        return try {
            val response = apiService.getCollectWebs()
            if (response.isSuccessful&&response.body()!=null){
                _collectWebs.postValue(response.body()?.data.orEmpty())
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Log.d("CollectRepo",exception.message.toString())
            Result.Error(exception)
        }
    }

    /**
     * 收藏网站
     */
    suspend fun collectWebsite(name:String,link:String):Result<Unit>{
        return try {
            val response = apiService.collectWebsite(name,link)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Log.d("CollectRepo",response.errorBody()?.string().toString())
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Log.d("CollectRepo",exception.message.toString())
            Result.Error(exception)
        }
    }

    /**
     * 收藏文章
     */
    suspend fun collectArticle(name: String,link: String,author: String):Result<Unit>{
        return try {
            val response = apiService.collectArticle(name,link,author)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 编辑收藏网站
     */
    suspend fun editCollectWebsite(id: Int,name:String,link:String):Result<Unit>{
        return try {
            val response = apiService.editCollectWebsite(id,name,link)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 删除收藏网站
     */
    suspend fun deleteCollectWebsite(id: Int):Result<Unit>{
        return try {
            Log.d("CollectRepo","delete id:$id")
            val response = apiService.deleteCollectWebsite(id)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }
}