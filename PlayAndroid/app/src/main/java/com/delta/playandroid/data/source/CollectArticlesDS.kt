package com.delta.playandroid.data.source

import com.delta.playandroid.common.BasePagingDataSource
import com.delta.playandroid.data.api.CollectAPI
import com.delta.playandroid.data.model.bean.entity.Article

class CollectArticlesDS(
    private val collectAPI: CollectAPI
):BasePagingDataSource<Article>({
    val response = collectAPI.getCollectArticles(it)
    Result.success(response.body()?.data?.datas.orEmpty()) },
    Article::class.java
)
