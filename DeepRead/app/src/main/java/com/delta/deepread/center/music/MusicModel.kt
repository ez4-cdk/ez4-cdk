package com.delta.deepread.center.music

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.delta.deepread.center.music.data.Song
import com.delta.deepread.center.room.DefaultDatabase
import com.delta.deepread.util.file.MP3Helper

class MusicModel {
    fun writeMP3ToFile(context: Context, song: Song) {
        val path = MP3Helper.writeMp3ToFile(context,song)
        song.path = path
        DefaultDatabase.getInstance(context).musicDao().insertSong(song)
    }


    fun getAllSongs(context: Context, _songs: MutableLiveData<ArrayList<Song>>) {
        _songs.postValue(DefaultDatabase.getInstance(context).musicDao().getAllSongs() as ArrayList<Song>)
    }

    fun deleteSong(context: Context, song: Song) {
        DefaultDatabase.getInstance(context).musicDao().deleteSong(song)
    }
}