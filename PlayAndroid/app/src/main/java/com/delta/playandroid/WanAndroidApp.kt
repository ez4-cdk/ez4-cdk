package com.delta.playandroid

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltAndroidApp
class WanAndroidApp : Application() {

    private var _user = MutableLiveData<User?>()
    val user:LiveData<User?> get() = _user
    lateinit var dataStoreManager: DataStoreManager

    fun setUser(user: User?) {
        _user.postValue(user)
        readCollectArticles(user!!.username)
    }

    override fun onCreate() {
        super.onCreate()
        dataStoreManager = DataStoreManager.getInstance(this)
    }

    /**
     * @Date 2024/11/20
     * @Description 修复了收藏文章在各个模块之间不同步的bug
     */
    private var _collectArticles = MutableLiveData<ArrayList<Article>>()
    private val tokenType = object : TypeToken<ArrayList<Article>>(){}.type
    val collectArticles:LiveData<ArrayList<Article>> get() = _collectArticles

    fun addCollectArticle(article: Article){
        val currentArticles = collectArticles.value?:ArrayList()
        currentArticles.add(article)
        saveCollectArticles(currentArticles)
        _collectArticles.postValue(currentArticles)
    }

    fun removeCollectArticle(article: Article){
        val currentArticles = collectArticles.value?:ArrayList()
        for (i in currentArticles){
            if (i.id == article.id||i.originId == article.id||i.id == article.originId||i.originId == article.originId){
                currentArticles.remove(i)
                break
            }
        }
        saveCollectArticles(currentArticles)
        _collectArticles.postValue(currentArticles)
    }

    fun readCollectArticles(name:String){
        CoroutineScope(Dispatchers.IO).launch {
            val articleJson = dataStoreManager.readFromDataStore("${name}_COLLECT_ARTICLES")
            val preCollectArticles = if (articleJson!=null) {
                Gson().fromJson(articleJson,tokenType)
            } else {
                ArrayList<Article>()
            }
            _collectArticles.postValue(preCollectArticles)
        }
    }

    fun saveCollectArticles(articles: ArrayList<Article>) {
        CoroutineScope(Dispatchers.IO).launch {
            dataStoreManager.saveToDataStore("${user.value?.username}_COLLECT_ARTICLES",Gson().toJson(articles))
        }
    }
}
