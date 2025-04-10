package com.delta.playandroidpro.login

import androidx.lifecycle.MutableLiveData
import com.delta.playandroidpro.login.bean.LoginService
import com.delta.playandroidpro.login.bean.User
import com.delta.util.net.ServiceBuilder
import com.google.gson.Gson

class SignUpModel {
    private lateinit var netProxy : LoginService
    private val gson = Gson()
    fun setCookie(cookie: String) {
        netProxy = ServiceBuilder.buildService(LoginService::class.java,cookie)
    }
    suspend fun register(
        _signUpStatus: MutableLiveData<User?>,
        _signUpInfo: MutableLiveData<String>,
        _cookie: MutableLiveData<HashSet<String>>,
        username: String,
        password: String,
        repassword: String
    ) {
        try {
            val response = netProxy.register(username, password, repassword)
            if (response.isSuccessful&&response.body()!=null){
                _signUpStatus.postValue(
                    User(
                        username = username,
                        password = password,
                        avatar = response.body()?.data?.avatar.toString(),
                        collectIds = response.body()?.data?.collectIds
                    )
                )
                _signUpInfo.postValue("注册成功")

                val cookies = response.headers().values("Set-Cookie")
                val cookieSet = HashSet<String>()
                if (cookies.isNotEmpty()){
                    cookies.forEach{
                        cookieSet.add(it)
                    }
                }
                _cookie.postValue(cookieSet)
            }else{
                _signUpStatus.postValue(null)
                _signUpInfo.postValue(response.body()?.errorMsg)
            }
        }catch (e: Exception){
            _signUpStatus.postValue(null)
            _signUpInfo.postValue(e.message)
        }
    }
}