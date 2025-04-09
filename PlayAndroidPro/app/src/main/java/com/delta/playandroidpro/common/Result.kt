package com.delta.playandroidpro.common

/**
 * @description 网络请求的成功与异常，用密封类实现
 * @author delta
 * @date 2025/2/3 11:07
 */
sealed class Result<out T>{
    data class Success<out T>(val data:T):Result<T>()
    data class Error(val exception: Exception):Result<Nothing>()
}