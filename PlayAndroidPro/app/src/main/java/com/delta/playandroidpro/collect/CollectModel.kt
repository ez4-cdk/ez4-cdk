package com.delta.playandroidpro.collect

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.bean.entity.Website
import com.delta.playandroidpro.collect.bean.CollectService
import com.delta.playandroidpro.collect.bean.CollectedArticleDataSource
import com.delta.util.net.ServiceBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * @description 收藏模块的model
 * 功能包括：收藏,编辑或取消收藏文章、收藏,编辑或取消收藏网站、查看收藏文章、查看收藏网站
 * @author delta
 * @date 2025/3/3 11:51
 */
class CollectModel {
    fun getCollectedArticles(
        viewModel: CollectViewModel,
        _collectArticles: MutableLiveData<Flow<PagingData<Article>>>,
        cookie: String
    ) {
        _collectArticles.postValue(
            Pager(
                config = PagingConfig(pageSize = 40, enablePlaceholders = true),
                pagingSourceFactory = { CollectedArticleDataSource(cookie) }
            ).flow.cachedIn(viewModel.viewModelScope)
        )
    }

    fun getCollectedWebsites(_collectWebsites: MutableLiveData<ArrayList<Website>>, cookie: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val res = ServiceBuilder.buildService(CollectService::class.java, cookie)
                .getCollectWebs()
            if (res.isSuccessful && res.body()?.errorCode == 0) {
                _collectWebsites.postValue(res.body()?.data)
            }
        }
    }

    suspend fun collectArticle(article: Article, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .collectInsideArticle(article.originId)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun addCollectArticle(article: Article, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .addCollectArticle(article.title, article.link, article.author)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun disCollectArticle(article: Article, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .disCollectInsideArticle(article.id, article.originId)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun editCollectArticle(article: Article, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .editCollectArticle(article.id, article.title, article.link, article.author)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun collectWebsite(website: Website, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .collectWebsite(website.name, website.link)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun disCollectWebsite(website: Website, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .deleteCollectWebsite(website.id)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

    suspend fun editCollectWebsite(website: Website, cookie: String): Boolean {
        val response = ServiceBuilder.buildService(CollectService::class.java, cookie)
            .editCollectWebsite(website.id, website.name, website.link)
        if (response.isSuccessful && response.body()?.errorCode == 0) {
            return true
        }
        return false
    }

}