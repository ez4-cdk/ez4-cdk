package com.delta.playandroidpro.search.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@Database(entities = [HistoryTag::class], version = 1, exportSchema = false)
abstract class HistoryDataBase :RoomDatabase(){
    companion object {
        const val DB_NAME = "HISTORY_DATABASE"
        private var instance:HistoryDataBase ?=null
        fun getInstance(context:Context): HistoryDataBase{
            if (instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    HistoryDataBase::class.java,
                    DB_NAME
                ).build()
            }

            return instance!!
        }
    }
    abstract fun historyDao():HistoryDao
}