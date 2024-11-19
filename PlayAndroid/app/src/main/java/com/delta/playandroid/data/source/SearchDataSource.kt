package com.delta.playandroid.data.source

import android.util.Log
import com.delta.playandroid.common.BasePagingDataSource
import com.delta.playandroid.data.api.SearchAPI
import com.delta.playandroid.data.model.bean.entity.Article

class SearchDataSource(
    private val searchAPI: SearchAPI,
    private val key: String
) : BasePagingDataSource<Article>({
    Result.runCatching {
        val response = searchAPI.search(it, key)
        if (response.isSuccessful&& response.body()!= null) {
            response.body()?.data?.datas.orEmpty()
        } else {
            Log.d("SearchDataSource",  "exception")
            throw Exception("Network error: ${response.code()} ${response.message()}")
        }
    }
},Article::class.java)