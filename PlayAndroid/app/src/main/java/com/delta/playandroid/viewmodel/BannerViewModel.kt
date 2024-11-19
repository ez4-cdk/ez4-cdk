package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Banner
import com.delta.playandroid.data.model.repository.HomeRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.delta.playandroid.common.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BannerViewModel @Inject constructor(private val homeRepo: HomeRepo):BaseViewModel() {

    val banners:LiveData<ArrayList<Banner>> get() = homeRepo.banner

    var _exception = MutableLiveData<Exception>()
    val exception:LiveData<Exception> get() = _exception

    init {
        fetchData()
    }
    fun fetchData() {
        viewModelScope.launch(Dispatchers.IO){
            val res = homeRepo.fetchHomeBanners()
            when(res){
                is Result.Error ->{
                    _exception.postValue(Exception("Unable to get banner"))
                }
                is Result.Success ->{

                }
            }
        }
    }
}