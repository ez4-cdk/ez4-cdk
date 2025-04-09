package com.delta.deepread.center.music.data

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DEFAULT_SONG")
data class Song (
    @PrimaryKey
    var id:Int ? = -1,
    var name:String ? = "",
    var path:String ? = "",
    var uri: Uri ? = null,
    var duration:Long ? = 0,
    var size:Long ? = 0
)