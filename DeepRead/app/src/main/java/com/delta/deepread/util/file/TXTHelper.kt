package com.delta.deepread.util.file

import android.content.Context
import android.net.Uri
import android.util.Log
import com.delta.deepread.center.read.bookshelf.data.Novel
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.io.InputStreamReader

object TXTHelper {
    private const val TEXT_DIR_NAME = "sources/text"
    // txt文件操作
    // 根据uri读取文件内容，这里不是阅读模式，阅读模式是根据绝对路径读取
    private fun readTXTFromFile(context: Context, uri: Uri): String? {
        return try {
            val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
            inputStream?.buffered()?.use { input ->
                val bufferedReader = BufferedReader(InputStreamReader(input))
                val stringBuilder = StringBuilder()
                val buffer = CharArray(1000)
                var charsRead: Int

                while (bufferedReader.read(buffer).also { charsRead = it } != -1) {
                    stringBuilder.appendRange(buffer, 0, charsRead)
                }

                stringBuilder.toString()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("IO", "Error reading file: ${e.message}")
            null
        }
    }
    fun deleteFileFromDirectory(context: Context, novel: Novel):Boolean{
        return try {
            val sourcesDirectory = createTXTSourcesDirectory(context)
            if (sourcesDirectory != null){
                val file = File(sourcesDirectory,novel.name!!)
                if (file.exists()){
                    file.delete()
                    true
                }else{
                    Log.d("IO", "Error deleting file: file no exists")
                    false
                }
            }else{
                Log.d("IO", "Error creating sources directory")
                false
            }
        }catch (e:Exception){
            Log.d("IO", "Error deleting file: ${e.message}")
            false
        }
    }
    private fun createTXTSourcesDirectory(context: Context): File? {
        try{
            val sourcesDirectory = File(context.getExternalFilesDir(null), TEXT_DIR_NAME)
            if (!sourcesDirectory.exists()){
                sourcesDirectory.mkdirs()
            }
            return sourcesDirectory
        }catch (e:Exception){
            Log.d("IO", "Error creating sources directory: ${e.message}")
            return null
        }
    }
    fun saveToSourcesDirectory(context: Context, novel: Novel):String?{
        return try {
            val sourcesDirectory = createTXTSourcesDirectory(context)
            if (sourcesDirectory != null) {
                val file = File(sourcesDirectory, novel.name!!)
                if (!file.exists()){
                    FileOutputStream(file).use { outputStream ->
                        readTXTFromFile(context, novel.uri!!)?.let { content ->
                            outputStream.write(content.toByteArray())
                        }
                    }
                    file.absolutePath
                }else{
                    Log.d("IO", "Error saving file: file exists")
                    null
                }
            } else {
                Log.d("IO", "Error creating sources directory")
                null
            }
        } catch (e: Exception) {
            Log.d("IO", "Error saving file: ${e.message}")
            null
        }
    }
    fun readFromSourcesDirectory(context: Context, fileName:String):String?{
        return try {
            val sourcesDirectory = createTXTSourcesDirectory(context)
            if (sourcesDirectory != null){
                val file = File(sourcesDirectory,fileName)
                if (file.exists()){
                    FileInputStream(file).buffered().use {
                        val bufferedReader = BufferedReader(InputStreamReader(it))
                        val stringBuilder = StringBuilder()
                        val buffer = CharArray(1000)
                        var charsRead: Int
                        while (bufferedReader.read(buffer).also { charsRead = it } != -1) {
                            stringBuilder.appendRange(buffer, 0, charsRead)
                        }
                        stringBuilder.toString()
                    }
                }else{
                    Log.d("IO", "Error reading file: file no exists")
                    null
                }
            }else{
                Log.d("IO", "Error creating sources directory")
                null
            }
        }catch (e:Exception){
            Log.d("IO", "Error reading file: ${e.message}")
            null
        }
    }
}