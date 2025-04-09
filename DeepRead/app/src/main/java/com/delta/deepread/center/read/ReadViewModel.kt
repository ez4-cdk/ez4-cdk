package com.delta.deepread.center.read

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delta.deepread.center.read.bookshelf.data.Novel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ReadViewModel : ViewModel() {

    // 暴露给view的数据源
    val novelList : LiveData<ArrayList<Novel>> get() = _novelList
    val desktopNovel : LiveData<String> get() = _deskbook
    val height : LiveData<Int?> get() = _height
    val novel :LiveData<Novel> get() = _novel

    // ViewModel私用成员
    private val model = ReadModel()
    private val _novel = MutableLiveData<Novel>()
    companion object{
        private const val UPLOAD_MODE = 0
        private const val READ_MODE = 1
    }

    // 暴露给model的容器
    private val _novelList = MutableLiveData<ArrayList<Novel>>()
    private val _deskbook = MutableLiveData<String>()
    private val _height = MutableLiveData<Int?>()


    // 新增小说
    fun addNovel(context: Context, novel: Novel){
        viewModelScope.launch (Dispatchers.IO){
            // 保存到资源目录
            model.getNovelContent(context,novel,_deskbook,UPLOAD_MODE)
        }
    }

    // 获取所有小说
    fun getAllNovels(context: Context){
        viewModelScope.launch (Dispatchers.IO){
            model.getAllBooks(context,_novelList)
        }
    }

    // 阅读小说
    fun readNovelContent(context: Context,novel: Novel){
        viewModelScope.launch (Dispatchers.IO){
            _novel.postValue(novel)
            model.getNovelContent(context,novel,_deskbook,READ_MODE)
        }
    }

    /**
     * 小说阅读进度
     */
    fun getHeight(){
        _height.value = _novel.value?.scrollY
    }

    /**
     * 保存阅读进度
     */
    fun saveNovelProcess(context: Context, process: Int, height: Int){
        _novel.value = _novel.value?.apply {
            this.process = process
            this.scrollY = height
        }
        viewModelScope.launch (Dispatchers.IO){
            model.saveNovel(context,_novel.value!!)
        }
    }

    fun deleteNovel(requireContext: Context, novel: Novel) {
        viewModelScope.launch (Dispatchers.IO){
            model.deleteBook(requireContext,novel)
        }
    }
}