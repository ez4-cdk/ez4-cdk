package com.delta.playandroid.data.model.bean.entity

import javax.inject.Inject

/**
 * 首页banner
 */
data class Banner (
    val desc:String,
    val id:Int,
    val isVisible:Int,
    val order:Int,
    val type:Int,
    val imagePath:String,
    val title:String,
    val url:String
)