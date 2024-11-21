package com.delta.playandroid.data.model.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.bean.entity.Hotkey
import java.util.LinkedList
import java.util.Queue
import javax.inject.Inject

class SearchRepo @Inject constructor(
    private val apiClient: ApiClient,
    private val dataStoreManager: DataStoreManager
) {
    val apiService = apiClient.getSearchAPI
    companion object{
        @Volatile
        private var instance: SearchRepo? =null
        fun getInstance(apiClient:ApiClient,dataStoreManager: DataStoreManager): SearchRepo {
            return instance ?: synchronized(this){
                instance ?: SearchRepo(apiClient,dataStoreManager).also { instance = it }
            }
        }
    }

    /**
     * 搜索热词
     */
    private var _hotkey = MutableLiveData<ArrayList<Hotkey>>()
    val hotkey: LiveData<ArrayList<Hotkey>> get() = _hotkey
    suspend fun fetchHotKey(): Result<Unit> {
        return try {
            val response = apiService.hotkey()
            if (response.isSuccessful&&response.body()!=null){
                _hotkey.postValue(ArrayList(response.body()!!.data))
                Result.Success(Unit)
            }else{
                Result.Error(Exception(response.errorBody()?.string()))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }





    /**
     * 保存搜索历史
     */
    // TODO: 2022/4/26 存储到本地
    suspend fun saveSearchHistory(): Result<Unit> {
        return try {
            dataStoreManager.saveToDataStore("SEARCH_HISTORY",searchHistory.value.toString())
            Result.Success(Unit)
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    // TODO: 2022/4/26 存储到前台
    fun saveSearchHistory(key:String): Result<Unit> {
        return try {
            val keyList = _searchHistory.value?:ArrayList()
            keyList.removeIf {
                it.equals(key)
            }
            if (keyList.size >= MAX_SEARCH_HISTORY_SIZE){
                keyList.removeAt(MAX_SEARCH_HISTORY_SIZE)
            }
            keyList.add(0,key)
            _searchHistory.postValue(keyList)
            Result.Success(Unit)
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 获取搜索历史
     */
    private val MAX_SEARCH_HISTORY_SIZE = 10
    private var _searchHistory = MutableLiveData<ArrayList<String>>()
    val searchHistory: LiveData<ArrayList<String>> get() = _searchHistory
    suspend fun readSearchHistory(): Result<Unit> {
        return try {
            val result = dataStoreManager.readFromDataStore("SEARCH_HISTORY")
            val keyList =ArrayList<String>()

            if (!result.isNullOrEmpty()) {
                val trimmedResult = result.removeSurrounding("[", "]")
                keyList.addAll(trimmedResult.split(",").map { it.trim() })
            }

            _searchHistory.postValue(keyList)
            Result.Success(Unit)
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    /**
     * 清空搜索历史
     */
    suspend fun clearSearchHistory(): Result<Unit> {
        _searchHistory.postValue(ArrayList())
        return try{
            dataStoreManager.saveToDataStore("SEARCH_HISTORY","")
            Result.Success(Unit)
        }catch (exception:Exception){
            Result.Error(exception)
        }

    }

    /**
     * @Date 2024/11/20
     * @Description 搜索结果的收藏与取消收藏
     */
        suspend fun collectArticle(id:Int):Result<Unit>{
        return try {
            val response = apiService.collectInsideArticle(id)
            if (response.isSuccessful){
                Result.Success(Unit)
            }else{
                Result.Error(Exception("Error in fetching cards data"))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }

    suspend fun unCollectArticle(id:Int):Result<Unit>{
        return try {
            val response = apiService.unCollectInsideArticle(id)
            if (response.isSuccessful){
                Result.Success(Unit)
            }else{
                Result.Error(Exception("Error in fetching cards data"))
            }
        }catch (exception:Exception){
            Result.Error(exception)
        }
    }
}