
package com.delta.playandroidpro.login.bean

/**
 * 用户{收藏板块}
 */
data class User(
    val username:String,
    var avatar: String,
    val password:String,
    val collectIds:ArrayList<Int>?
)