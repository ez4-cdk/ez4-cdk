package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.model.repository.ProjectRepo
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProjectViewModel @Inject constructor(private val projectRepo: ProjectRepo):BaseViewModel() {
    val projects:LiveData<ArrayList<Column>> get() = projectRepo.projects
    fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            if(projectRepo.fetchProjectsData() is Result.Success){
                //获取卡片成功
            }else{
                //获取卡片数据失败，补充占位符
            }
        }
    }
}