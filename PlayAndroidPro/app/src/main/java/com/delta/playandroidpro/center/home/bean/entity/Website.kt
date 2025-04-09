package com.delta.playandroidpro.center.home.bean.entity

/**
 * @description website
 * @author delta
 * @date 2025/2/8 16:54
 */
data class Website @JvmOverloads constructor(
    val category:String ="",
    val icon:String ="",
    val id:Int = -1,
    var link:String ="",
    var name:String ="",
    val order:Int =-1,
    val visible:Int =-1
)