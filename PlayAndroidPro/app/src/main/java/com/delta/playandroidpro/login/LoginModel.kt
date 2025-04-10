package com.delta.playandroidpro.login

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.delta.playandroidpro.login.bean.LoginService
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.login.room.UserDataBase
import com.delta.playandroidpro.login.viewmodel.SignUpViewModel
import com.delta.util.dataStore.DataStoreManager
import com.delta.util.net.ServiceBuilder
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @description 登录model
 * @author delta
 * @date 2025/2/4 17:27
 */
class LoginModel {
    private lateinit var netProxy : LoginService
    private val gson = Gson()
    fun setCookie(cookie: String) {
        netProxy = ServiceBuilder.buildService(LoginService::class.java,cookie)
    }

    suspend fun readLocalAutoLoginUser(_autoLoginUsers: MutableLiveData<ArrayList<User>>, context: Context) {
        withContext(Dispatchers.IO) {
            val result = UserDataBase.getInstance(context).userDao().getAllUser()
            if (result.isNotEmpty()) {
                val userList = ArrayList<User>()
                for (userTag in result){
                    val user = User(
                        username = userTag.username,
                        password = userTag.password,
                        avatar = userTag.avatar.toString(),
                        collectIds = null
                    )
                    userList.add(user)
                }
                _autoLoginUsers.postValue(userList)
            }
        }
    }

    suspend fun login(
        _loginStatus: MutableLiveData<User?>,
        username: String,
        password: String,
        _loginInfo: MutableLiveData<String>,
        _cookie: MutableLiveData<HashSet<String>>
    ) {
        try {
            val response = netProxy.login(username, password)
            if (response.isSuccessful&&response.body()!=null){
                _loginStatus.postValue(
                    User(
                        username = username,
                        password = password,
                        avatar = "",
                        collectIds = response.body()?.data?.collectIds
                    )
                )
                _loginInfo.postValue("登录成功")

                val cookies = response.headers().values("Set-Cookie")
                val cookieSet = HashSet<String>()
                if (cookies.isNotEmpty()){
                    cookies.forEach{
                        cookieSet.add(it)
                    }
                }
                _cookie.postValue(cookieSet)

            }else{
                _loginStatus.postValue(null)
                _loginInfo.postValue(response.body()?.errorMsg)
            }
        }catch (e: Exception){
            _loginStatus.postValue(null)
            _loginInfo.postValue(e.message)
        }
    }

    suspend fun readLastLoginUser(_lastLoginUser: MutableLiveData<User?>, context: Context) {
        withContext(Dispatchers.IO) {
            val result = DataStoreManager.getInstance(context).readFromDataStore("LastLoginUser")
            if (result == null) {
                _lastLoginUser.postValue(null)
            } else {
                val user = gson.fromJson(result, User::class.java)
                _lastLoginUser.postValue(user)
            }
        }
    }

    suspend fun saveLastLoginUser(context: Context, user: User) {
        withContext(Dispatchers.IO) {
            val userJson = gson.toJson(user)
            DataStoreManager.getInstance(context).saveToDataStore("LastLoginUser", userJson)
        }
    }

    suspend fun readAvatar(context: Context, user: User) {
        withContext(Dispatchers.IO){
            try {
                UserDataBase.getInstance(context).userDao().getAvatarByUsername(user.username).let {
                    user.avatar = it
                }
            }catch (e:Exception){
                Log.d("readAvatar",e.message.toString())
            }
        }
    }

}