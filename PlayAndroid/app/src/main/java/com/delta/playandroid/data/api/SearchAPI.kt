package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.ArticlePack
import com.delta.playandroid.data.model.bean.entity.Hotkey
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * 搜索
 */
interface SearchAPI {

    //搜索热词 这里本来URL是https://www.wanandroid.com//hotkey/json，传入单斜杠能够访问，传入双斜杠访问不了
    @GET("/hotkey/json")
    suspend fun hotkey(
    ): Response<BaseResponse<List<Hotkey>>>

    //搜索
    //这里没加@FormUrlEncoded，排查了一个下午，原来这里没有加，导致参数没有传进去，返回404
    //再补一条：接口url打错了。。。
    @POST("/article/query/{page}/json")
    @FormUrlEncoded
    suspend fun search(
        @Path("page") page:Int,
        @Field("k") key:String
    ):Response<BaseResponse<ArticlePack>>

    // 收藏
    @POST("/lg/collect/{id}/json")
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    // 取消收藏
    @POST("/lg/uncollect_originId/{id}/json")
    suspend fun unCollectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>
}