package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.ArticlePack
import com.delta.playandroid.data.model.bean.entity.Banner
import com.delta.playandroid.data.model.bean.entity.Hotkey
import com.delta.playandroid.data.model.bean.entity.Website
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * 首页相关
 */
interface HomeAPI {

    //首页文章
    @GET("/article/list/{page}/json")
    suspend fun article(
        @Path("page")page:Int
    ): Response<BaseResponse<ArticlePack>>

    //首页banner
    @GET("/banner/json")
    suspend fun banner(
    ):Response<BaseResponse<List<Banner>>>

    //常用网站
    @GET("/friend/json")
    suspend fun website(
    ):Response<BaseResponse<List<Website>>>

    //收藏文章 英文括号{} 中文括号{} 还是有区别的，而且不会报错，查了我三天
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