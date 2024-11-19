package com.delta.playandroid.data.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Banner
import com.delta.playandroid.data.model.bean.entity.User
import com.delta.playandroid.data.source.HomeDataSource
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 *首页
 *文章     article     首页文章用paging实现
 *轮播图    banner     首页banner用LiveData来存储
 */
class HomeRepo @Inject constructor(
    private val apiClient: ApiClient
){

    val apiService = apiClient.getHomeService
    companion object{
        @Volatile
        private var instance: HomeRepo? =null
        fun getInstance(apiClient:ApiClient): HomeRepo {
            return instance ?: synchronized(this){
                instance ?: HomeRepo(apiClient).also { instance = it }
            }
        }
    }

    /**
     * Article
     */
    fun getArticles(): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = true),
            pagingSourceFactory = { HomeDataSource(apiService) }
        ).flow
    }


    /**
     * Banner
     */
    //对外提供只读数据
    val banner:LiveData<ArrayList<Banner>> get() = _banner

    private var _banner = MutableLiveData<ArrayList<Banner>>()

    suspend fun fetchHomeBanners():Result<Unit>{
        return try {
            val response = apiService.banner()
            if(response.isSuccessful&&response.body()!=null){
                val currentList = _banner.value?: ArrayList()
                currentList.addAll(response.body()!!.data)
                _banner.postValue(currentList)
                Result.Success(Unit)
            }else{
                Result.Error(Exception("Error in fetching banner"))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 收藏站内文章
     */
    suspend fun collectInsideArticle(id:Int):Result<Unit>{
        return try {
            val response = apiService.collectInsideArticle(id)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }catch (exception:TimeoutCancellationException){
            Result.Error(Exception("请求超时，请重试."))
        }
    }

    /**
     * 设置用户
     */
    private var _user = MutableLiveData<User>()
    val user:LiveData<User> get() = _user
    fun setUser(user: User?){
        if (user == null)return
        _user.postValue(user!!)
    }

    /**
     * 取消收藏
     */
    suspend fun unCollectInsideArticle(id:Int):Result<Unit>{
        return try {
            val response = apiService.unCollectInsideArticle(id)
            if (response.isSuccessful&&response.body()!=null){
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }catch (exception:TimeoutCancellationException){
            Result.Error(Exception("请求超时，请重试."))
        }
    }
}