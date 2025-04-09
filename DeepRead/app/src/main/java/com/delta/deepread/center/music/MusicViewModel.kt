package com.delta.deepread.center.music

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.deepread.center.music.data.Song
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Stack
import kotlin.random.Random

class MusicViewModel:ViewModel() {
    // 暴露给view的数据源
    val songs:LiveData<ArrayList<Song>> get() = _songs
    val currentSong : MutableLiveData<Song?> get() = _currentSong
    val duration : LiveData<Int> get() = _duration
    val isLoop : LiveData<Boolean> get() = _isLoop
    val exception : LiveData<Int> get() = _exception

    // ViewModel私用成员
    private val model = MusicModel()
    companion object {
        const val SEQUENCE_MODE = 0
        const val SHUFFLE_MODE = 1
        const val LIST_CYCLE = 2
        const val SINGLE_CYCLE = 3

        const val NO_SONG_EXCEPTION = -1
    }
    private val _mode = MutableLiveData(SEQUENCE_MODE)
    // 播放队列
    private val _prevStack = Stack<Song>()
    private val _nextStack = Stack<Song>()
    private val _duration = MutableLiveData<Int>()
    private var _currentIndex = -2

    // 暴露给model的容器
    private val _songs = MutableLiveData<ArrayList<Song>>()
    private val _currentSong = MutableLiveData<Song?>()
    private val _isLoop = MutableLiveData(false)
    private val _exception = MutableLiveData<Int>()

    fun writeMP3ToFile(context: Context, song: Song) {
        viewModelScope.launch (Dispatchers.IO){
            model.writeMP3ToFile(context,song)
        }
    }

    fun setLoop(isLoop:Boolean){
        _isLoop.value = isLoop
    }


    fun getAllSongs(context: Context){
        viewModelScope.launch (Dispatchers.IO){
            model.getAllSongs(context,_songs)
            _prevStack.clear()
            _nextStack.clear()
        }
    }

    fun prev(){
        // 如果前一首列表为空，则返回当前歌曲
        if (_prevStack.empty()){
            _currentSong.value = _songs.value!![_currentIndex]
        }else{
            // 如果播放列表不为空，则播放上一首歌曲
            _nextStack.push(_songs.value!![_currentIndex])
            _currentSong.value = _prevStack.pop()
        }
    }

    fun next(){

        if (_songs.value!!.isEmpty()){
            _exception.value = NO_SONG_EXCEPTION
            return
        }

        // 如果后一首列表为空，则根据模式选择新歌
        if (_nextStack.empty()){
            _prevStack.push(_currentSong.value)
            when(_mode.value){
                SEQUENCE_MODE -> {
                    _currentIndex++
                    if (_currentIndex >= _songs.value!!.size){
                        _currentIndex = -1
                        // 顺序播放时，如果播放完毕，返回空值
                        _currentSong.value = null
                        return
                    }
                    _currentSong.value = _songs.value!![_currentIndex]
                }
                SHUFFLE_MODE -> {
                    var nextIndex: Int
                    do {
                        // 随机播放时，生成一个列表内的随机下表
                        nextIndex = Random.nextInt(0, _songs.value!!.size)
                    } while (nextIndex == _currentIndex && _songs.value!!.size > 1)
                    _currentIndex = nextIndex
                    _currentSong.value = _songs.value!![_currentIndex]
                    return
                }
                LIST_CYCLE, SINGLE_CYCLE -> {
                    // 列表循环播放时，如果播放完毕，返回第一首歌曲
                    _currentIndex ++
                    if (_currentIndex >= _songs.value!!.size){
                        _currentIndex = 0
                    }
                    _currentSong.value = _songs.value!![_currentIndex]
                }
            }
        }
    }

    fun setMode(mode: Int){
        _mode.value = mode
    }

    fun addSong(song: Song){
        _songs.value = _songs.value?.apply {
            add(song)
        }
    }

    fun removeSong(context: Context,index: Int){
        _songs.value = _songs.value?.apply {
            removeAt(index)
        }
        model.deleteSong(context, _songs.value!![index])
    }

    fun setCurrentSong(song: Song){
        _currentSong.value = song
    }

    fun loop(){
        _currentSong.value = currentSong.value
    }


}