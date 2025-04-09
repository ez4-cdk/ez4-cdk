package com.delta.playandroidpro.search.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder


/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class SearchDataSource(
    val key: String
) : BasePagingDataSource<Article>(
    {
        val result = ServiceBuilder.buildService(SearchService::class.java).search(it, key)
        Result.success(result.body()?.data?.datas.orEmpty())
    },Article::class.java
)