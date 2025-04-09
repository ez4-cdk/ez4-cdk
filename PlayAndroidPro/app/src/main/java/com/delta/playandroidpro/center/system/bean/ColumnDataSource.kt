package com.delta.playandroidpro.center.system.bean

import android.util.Log
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.ProjectViewModel
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder

/**
 * @description 体系数据标签下的文章
 * @author delta
 * @date 2025/2/26 12:42
 */
class ColumnDataSource(cid: Int) : BasePagingDataSource<Article>(
    {
        try {
            val response =
                ServiceBuilder.buildService(SystemService::class.java).articleUnderDataCid(it, cid)
            Result.success(response.body()?.data?.datas.orEmpty())
        }catch (e:Exception){
            Result.failure(e)
        }
    }, Article::class.java
)