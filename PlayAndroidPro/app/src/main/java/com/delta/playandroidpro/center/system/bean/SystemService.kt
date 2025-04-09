package com.delta.playandroidpro.center.system.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.Pack
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.delta.playandroidpro.common.BaseResponse
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 体系
 */
/**
 * @description 体系数据的API
 * @author delta
 * @date 2025/2/26 16:14
 */
interface SystemService {

    //体系数据
    @GET(WebConstant.systemAPI.API_GET_SYSTEM_DATA)
    suspend fun data(
    ):Response<BaseResponse<List<Column>>>

    //体系数据下的文章
    @GET(WebConstant.systemAPI.API_GET_SYSTEM_ARTICLE)
    suspend fun articleUnderDataCid(
        @Path("page")page:Int,
        @Query("cid")cid:Int, //根据体系数据下的cid查询出来的文章
        @Query("page_size")pageSize:Int?=40 //页数为0~40
    ):Response<BaseResponse<Pack<Article>>>

    //根据作者昵称搜索文章
    @GET(WebConstant.systemAPI.API_GET_ARTICLE_BY_AUTHOR)
    suspend fun findArticleByAuthor(
        @Path("page") page:Int,
        @Query("author") author:String
    ):Response<BaseResponse<Pack<Article>>>

    // 收藏
    @POST(WebConstant.systemAPI.API_COLLECT_ARTICLE)
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    // 取消收藏
    @POST(WebConstant.systemAPI.API_DISCOLLECT_ARTICLE)
    suspend fun unCollectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>
}