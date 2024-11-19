package com.delta.playandroid.data.model.bean.entity

/**
 * 搜索热词
 */

data class Hotkey(
    val id:Int,
    val link:String?,
    val name:String,
    val order:Int,
    val visible:Int
)