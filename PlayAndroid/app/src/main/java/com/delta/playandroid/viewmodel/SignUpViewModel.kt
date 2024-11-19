package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.repository.LoginRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.User
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(private val loginRepo: LoginRepo):BaseViewModel() {
    private var _signUpStatus = MutableLiveData<User?>()
    private var _signUpException = MutableLiveData<String>()
    val loginStatus: LiveData<User?> get() = _signUpStatus
    val exceptionMSG: LiveData<String> get() = _signUpException

    val usnInput = MutableLiveData<String>("")
    val pwdInput = MutableLiveData<String>("")
    val rePwdInput = MutableLiveData<String>("")

    private var _mutex = false

    fun signUp(){
        if (!_mutex){
            _mutex = true
            viewModelScope.launch (Dispatchers.IO){
                val username = usnInput.value ?:""
                val password = pwdInput.value ?:""
                val repassword = rePwdInput.value ?:""
                val noPwd = ""

                val res = loginRepo.signUp(username,password,repassword)
                when(res){
                    is Result.Success -> {

                        val user = User(
                            username,null,noPwd
                        )

                        runBlocking {
                            loginRepo.saveLastLoginUser(user)
                        }

                        _signUpStatus.postValue(user)
                    }
                    is Result.Error -> {
                        _signUpStatus.postValue(null)
                        _signUpException.postValue(res.exception.message)
                    }
                }
                _mutex = false
            }
        }
    }

}