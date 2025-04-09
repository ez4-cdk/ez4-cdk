package com.delta.deepread.util.file

import android.content.Context
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.util.Log
import com.delta.deepread.center.music.data.Song
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

object MP3Helper {
    private const val MUSIC_DIR_NAME = "sources/music"
    private fun createMP3SourcesDirectory(context: Context): File? {
        try{
            val sourcesDirectory = File(context.getExternalFilesDir(null), MUSIC_DIR_NAME)
            if (!sourcesDirectory.exists()){
                sourcesDirectory.mkdirs()
            }
            return sourcesDirectory
        }catch (e:Exception){
            Log.d("IO", "Error creating sources directory: ${e.message}")
            return null
        }
    }

    private fun readMP3FromFile(context: Context, uri: Uri): ByteArray? {
        return try {
            val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
            inputStream?.use { input ->
                val outputStream = ByteArrayOutputStream()
                val buffer = ByteArray(1024)
                var read: Int
                while (input.read(buffer).also { read = it } != -1) {
                    outputStream.write(buffer, 0, read)
                }
                outputStream.toByteArray()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun writeMp3ToFile(context: Context, song: Song): String? {
        return try {
            val file = File(createMP3SourcesDirectory(context), song.name!!)
            FileOutputStream(file).use { fos ->
                fos.write(readMP3FromFile(context, song.uri!!))
            }
            file.absolutePath
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

//    fun readSourceFromDirectory(context: Context, fileName: String):ByteArray?{
//        return try {
//            val file = File(createMP3SourcesDirectory(context), fileName)
//            if (file.exists()){
//                val fileInputStream = FileInputStream(file)
//                val byteArray = ByteArray(file.length().toInt())
//                fileInputStream.read(byteArray)
//                fileInputStream.close()
//                byteArray
//            }else{
//                null
//            }
//        }catch (e:Exception){
//            e.printStackTrace()
//            null
//        }
//    }

    fun getMp3FileSize(context: Context, uri: Uri): Long? {
        return try {
            val file = File(context.getExternalFilesDir(null), MUSIC_DIR_NAME + "/" + getFileNameFromUri(context, uri))
            if (file.exists()) {
                file.length()
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun getMp3Duration(context: Context, uri: Uri): Long? {
        return try {
            val mediaMetadataRetriever = MediaMetadataRetriever()
            mediaMetadataRetriever.setDataSource(context, uri)
            val durationStr = mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
            mediaMetadataRetriever.release()
            durationStr?.toLong()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private fun getFileNameFromUri(context: Context, uri: Uri): String? {
        return try {
            context.contentResolver.query(uri, null, null, null, null)?.use { cursor ->
                val nameIndex = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.DISPLAY_NAME)
                cursor.moveToFirst()
                cursor.getString(nameIndex)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }


}