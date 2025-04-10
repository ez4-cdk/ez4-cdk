package com.delta.playandroidpro.login.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.playandroidpro.login.LoginModel
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.login.room.UserDataBase
import com.delta.playandroidpro.login.room.UserTag
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class LoginViewModel(): ViewModel() {
    // 暴露给view的数据
    val lastLoginUser :LiveData<User?> get() = _lastLoginUser
    val loginStatus :LiveData<User?> get() = _loginStatus
    val loginInfo :LiveData<String> get() = _loginInfo
    val autoLoginUser :LiveData<ArrayList<User>> get() = _autoLoginUser
    val cookie :LiveData<HashSet<String>> get() = _cookie

    // ViewModel私用成员
    private lateinit var loginModel: LoginModel
    private var mutex = false


    // 暴露给model的数据
    private val _lastLoginUser = MutableLiveData<User?>()
    private val _loginStatus = MutableLiveData<User?>()
    private val _loginInfo = MutableLiveData<String>()
    private val _autoLoginUser = MutableLiveData<ArrayList<User>>()
    private val _cookie = MutableLiveData<HashSet<String>>()

    fun init(cookie: String) {
        if (!::loginModel.isInitialized){
            loginModel = LoginModel().also {
                it.setCookie(cookie)
            }
        }
    }

    fun loadLastLoginUser(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            loginModel.readLastLoginUser(_lastLoginUser, context)
        }
    }

    fun saveLastLoginUser(context: Context, user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            loginModel.saveLastLoginUser(context, user)
        }
    }

    fun readAvatar(context: Context,user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            loginModel.readAvatar(context, user)
        }
    }

    /**
     * 获取自动登录用户
     */
    suspend fun getAutoLoginUser(context:Context){
        loginModel.readLocalAutoLoginUser(_autoLoginUser,context)
    }

    fun login(username:String, password:String,context: Context,autoLogin:Boolean,rememberPwd:Boolean) {
        if (!mutex){
            mutex = true
            viewModelScope.launch(Dispatchers.IO) {
                loginModel.login(_loginStatus,username, password,_loginInfo, _cookie)
                loginModel.saveLastLoginUser(context, User(username, "", password,null))
                if (autoLogin){
                    UserDataBase.getInstance(context).userDao().insertUser(UserTag(username, "", password))
                }
                if (rememberPwd){
                    loginModel.saveLastLoginUser(context, User(username, "", password,null))
                }
            }
            mutex = false
        }
    }
}