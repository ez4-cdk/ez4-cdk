package com.delta.playandroid.data.source

import com.delta.playandroid.common.BasePagingDataSource
import com.delta.playandroid.data.api.SystemAPI
import com.delta.playandroid.data.model.bean.entity.Article

class CardsArticleDS(
    private val systemAPI: SystemAPI,
    private val cid:Int
):BasePagingDataSource<Article>({
    val response = systemAPI.articleUnderDataCid(it,cid)
    Result.success(response.body()?.data?.datas.orEmpty())
},Article::class.java)