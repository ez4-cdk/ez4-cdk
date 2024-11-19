package com.delta.playandroid.viewmodel

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.bean.entity.User
import com.delta.playandroid.data.model.repository.LoginRepo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject

@HiltViewModel
class FastLoginViewModel @Inject constructor(
    private val loginRepo: LoginRepo
):BaseViewModel() {

    init {
        loginRepo.readAutoLoginUser()
    }

    private var _loginMutex = Mutex()

    val autoLoginUser:LiveData<ArrayList<User>> get() = loginRepo.autoLoginUser

    private var _loginStatus = MutableLiveData<User?>()
    private var _loginException = MutableLiveData<String>()
    val loginStatus:LiveData<User?> get() = _loginStatus
    val loginException:LiveData<String> get() = _loginException

    fun login(position:Int){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                if (_loginMutex.isLocked){
                    _loginException.postValue("登录已受理中,请勿重复操作.")
                    return@launch
                }
                _loginMutex.withLock{
                    val user = autoLoginUser.value?.get(position)
                    val res = loginRepo.Login(user?.username!!,user.password)
                    if (res is Result.Success) {
                        loginRepo.saveLastLoginUser(user)
                        _loginStatus.postValue(user)
                    }else{
                        _loginStatus.postValue(null)
                        _loginException.postValue("账号与密码不匹配.")
                    }
                }
            }catch (e:Exception){
                _loginException.postValue("登录失败,${e.message}")
            }
        }
    }

}