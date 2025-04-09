package com.delta.playandroidpro.collect.bean

import android.util.Log
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder

/**
 * @description 收藏文章数据源
 * @author delta
 * @date 2025/3/3 11:34
 */
class CollectedArticleDataSource(
    val cookie:String
):BasePagingDataSource<Article>(
    {
        try {
            val response = ServiceBuilder.buildService(CollectService::class.java,cookie).getCollectArticles(it)
            Result.success(response.body()?.data?.datas.orEmpty()   )
        }catch (e:Exception){
            Log.d("CollectedArticleDataSource",e.message.toString())
            Result.failure(e)
        }
    }, Article::class.java
)