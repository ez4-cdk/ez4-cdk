package com.delta.deepread

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CustomExceptionHandler(
    private val context: Context
) : Thread.UncaughtExceptionHandler {

    companion object{
        private const val TAG = "CustomExceptionHandler"
        private const val EXCEPTION_DIR_NAME = "crash_logs"
    }

    private val defaultHandler: Thread.UncaughtExceptionHandler? = Thread.getDefaultUncaughtExceptionHandler()

    override fun uncaughtException(thread: Thread, throwable: Throwable) {
        // 记录崩溃日志到文件
        logToFile(thread, throwable)

        // 调用默认的异常处理器，让应用崩溃
        defaultHandler?.uncaughtException(thread, throwable)
    }

    private fun logToFile(thread: Thread, throwable: Throwable) {
        try {
            val dir = createExceptionSourcesDirectory(context)
            dir?.let {
               val file = File(it, "crash_log_${System.currentTimeMillis()}.txt")
               FileOutputStream(file).use {
                   it.write(getLogMessage(thread, throwable).toByteArray())
               }
            }
        } catch (e: IOException) {
            e.printStackTrace()
            Log.e("CrashLogger", "Failed to write crash log to file", e)
        }
    }

    private fun createExceptionSourcesDirectory(context: Context): File? {
        try{
            val sourcesDirectory = File(context.getExternalFilesDir(null), EXCEPTION_DIR_NAME)
            if (!sourcesDirectory.exists()){
                sourcesDirectory.mkdirs()
            }
            return sourcesDirectory
        }catch (e:Exception){
            Log.d("IO", "Error creating sources directory: ${e.message}")
            return null
        }
    }

    private fun getLogMessage(thread: Thread, throwable: Throwable): String {
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(Date())
        val sb = StringBuilder()
        sb.append("Timestamp: $timestamp\n")
        sb.append("Thread: ${thread.name}\n")
        sb.append("Exception: ${throwable.message}\n")
        sb.append("Stack Trace:\n")
        for (element in throwable.stackTrace) {
            sb.append("    at ${element.toString()}\n")
        }
        sb.append("\n")
        return sb.toString()
    }
}
