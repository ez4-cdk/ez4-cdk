package com.delta.playandroidpro.center.project.bean.entity

import android.util.Log
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.ProjectService
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder

class ProjectDataSource(
    val cid: Int
) : BasePagingDataSource<Article>(
    {
        try {
            val response =
                ServiceBuilder.buildService(ProjectService::class.java).projectArticle(it,cid)
            Result.success(response.body()?.data?.datas.orEmpty())
        }catch (e:Exception){
            Result.failure(e)
        }
    }, Article::class.java
)