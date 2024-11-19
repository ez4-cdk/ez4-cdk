package com.delta.playandroid.data.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.model.bean.entity.Column
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * 项目结构，不包含结构内部的项目
 */

class ProjectRepo @Inject constructor(
    private val apiClient: ApiClient
){

    private val apiService = apiClient.getProjectService

    companion object{
        @Volatile
        private var instance:ProjectRepo ?=null

        fun getInstance(apiClient: ApiClient):ProjectRepo{
            return instance?: synchronized(this){
                return instance?: ProjectRepo(apiClient).also { instance = it }
            }
        }
    }

    //项目,结构跟column一致
    private var _projects = MutableLiveData<ArrayList<Column>>()
    val projects: LiveData<ArrayList<Column>> get() = _projects

    suspend fun fetchProjectsData(): Result<Unit> {
        return try {
            val response = apiService.projects()
            if (response.isSuccessful && response.body() != null) {
                val currentList = _projects.value ?: ArrayList()
                currentList.addAll(response.body()!!.data)
                _projects.postValue(currentList)
                Result.Success(Unit)
            } else {
                Result.Error(Exception("Error in fetching cards data"))
            }
        } catch (exception: Exception) {
            Result.Error(exception)
        }
    }
}