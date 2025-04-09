package com.delta.playandroidpro.search.bean.entity

/**
 * 搜索热词
 */

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
data class Hotkey(
    val id:Int,
    val link:String?,
    val name:String,
    val order:Int,
    val visible:Int
)