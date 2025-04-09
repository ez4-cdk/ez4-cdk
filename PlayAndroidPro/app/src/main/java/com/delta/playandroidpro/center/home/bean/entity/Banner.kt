package com.delta.playandroidpro.center.home.bean.entity

/**
 * @description banner实体
 * @author delta
 * @date 2025/2/8 16:54
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