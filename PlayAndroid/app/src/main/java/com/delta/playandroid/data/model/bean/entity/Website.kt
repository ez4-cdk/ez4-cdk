package com.delta.playandroid.data.model.bean.entity

/**
 * 常用网站
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