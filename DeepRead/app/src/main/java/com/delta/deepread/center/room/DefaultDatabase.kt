package com.delta.deepread.center.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.delta.deepread.center.read.bookshelf.data.Novel
import com.delta.deepread.center.music.data.Song

@Database(entities = [Novel::class, Song::class], version = 1, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class DefaultDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "DEFAULT_DATABASE"
        private var instance: DefaultDatabase? = null

        fun getInstance(context: Context): DefaultDatabase {
            synchronized(this){
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        DefaultDatabase::class.java,
                        DB_NAME
                    ).build()
                }
                return instance!!
            }
        }
    }

    fun deleteDatabase(context: Context){
        context.deleteDatabase(DB_NAME)
        instance = null
    }

    abstract fun bookstoreDao(): BookshelfDao

    abstract fun musicDao(): MusicDao
}