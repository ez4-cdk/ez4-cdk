package com.delta.playandroidpro.search.room

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@Entity(tableName = "historyTable")
data class  HistoryTag (
    @PrimaryKey
    val username:String,
    val history:String
)