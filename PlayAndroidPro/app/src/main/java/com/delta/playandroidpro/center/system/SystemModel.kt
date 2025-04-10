package com.delta.playandroidpro.center.system

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.delta.playandroidpro.center.system.bean.ColumnDataSource
import com.delta.playandroidpro.center.system.bean.SystemService
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.util.net.ServiceBuilder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @description 体系数据的model
 * @author delta
 * @date 2025/2/25 18:13
 */
class SystemModel {

    private lateinit var netProxy: SystemService
    fun init(cookie: String){
        netProxy = ServiceBuilder.buildService(SystemService::class.java,cookie)
    }

    //获取column的标签
    suspend fun getSystemColumn(systemColumns: MutableLiveData<ArrayList<Column>>) {
        netProxy.data().let {
            if (it.isSuccessful) {
                systemColumns.postValue(it.body()?.data as ArrayList<Column>)
            }
        }
    }

    //加载该标签下的文章
    fun getArticleUnderColumn(viewModel: SystemViewModel,articleFlow: MutableStateFlow<PagingData<Article>>, cid: Int) {
        val pagerFlow = Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = true),
            pagingSourceFactory = { ColumnDataSource(cid,netProxy) }
        ).flow
            .cachedIn(viewModel.viewModelScope)

        viewModel.viewModelScope.launch {
            pagerFlow.collectLatest {
                articleFlow.value = it
            }
        }
    }

    suspend fun collectArticle(_exception: MutableLiveData<String>, article: Article):Boolean{
        netProxy.collectInsideArticle(article.id).let {
            if (it.isSuccessful&&it.body()!=null) {
                if (it.body()?.errorCode == 0){
                    return true
                }else{
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }

    suspend fun discollectArticle(_exception: MutableLiveData<String>, article: Article):Boolean{
        netProxy.unCollectInsideArticle(article.originId).let {
            if (it.isSuccessful&&it.body()!=null) {
                if (it.body()?.errorCode == 0){
                    return true
                }else{
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }
}