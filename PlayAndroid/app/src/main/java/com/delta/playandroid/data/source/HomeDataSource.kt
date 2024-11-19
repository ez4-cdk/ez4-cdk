package com.delta.playandroid.data.source

import com.delta.playandroid.common.BasePagingDataSource
import com.delta.playandroid.data.api.HomeAPI
import com.delta.playandroid.data.model.bean.entity.Article

class HomeDataSource(
    private val homeAPI: HomeAPI
): BasePagingDataSource<Article>({
    val response = homeAPI.article(it)
    Result.success(response.body()?.data?.datas.orEmpty())
},Article::class.java)