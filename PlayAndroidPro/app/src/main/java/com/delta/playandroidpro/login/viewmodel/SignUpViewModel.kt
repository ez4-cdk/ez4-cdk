package com.delta.playandroidpro.login.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.playandroidpro.login.SignUpModel
import com.delta.playandroidpro.login.bean.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class SignUpViewModel : ViewModel() {
    // 暴露给view的数据
    val signUpStatus :LiveData<User?> get() = _signUpStatus
    val signUpInfo :LiveData<String> get() = _signUpInfo
    val cookie : LiveData<HashSet<String>> get() = _cookie

    // ViewModel私用成员
    private lateinit var signupModel :SignUpModel
    private var mutex = false

    // 暴露给model的数据
    private val _signUpStatus = MutableLiveData<User?>()
    private val _signUpInfo = MutableLiveData<String>()
    private val _cookie = MutableLiveData<HashSet<String>>()

    fun init(cookie: String) {
        if (!::signupModel.isInitialized){
            signupModel = SignUpModel().also {
                it.setCookie(cookie)
            }
        }
    }

    fun signUp(username:String,password:String,repassword:String){
        if (!mutex){
            mutex = true
            viewModelScope.launch (Dispatchers.IO){
                signupModel.register(_signUpStatus,_signUpInfo,_cookie,username,password,repassword)
                mutex = false
            }
        }
    }

}