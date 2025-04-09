package com.delta.playandroidpro.login.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.delta.playandroidpro.login.bean.User

/**
 * @description 用户数据访问对象
 * @author delta
 * @date 2025/2/4 16:12
 */
@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAllUser():List<UserTag>

    @Query("SELECT * FROM user WHERE username = :username AND password = :password")
    fun checkValid(username: String, password: String):UserTag?

    @Insert
    fun insertUser(user: UserTag):Long

    @Delete
    fun deleteUser(user: UserTag):Int

    @Update
    fun updateUser(user: UserTag):Int

    @Query("SELECT avatar FROM user WHERE username = :username")
    fun getAvatarByUsername(username: String):String
}