package com.delta.deepread.center.read.bookshelf.data

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DEFAULT_BOOK")
data class Novel(
    @PrimaryKey
    var id:Int ? = -1,
    var name:String ? = "",
    var process:Int ? = 0,
    var uploadTime:String ? = "",
    var path:String ? = "",
    var uri: Uri ?= null,
    var scrollY:Int ?= 0
)