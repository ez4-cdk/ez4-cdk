package com.delta.playandroidpro.search.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@Dao
interface HistoryDao {
    @Query("SELECT history FROM historyTable WHERE username =:username")
    fun getHistoryByUsername(username: String): String

    @Insert
    fun insertHistory(historyEntity: HistoryTag):Long

    @Update
    fun modifyHistory(historyEntity: HistoryTag):Int

    @Query("SELECT history FROM historyTable WHERE username =:username")
    fun existUserHistory(username:String):String
}