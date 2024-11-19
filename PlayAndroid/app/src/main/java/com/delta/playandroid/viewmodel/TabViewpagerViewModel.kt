package com.delta.playandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.delta.playandroid.common.BaseViewModel
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TabViewpagerViewModel @Inject constructor(private val systemRepo: SystemRepo):BaseViewModel() {
    var columnId:Int = 0
        set(value){
            field = value
        }
    private var _column = MutableLiveData<Column>()
    val column:LiveData<Column> get() = _column

    fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            _column.postValue(systemRepo.getColumnByColumnId(columnId))
        }
    }
}