package com.delta.playandroidpro.login.room

import MIGRATION_1_2
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.delta.playandroidpro.login.bean.User


/**
 * @description 数据库
 * @author delta
 * @date 2025/2/4 16:12
 */
@Database(entities = [UserTag::class], version = 2, exportSchema = false)
abstract class UserDataBase : RoomDatabase() {
    companion object {
        const val DB_NAME = "USER_DATABASE"
        private var instance: UserDataBase? = null
        fun getInstance(context: Context): UserDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDataBase::class.java,
                    DB_NAME
                )
                    .addMigrations(MIGRATION_1_2)
                    .build()
            }
            return instance!!
        }
    }

    abstract fun userDao(): UserDao
}