package com.delta.playandroid.data.model.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.bean.entity.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 登录
 * 注册
 */

class LoginRepo @Inject constructor(
    private val apiClient: ApiClient,
    private val dataStoreManager: DataStoreManager
) {

    /**
     * 单例注入
     */
    companion object{
        @Volatile
        private var instance: LoginRepo? =null
        fun getInstance(apiClient: ApiClient,dataStoreManager: DataStoreManager): LoginRepo {
            return instance ?: synchronized(this){
                instance ?: LoginRepo(apiClient,dataStoreManager).also { instance = it }
            }
        }
    }
    // 登录接口
    val apiService = apiClient.getLoginService

    // 序列化类型User
    private val tokenType = object : TypeToken<ArrayList<User>>(){}.type


    /**
     * 登录模块
     */

    // 获取上一次登录的账号
    private var _lastLoginUser = MutableLiveData<User>()
    val lastLoginUser:LiveData<User> get() = _lastLoginUser
    fun readLastLoginUser(){
        CoroutineScope(Dispatchers.IO).launch{
            val usersJson = dataStoreManager.readFromDataStore("LAST_LOGIN_USER")
            val users = if (usersJson != null){
                Gson().fromJson(usersJson,User::class.java)
            }else{
                User("",null,"")
            }
            _lastLoginUser.postValue(users)
        }
    }


    // 登录
    suspend fun Login(username: String, password: String): Result<Unit> {

        val res = apiService.login(username, password)
        return if (res.isSuccessful && res.body() != null) {
            if (res.body()!!.errorCode == 0) {
                Result.Success(Unit)
            } else {
                Result.Error(Exception(res.body()!!.errorMsg))
            }
        } else {
            return Result.Error(Exception(res.errorBody()?.string()))
        }
    }

    // 记入自动登录账号
    fun saveAutoLoginUser(user:User){
        CoroutineScope(Dispatchers.IO).launch{
            val usersJson = dataStoreManager.readFromDataStore("USERS_DATA")
            val users = if (usersJson != null){
                Gson().fromJson(usersJson,tokenType)
            }else{
                ArrayList<User>()
            }
            users.add(user)
            dataStoreManager.saveToDataStore("USERS_DATA",Gson().toJson(users))
        }
    }

    /**
     * 注册模块
     */
    suspend fun signUp(username:String,password:String,repassword:String):Result<Unit>{
        val res = apiService.register(username, password, repassword)
        return if (res.isSuccessful && res.body() != null) {
            if (res.body()!!.errorCode == 0) {
                Result.Success(Unit)
            } else {
                Result.Error(Exception(res.body()!!.errorMsg))
            }
        } else {
            return Result.Error(Exception(res.errorBody()?.string()))
        }

    }

    /**
     * 自动登录模块
     */

    private var _autoLoginUser = MutableLiveData<ArrayList<User>>()
    val autoLoginUser:LiveData<ArrayList<User>> get() = _autoLoginUser

    //读出可以自动登录的账号
    fun readAutoLoginUser(){
        CoroutineScope(Dispatchers.IO).launch{
            val usersJson = dataStoreManager.readFromDataStore("USERS_DATA")
            val users = if (usersJson != null){
                Gson().fromJson(usersJson,tokenType)
            }else{
                ArrayList<User>()
            }
            _autoLoginUser.postValue(users.distinctBy { it.username } as ArrayList<User>?)
        }
    }

    fun saveLastLoginUser(user:User){
        CoroutineScope(Dispatchers.IO).launch {
            dataStoreManager.saveToDataStore("LAST_LOGIN_USER", Gson().toJson(user))
        }
    }
}