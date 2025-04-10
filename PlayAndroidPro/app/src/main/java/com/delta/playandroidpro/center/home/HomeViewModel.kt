package com.delta.playandroidpro.center.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.bean.entity.Banner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * @description 首页ViewModel
 * @author delta
 * @date 2025/2/8 16:51
 */
class HomeViewModel : ViewModel() {
    // 暴露给view的数据
    val bannerList :LiveData<List<Banner>> get() = _bannerList
    val articleList :LiveData<Flow<PagingData<Article>>> get() = _articleList
    val exception :LiveData<String> get() = _exception

    // ViewModel私用成员
    private lateinit var homeModel: HomeModel
    private val mutex = Mutex()
    private val cookie:LiveData<String> get() = _cookie
    private val _cookie = MutableLiveData<String>()

    // 暴露给model的数据
    private val _bannerList = MutableLiveData<List<Banner>>()
    private val _articleList = MutableLiveData<Flow<PagingData<Article>>>()
    private val _exception = MutableLiveData<String>()

    fun setCookie(cookie: String) {
        _cookie.value = cookie
        if (!::homeModel.isInitialized){
            homeModel = HomeModel().also {
                it.init(cookie)
            }
        }
    }

    fun getBannerList() {
        viewModelScope.launch(Dispatchers.IO) {
            homeModel.getBannerList(_bannerList)
        }
    }

    fun getArticleList() {
        viewModelScope.launch(Dispatchers.IO) {
            homeModel.getArticleList(_articleList)
        }
    }

    suspend fun collectArticle(article: Article) :Boolean=
        mutex.withLock {
            homeModel.collectArticle(_exception, article)
        }

    suspend fun discollectArticle(article: Article) :Boolean=
        mutex.withLock {
            homeModel.discollectArticle(_exception, article)
        }
}