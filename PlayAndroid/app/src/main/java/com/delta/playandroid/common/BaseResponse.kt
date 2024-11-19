package com.delta.playandroid.common

data class BaseResponse<T>(
    val data:T,
    val errorCode:Int,
    val errorMsg:String
)