package com.delta.playandroidpro.login.room

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @description 用户表
 * @author delta
 * @date 2025/2/4 16:13
 */
@Entity(tableName = "user")
data class UserTag (
    @PrimaryKey
    val username:String,
    val avatar: String?,
    val password:String
)