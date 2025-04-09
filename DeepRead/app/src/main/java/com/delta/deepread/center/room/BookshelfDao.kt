package com.delta.deepread.center.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.delta.deepread.center.read.bookshelf.data.Novel

@Dao
interface BookshelfDao {
    @Query("SELECT * FROM DEFAULT_BOOK")
    fun getAllNovels():List<Novel>

    @Insert
    fun insertNovel(novel: Novel): Long

    @Delete
    fun deleteNovel(novel: Novel): Int

    @Update
    fun updateNovel(novel: Novel): Int
}