package com.delta.deepread

import android.app.Application

class DeepReadApp :Application() {
    companion object{
        private const val TAG = "DeepReadApp"
    }

    override fun onCreate() {
        super.onCreate()

        Thread.setDefaultUncaughtExceptionHandler(CustomExceptionHandler(this))
    }
}