package com.delta.playandroidpro.center.project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.entity.Column
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * @description 项目ViewModel
 * @author delta
 * @date 2025/2/25 18:14
 */
class ProjectViewModel:ViewModel() {
    // 暴露给view的数据
    val currentArticleList : StateFlow<PagingData<Article>> get() = _currentArticleList
    val projectList: LiveData<ArrayList<Column>> get() = _projectList

    // ViewModel私用成员
    private lateinit var projectModel : ProjectModel
    private val _cookie = MutableLiveData<String>()
    private val cookie :LiveData<String> get() = _cookie

    // 暴露给model的数据
    private val _currentArticleList = MutableStateFlow<PagingData<Article>>(PagingData.empty())
    private val _projectList = MutableLiveData<ArrayList<Column>>()

    fun setCookie(cookie: String) {
        _cookie.value = cookie
        if (!::projectModel.isInitialized){
            projectModel = ProjectModel().also {
                it.init(cookie)
            }
        }
    }

    fun getProjectList() {
        viewModelScope.launch (Dispatchers.IO){
            try {
                projectModel.getProjectCategory(_projectList)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }

    fun getArticleUnderColumn(cid: Int){
        viewModelScope.launch (Dispatchers.IO){
            projectModel.getArticleUnderColumn(this@ProjectViewModel,_currentArticleList,cid)
        }
    }
}