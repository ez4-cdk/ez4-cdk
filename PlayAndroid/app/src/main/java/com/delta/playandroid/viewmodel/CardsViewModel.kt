package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.common.Result
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.model.repository.HomeRepo
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 卡片结构的知识体系
 */
@HiltViewModel
class CardsViewModel @Inject constructor(private val systemRepo: SystemRepo):BaseViewModel(){
    val cards: LiveData<ArrayList<Column>> get() = systemRepo.cards

    fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            if(systemRepo.fetchCardsData() is Result.Success){
                //获取卡片成功
            }else{
                //获取卡片数据失败，补充占位符
            }
        }
    }
}