package com.delta.playandroidpro.center.coin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.delta.playandroidpro.center.coin.bean.entity.Coin
import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.playandroidpro.login.bean.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * @description 积分模块VIEWMODEL
 * @author delta
 * @date 2025/3/5 10:45
 */
class CoinViewModel :ViewModel() {
    // 暴露给view的数据
    val user:LiveData<User> get() = _user
    val coinInfo:LiveData<Coin> get() = _coinInfo
    val coinDetail:LiveData<Flow<PagingData<CoinDetail>>> get() = _coinDetail

    // ViewModel私用数据
    private lateinit var coinModel: CoinModel
    val cookie:LiveData<String> get() = _cookie
    private val _cookie = MutableLiveData<String>()

    // 暴露给model的数据
    private val _user = MutableLiveData<User>()
    private val _coinInfo = MutableLiveData<Coin>()
    private val _coinDetail = MutableLiveData<Flow<PagingData<CoinDetail>>>()

    fun setUser(user: User){
        _user.value = user
    }

    fun setCookie(cookie: String){
        _cookie.value = cookie
        if (!::coinModel.isInitialized){
            coinModel = CoinModel().also {
                it.init(cookie)
            }
        }
    }

    fun getCoinInfo() {
        viewModelScope.launch (Dispatchers.IO){
            coinModel.getCoinInfo(_coinInfo)
        }
    }

    fun getCoinDetailInfo() {
        viewModelScope.launch (Dispatchers.IO){
            coinModel.getCoinDetailInfo(_coinDetail)
        }
    }
}