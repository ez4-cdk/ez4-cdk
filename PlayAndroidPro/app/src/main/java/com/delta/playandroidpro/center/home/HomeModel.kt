package com.delta.playandroidpro.center.home

import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.ArticleDataSource
import com.delta.playandroidpro.center.home.bean.HomeService
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.bean.entity.Banner
import com.delta.util.net.ServiceBuilder
import kotlinx.coroutines.flow.Flow

/**
 * @description HomeModel
 * @author delta
 * @date 2025/2/8 16:51
 */
class HomeModel {

    private lateinit var netProxy: HomeService
    fun init(cookie: String){
        netProxy = ServiceBuilder.buildService(HomeService::class.java, cookie)
    }
    suspend fun getBannerList(_banners: MutableLiveData<List<Banner>>) {
        netProxy.banner().let {
            if (it.isSuccessful && it.body() != null) {
               _banners.postValue(it.body()?.data)
            } else {
                _banners.postValue(it.body()?.data.orEmpty())
            }
        }
    }

    fun getArticleList(articlesFlow: MutableLiveData<Flow<PagingData<Article>>>) {
        articlesFlow.postValue(
            Pager(
                config = PagingConfig(pageSize = 40, enablePlaceholders = true),
                pagingSourceFactory = { ArticleDataSource(netProxy) }
            ).flow
        )
    }

    suspend fun collectArticle(
        _exception: MutableLiveData<String>,
        article: Article,
    ): Boolean {
        netProxy.collectInsideArticle(article.id).let {
            if (it.isSuccessful && it.body() != null) {
                if (it.body()?.errorCode == 0) {
                    return true
                } else {
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }

    suspend fun discollectArticle(
        _exception: MutableLiveData<String>,
        article: Article,
    ): Boolean {
            netProxy.unCollectInsideArticle(article.id).let {
            if (it.isSuccessful && it.body() != null) {
                if (it.body()?.errorCode == 0) {
                    return true
                } else {
                    return false
                }
            } else {
                _exception.postValue(it.errorBody()?.string())
                return false
            }
        }
    }
}