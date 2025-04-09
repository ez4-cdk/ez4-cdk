package com.delta.deepread.center.read

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.delta.deepread.center.read.bookshelf.data.Novel
import com.delta.deepread.center.room.DefaultDatabase
import com.delta.deepread.util.file.TXTHelper

class ReadModel {

    fun getNovelContent(
        context: Context,
        novel: Novel,
        _deskbook: MutableLiveData<String>,
        MODE: Int
    ){
        if ( MODE == 0 ){
            //　上传模式
            val path = TXTHelper.saveToSourcesDirectory(context,novel)
            novel.path = path
            DefaultDatabase.getInstance(context).bookstoreDao().insertNovel(novel)
        }else{
            // 阅读模式
            _deskbook.postValue(TXTHelper.readFromSourcesDirectory(context,novel.name!!))
        }
    }

    fun getAllBooks(context: Context, _novelList: MutableLiveData<ArrayList<Novel>>){
       try {
           _novelList.postValue(
               DefaultDatabase.getInstance(context).bookstoreDao().getAllNovels() as ArrayList<Novel>
           )
       }catch (e:Exception){
           Log.d("getAllBooksException:",e.message.toString())
       }
    }

    fun saveNovel(context: Context,value: Novel) {
        try {
            DefaultDatabase.getInstance(context).bookstoreDao().updateNovel(value)
        }catch (e:Exception){
            Log.d("saveNovelException:",e.message.toString())
        }
    }

    fun deleteBook(requireContext: Context, novel: Novel) {
        try {
            DefaultDatabase.getInstance(requireContext).bookstoreDao().deleteNovel(novel)
            TXTHelper.deleteFileFromDirectory(requireContext,novel)
        }catch (e:Exception){
            Log.d("deleteNovelException:",e.message.toString())
        }
    }
}