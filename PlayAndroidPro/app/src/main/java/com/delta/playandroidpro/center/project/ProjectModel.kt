package com.delta.playandroidpro.center.project

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.ProjectService
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.playandroidpro.center.project.bean.entity.ProjectDataSource
import com.delta.util.net.ServiceBuilder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description 项目model
 * @author delta
 * @date 2025/2/25 18:14
 */
class ProjectModel {
    suspend fun getProjectCategory(_projectList: MutableLiveData<ArrayList<Column>>) {
        ServiceBuilder.buildService(ProjectService::class.java).projects().let {
            if (it.isSuccessful) {
                _projectList.postValue(it.body()?.data)
            } else {
                _projectList.postValue(ArrayList())
            }
        }
    }

    //加载该标签下的文章
    fun getArticleUnderColumn(
        viewModel: ProjectViewModel,
        _currentArticleList: MutableStateFlow<PagingData<Article>>,
        cid: Int
    ) {
        val pagerFlow = Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = true),
            pagingSourceFactory = { ProjectDataSource(cid) }
        ).flow.cachedIn(viewModel.viewModelScope)

        viewModel.viewModelScope.launch {
            pagerFlow.collectLatest {
                _currentArticleList.value = it
            }
        }
    }
}