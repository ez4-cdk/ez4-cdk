package com.delta.playandroidpro.collect.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.Pack
import com.delta.playandroidpro.center.home.bean.entity.Website
import com.delta.playandroidpro.common.BaseResponse
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * @description 收藏相关接口
 * @author delta
 * @date 2025/3/3 11:34
 */
interface CollectService {

    @GET(WebConstant.collectAPI.API_GET_COLLECTED_WEBS)
    suspend fun getCollectWebs(
    ): Response<BaseResponse<ArrayList<Website>>>

    @POST(WebConstant.collectAPI.API_COLLECT_ARTICLE)
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    @GET(WebConstant.collectAPI.API_GET_COLLECTED_ARTICLES)
    suspend fun getCollectArticles(
        @Path("page") page:Int
    ): Response<BaseResponse<Pack<Article>>>

    @POST(WebConstant.collectAPI.API_DISCOLLECT_ARTICLE)
    @FormUrlEncoded
    suspend fun disCollectInsideArticle(
        @Path("id") id:Int,
        @Field("originId") originId:Int
    ): Response<BaseResponse<Pack<Article>>>

    // 编辑收藏文章
    @POST(WebConstant.collectAPI.API_EDIT_COLLECTED_ARTICLES)
    @FormUrlEncoded
    suspend fun editCollectArticle(
        @Path("id") id:Int,
        @Field("title")title:String,
        @Field("link")link:String,
        @Field("author")author:String
    ): Response<BaseResponse<Any>>

    @POST(WebConstant.collectAPI.API_COLLECT_WEBSITE)
    @FormUrlEncoded
    suspend fun collectWebsite(
        @Field("name")title:String,
        @Field("link")link:String
    ):Response<BaseResponse<Any>>

    @POST(WebConstant.collectAPI.API_COLLECT_OUTSIDE_ARTICLE)
    @FormUrlEncoded
    suspend fun addCollectArticle(
        @Field("title")title:String,
        @Field("link")link:String,
        @Field("author")author: String
    ):Response<BaseResponse<Any>>



    @POST(WebConstant.collectAPI.API_EDIT_COLLECTED_WEBSITE)
    @FormUrlEncoded
    suspend fun editCollectWebsite(
        @Field("id")id:Int,
        @Field("name")name:String,
        @Field("link")link:String
    ):Response<BaseResponse<Any>>

    @POST(WebConstant.collectAPI.API_DISCOLLECT_WEBSITE)
    @FormUrlEncoded
    suspend fun deleteCollectWebsite(
        @Field("id")id:Int
    ):Response<BaseResponse<Any>>
}