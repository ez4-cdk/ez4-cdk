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

    // ViewModel私用成员
    private val collectModel by lazy { CollectModel() }
    private val articleMutex = Mutex()
    private val websiteMutex = Mutex()
    private val addCollectArticle = Mutex()
    private val cookie:LiveData<String> get()=_cookie

    // 暴露给model的数据
    private val _collectArticles = MutableLiveData<Flow<PagingData<Article>>>()
    private val _collectWebsites = MutableLiveData<ArrayList<Website>>()
    private val _cookie = MutableLiveData<String>()

    fun getCollectedArticles() {
        viewModelScope.launch(Dispatchers.IO) {
            if (cookie.value != null){
                collectModel.getCollectedArticles(this@CollectViewModel,_collectArticles,cookie.value!!)
            }else{
                Log.d("CollectViewModel","cookie is null")
            }
        }
    }

    fun getCollectedWebsites() {
        viewModelScope.launch(Dispatchers.IO) {
            if (cookie.value != null){
                collectModel.getCollectedWebsites(_collectWebsites,cookie.value!!)
            }
        }
    }

    fun initCookie(cookie:String){
        if (this.cookie.value == null){
            _cookie.value = cookie
        }
    }
    suspend fun collectArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.collectArticle(article, cookie.value!!)
        }

    suspend fun disCollectArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.disCollectArticle(article, cookie.value!!)
        }

    suspend fun editArticle(article: Article): Boolean =
        articleMutex.withLock {
            collectModel.editCollectArticle(article, cookie.value!!)
        }

    suspend fun addCollectArticle(article: Article): Boolean =
        addCollectArticle.withLock {
            collectModel.addCollectArticle(article, cookie.value!!)
        }

    suspend fun collectWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.collectWebsite(website, cookie.value!!)
        }

    suspend fun disCollectWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.disCollectWebsite(website, cookie.value!!)
        }

    suspend fun editWebsite(website: Website): Boolean =
        websiteMutex.withLock {
            collectModel.editCollectWebsite(website, cookie.value!!)
        }

}