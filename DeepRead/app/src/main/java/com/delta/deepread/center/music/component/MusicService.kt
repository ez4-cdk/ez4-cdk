package com.delta.deepread.center.music.component

import android.app.Service
import android.content.Intent
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder
import android.os.PowerManager
import com.delta.deepread.center.music.data.Song


class MusicService: Service() {

    private var mediaPlayer: MediaPlayer? = null

    private var binder = LocalBinder()

    inner class LocalBinder : Binder() {
        fun getService(): MusicService {
            return this@MusicService
        }
    }

    override fun onBind(intent: Intent?): IBinder = binder

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer()
        mediaPlayer!!.setWakeMode(applicationContext, PowerManager.PARTIAL_WAKE_LOCK)
        mediaPlayer!!.setAudioAttributes(
            AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
        )
    }

    fun getMediaPlayer(): MediaPlayer {
        return mediaPlayer!!
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mediaPlayer!!.isPlaying){
            mediaPlayer!!.stop()
        }
        mediaPlayer!!.release()
        mediaPlayer = null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }


    fun pause() {
        if (mediaPlayer!!.isPlaying) {
            mediaPlayer!!.pause()
        }
    }

    fun resume() {
        if (!mediaPlayer!!.isPlaying) {
            mediaPlayer!!.start()
        }
    }


    fun play(song: Song?){

        if (song == null || song.path.isNullOrEmpty()) {
            return
        }else{
            mediaPlayer!!.reset()
            try {
                mediaPlayer!!.setDataSource(song.path)
                mediaPlayer!!.setOnPreparedListener {
                    it.start()
                }
                mediaPlayer!!.prepareAsync()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
