package com.delta.playandroidpro.collect

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.bean.entity.Website
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * @description 收藏模块的ViewModel
 * @author delta
 * @date 2025/3/3 11:52
 */
class CollectViewModel : ViewModel() {
    // 暴露给view的数据
    val collectedArticles: LiveData<Flow<PagingData<Article>>> get() = _collectArticles
    val collectedWebsites: MutableLiveData<ArrayList<Website>> get() = _collectWebsites
    val exception: MutableLiveData<String> get() = _exception

    // ViewModel私用成员
    private lateinit var collectModel : CollectModel
    private val articleMutex = Mutex()
    private val websiteMutex = Mutex()
    private val addCollectArticle = Mutex()
    private val cookie:LiveData<String> get()=_cookie
    private val _cookie = MutableLiveData<String>()
    private val _exception = MutableLiveData<String>()

    // 暴露给model的数据
    private val _collectArticles = MutableLiveData<Flow<PagingData<Article>>>()
    private val _collectWebsites = MutableLiveData<ArrayList<Website>>()

    fun setCookie(cookie: String){
        _cookie.value = cookie
        if (!::collectModel.isInitialized){
            collectModel = CollectModel().also {
                it.init(cookie)
            }
        }
    }

    fun getCollectedArticles() {
        viewModelScope.launch(Dispatchers.IO) {
            if (cookie.value != null){
                collectModel.getCollectedArticles(this@CollectViewModel,_collectArticles)
            }else{
                _exception.postValue("请先登录.")
            }
        }
    }

    fun getCollectedWebsites() {
        viewModelScope.launch(Dispatchers.IO) {
            if (cookie.value != null){
                collectModel.getCollectedWebsites(_collectWebsites)
            }else{
                _exception.postValue("请先登录.")
            }
        }
    }

    suspend fun collectArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.collectArticle(article)
        }

    suspend fun disCollectArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.disCollectArticle(article)
        }

    suspend fun editArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.editCollectArticle(article)
        }

    suspend fun addCollectArticle(article: Article): Boolean =
        addCollectArticle.withLock {
            collectModel.addCollectArticle(article)
        }

    suspend fun collectWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.collectWebsite(website)
        }

    suspend fun disCollectWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.disCollectWebsite(website)
        }

    suspend fun editWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.editCollectWebsite(website)
        }

}