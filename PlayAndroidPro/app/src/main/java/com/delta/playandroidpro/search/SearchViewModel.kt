package com.delta.playandroidpro.search

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.search.bean.entity.Hotkey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class SearchViewModel:ViewModel() {
    // 暴露给view的数据
    val hotkey :LiveData<ArrayList<Hotkey>> get() = _hotkey
    val history : LiveData<ArrayList<String>> get() = _history
    val searchResult : StateFlow<PagingData<Article>> get() = _searchResult
    val exception : LiveData<String> get() = _exception

    // ViewModel私用成员
    private val searchModel by lazy { SearchModel() }
    private val mutex = Mutex()
    private val context : LiveData<Context?> get() = _context
    private val user: LiveData<User> get() = _user

    // 暴露给model的数据
    private val _hotkey = MutableLiveData<ArrayList<Hotkey>>()
    private val _context = MutableLiveData<Context?>()
    private val _history = MutableLiveData<ArrayList<String>>()
    private val _searchResult = MutableStateFlow<PagingData<Article>>(PagingData.empty())
    private val _exception = MutableLiveData<String>()
    private val _user = MutableLiveData<User>()

    fun initViewModel(context: Context,user: User){
        if (this.user.value == null || this.context.value == null){
            _context.value = context
            _user.value = user
        }
    }
    fun getHotKey(){
        viewModelScope.launch(Dispatchers.IO) {
            searchModel.fetchHotKey(_hotkey)
        }
    }

    fun getLocalHistory(){
        if (user.value == null||context.value == null) return
        viewModelScope.launch(Dispatchers.IO) {
            searchModel.loadLocalHistory(_history,context,user)
        }
    }

    fun saveLocalHistory(){
        if (user.value == null || context.value == null)return

        // 数据同步到本地
        if (searchModel.checkIfExistsUserHistory(context,user)){
            searchModel.saveLocalHistory(context,user,history,_exception)
        }else{
            searchModel.updateLocalHistory(context,user,history,_exception)
        }
    }

    fun search(key: String) {
        viewModelScope.launch(Dispatchers.IO) {
            searchModel.search(_searchResult, key,this@SearchViewModel)

            // 数据同步到ViewModel
            val currentHistory = history.value ?: mutableListOf()
            val newHistory = ArrayList<String>()
            for(i in 0 until currentHistory.size){
                if (currentHistory[i].equals(key)){
                    currentHistory.removeAt(i)
                    break
                }
            }
            newHistory.add(key)
            newHistory.addAll(currentHistory)
            _history.postValue(newHistory)
        }
    }

    suspend fun collectArticle(article: Article,cookie:String) :Boolean=
        mutex.withLock {
            searchModel.collectArticle(_exception, article,cookie)
        }

    suspend fun discollectArticle(article: Article,cookie:String) :Boolean=
        mutex.withLock {
            searchModel.discollectArticle(_exception, article,cookie)
        }
}

