package com.delta.playandroidpro.center.home.bean

import android.util.Log
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder


/**
 * @description 首页文章的数据源
 * @param loadData 加载数据的方法
 * @param CLASS_TYPE 数据源的类型
 * @author delta
 * @date 2025/2/23 13:01
 */
class ArticleDataSource : BasePagingDataSource<Article>(
    {
        try {
            val response = ServiceBuilder.buildService(HomeService::class.java).article(it)
            Result.success(response.body()!!.data.datas.orEmpty())
        }catch (e:Exception){
            Log.d("ArticleDataSource",e.message.toString())
            Result.failure(e)
        }
    }, Article::class.java
)