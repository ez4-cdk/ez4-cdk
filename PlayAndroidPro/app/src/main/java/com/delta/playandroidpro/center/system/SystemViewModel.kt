package com.delta.playandroidpro.center.system

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.playandroidpro.center.system.ui.fragment.Columns
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * @description 体系数据ViewModel
 * @author delta
 * @date 2025/2/25 18:13
 */
class SystemViewModel:ViewModel() {
    // 暴露给view的数据
    val systemColumns : LiveData<ArrayList<Column>> get() = _systemColumns
    val exception : LiveData<String> get() = _exception
    val currentColumn : LiveData<Column> get() = _currentColumn
    val currentArticleList : StateFlow<PagingData<Article>> get() = _currentArticleList

    // ViewModel私用成员
    private lateinit var systemModel: SystemModel
    private val mutex = Mutex()
    private val _cookie = MutableLiveData<String>()
    private val cookie :LiveData<String> get() = _cookie

    // 暴露给model的成员变量
    private val _systemColumns = MutableLiveData<ArrayList<Column>>(arrayListOf())
    private val _currentArticleList = MutableStateFlow<PagingData<Article>>(PagingData.empty())
    private val _currentColumn = MutableLiveData<Column>()
    private val _exception = MutableLiveData<String>()

    fun setCookie(cookie: String){
        _cookie.value = cookie
        if (!::systemModel.isInitialized){
            systemModel = SystemModel().also {
                it.init(cookie)
            }
        }
    }

    fun getSystemColumn() {
        viewModelScope.launch (Dispatchers.IO){
            systemModel.getSystemColumn(_systemColumns)
        }
    }

    fun setCurrentColumn(column: Column){
        _currentColumn.value = column
    }

    fun getArticleUnderColumn(cid: Int){
        viewModelScope.launch (Dispatchers.IO){
            systemModel.getArticleUnderColumn(this@SystemViewModel,_currentArticleList,cid)
        }
    }

    suspend fun collectArticle(article: Article) :Boolean=
        mutex.withLock {
            systemModel.collectArticle(_exception, article)
        }

    suspend fun discollectArticle(article: Article) :Boolean=
        mutex.withLock {
            systemModel.discollectArticle(_exception, article)
        }
}