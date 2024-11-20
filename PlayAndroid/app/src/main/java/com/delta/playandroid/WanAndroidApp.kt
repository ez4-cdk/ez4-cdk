package com.delta.playandroid

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.bean.entity.User
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

    fun setUser(user: User?) {
        _user.postValue(user)
    }

    override fun onCreate() {
        super.onCreate()
        DataStoreManager.getInstance(this)
    }
}
