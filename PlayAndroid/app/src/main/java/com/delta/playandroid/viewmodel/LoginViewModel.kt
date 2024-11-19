package com.delta.playandroid.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.Result
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.User
import com.delta.playandroid.data.model.repository.LoginRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepo: LoginRepo
) : BaseViewModel() {

    val usnInput = MutableLiveData("")
    val pwdInput = MutableLiveData("")
    val rememberPassword = MutableLiveData(false)
    val autoLogin = MutableLiveData(false)

    val loginStatus: LiveData<User?> get() = _loginStatus
    val loginInfo: LiveData<String> get() = _loginInfo

    private var _loginStatus = MutableLiveData<User?>()
    private var _loginInfo = MutableLiveData<String>()

    private var mutex = false

    fun loadLastLoginUser(lifecycleOwner: LifecycleOwner) {

        loginRepo.readLastLoginUser()
        loginRepo.lastLoginUser.observe(lifecycleOwner) {
            if (it != null) {
                usnInput.value = it.username
                pwdInput.value = it.password
            }
        }
    }

    fun login() {
        if (!mutex){
            mutex = true
            val _username = usnInput.value ?: ""
            val _password = pwdInput.value ?: ""
            val _rememberPassword = rememberPassword.value ?: false
            val _autoLogin = autoLogin.value ?: false
            viewModelScope.launch(Dispatchers.IO) {
                val res = loginRepo.Login(_username, _password)
                when (res) {
                    is Result.Error -> {
                        _loginStatus.postValue(null)
                        _loginInfo.postValue(res.exception.message)
                    }
                    is Result.Success -> {
                        val user = User(usnInput.value?:"",
                            null,
                            password =  if (_rememberPassword){_password}else{""}
                        )
                        runBlocking {

                            // 保存本次登录用户
                            loginRepo.saveLastLoginUser(user)

                            // 记入自动登录
                            if (_autoLogin){
                                loginRepo.saveAutoLoginUser(user)
                            }

                        }
                        _loginStatus.postValue(user)
                    }
                }
            }
            mutex = false
        }
    }
}