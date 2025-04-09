package com.delta.playandroidpro.center.project.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.playandroidpro.common.BaseResponse
import com.delta.playandroidpro.common.Pack
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 项目
 */
interface ProjectService {

    //项目树
    @GET(WebConstant.projectAPI.API_GET_PROJECT_LIST)
    suspend fun projects(
    ):Response<BaseResponse<ArrayList<Column>>>

    @GET(WebConstant.projectAPI.API_GET_PROJECT_ARTICLE)
    suspend fun projectArticle(
        @Path("page") page:Int,
        @Query("cid") cid:Int
    ):Response<BaseResponse<Pack<Article>>>
}