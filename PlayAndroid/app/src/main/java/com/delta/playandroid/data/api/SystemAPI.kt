package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.ArticlePack
import com.delta.playandroid.data.model.bean.entity.Column
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 体系
 */
interface SystemAPI {

    //体系数据
    @GET("/tree/json")
    suspend fun data(
    ):Response<BaseResponse<List<Column>>>

    //体系数据下的文章
    @GET("/article/list/{page}/json")
    suspend fun articleUnderDataCid(
        @Path("page")page:Int,
        @Query("cid")cid:Int, //根据体系数据下的cid查询出来的文章
        @Query("page_size")pageSize:Int?=40 //页数为0~40
    ):Response<BaseResponse<ArticlePack>>

    //根据作者昵称搜索文章
    @GET("/article/list/{page}/json")
    suspend fun findArticleByAuthor(
        @Path("page") page:Int,
        @Query("author") author:String
    ):Response<BaseResponse<ArticlePack>>
}