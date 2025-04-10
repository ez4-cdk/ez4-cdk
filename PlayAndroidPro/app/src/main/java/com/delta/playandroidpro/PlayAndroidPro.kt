package com.delta.playandroidpro

import android.app.Application
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.login.room.UserDataBase
import com.delta.playandroidpro.login.room.UserTag

/**
 * @description PlayAndroidPro APP
 * @author delta
 * @date 2025/1/18 15:39
 */
class PlayAndroidPro:Application() {

    private var cookie:HashSet<String>?=null
    private var user:User?=null
    fun getUser(): User? {
        return user
    }
    fun setUser(user: User?) {
        this.user = user
    }
    fun getCookie(): HashSet<String>? {
        return if (cookie == null){
            HashSet()
        }else{
            cookie
        }
    }

    fun setCookie(cookie: HashSet<String>) {
        this.cookie = cookie
    }

    fun saveUser() {
        UserDataBase.getInstance(this).userDao().updateUser(UserTag(
            user?.username?: "",
            user?.avatar?: "",
            user?.password?: ""
        ))
    }


}