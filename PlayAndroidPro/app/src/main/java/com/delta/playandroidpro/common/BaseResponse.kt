package com.delta.playandroidpro.common

/**
 * @description 封装网络请求的返回值
 * @author delta
 * @date 2025/2/3 11:07
 */

data class BaseResponse<T> (
    var errorCode:Int,
    var errorMsg:String,
    var data:T
)