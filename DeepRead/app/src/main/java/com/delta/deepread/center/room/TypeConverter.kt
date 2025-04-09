package com.delta.deepread.center.room

import android.net.Uri
import androidx.room.TypeConverter
import java.util.Date

class TypeConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?):Date?{
        return value?.let { Date(it) }
    }
    @TypeConverter
    fun dateToTimestamp(date: Date?):Long?{
        return date?.time
    }
    @TypeConverter
    fun fromUriString(value: String?): Uri?{
        return value?.let { Uri.parse(it) }
    }
    @TypeConverter
    fun uriToString(uri: Uri?): String?{
        return uri?.toString()
    }
}