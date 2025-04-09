package com.delta.deepread.center.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.delta.deepread.center.music.data.Song

@Dao
interface MusicDao {
    @Query("SELECT * FROM DEFAULT_SONG")
    fun getAllSongs():List<Song>

    @Insert
    fun insertSong(song: Song):Long

    @Delete
    fun deleteSong(song: Song):Int

    @Update
    fun updateSong(song: Song):Int
}