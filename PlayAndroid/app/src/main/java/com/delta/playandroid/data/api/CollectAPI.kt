package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.ArticlePack
import com.delta.playandroid.data.model.bean.entity.Website
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CollectAPI {

    @GET("/lg/collect/usertools/json")
    suspend fun getCollectWebs(
    ): Response<BaseResponse<ArrayList<Website>>>

    @POST("/lg/collect/{id}/json")
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    @GET("/lg/collect/list/{page}/json")
    suspend fun getCollectArticles(
        @Path("page") page:Int
    ): Response<BaseResponse<ArticlePack>>

    @POST("/lg/uncollect/{id}/json")
    @FormUrlEncoded
    suspend fun unCollectInsideArticle(
        @Path("id") id:Int,
        @Field("originId") originId:Int
    ): Response<BaseResponse<ArticlePack>>

    // 编辑收藏文章
    @POST("/lg/collect/user_article/update/{id}/json")
    @FormUrlEncoded
    suspend fun editCollectArticle(
        @Path("id") id:Int,
        @Field("title")title:String,
        @Field("link")link:String,
        @Field("author")author:String
    ): Response<BaseResponse<Any>>

    @POST("/lg/collect/addtool/json")
    @FormUrlEncoded
    suspend fun collectWebsite(
        @Field("name")title:String,
        @Field("link")link:String
    ):Response<BaseResponse<Any>>

    @POST("/lg/collect/add/json")
    @FormUrlEncoded
    suspend fun collectArticle(
        @Field("title")title:String,
        @Field("link")link:String,
        @Field("author")author: String
    ):Response<BaseResponse<Any>>

    @POST("/lg/collect/updatetool/json")
    @FormUrlEncoded
    suspend fun editCollectWebsite(
        @Field("id")id:Int,
        @Field("name")name:String,
        @Field("link")link:String
    ):Response<BaseResponse<Any>>

    @POST("/lg/collect/deletetool/json")
    @FormUrlEncoded
    suspend fun deleteCollectWebsite(
        @Field("id")id:Int
    ):Response<BaseResponse<Any>>
}