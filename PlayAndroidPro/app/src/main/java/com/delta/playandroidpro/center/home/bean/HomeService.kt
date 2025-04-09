package com.delta.playandroidpro.center.home.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.Pack
import com.delta.playandroidpro.center.home.bean.entity.Banner
import com.delta.playandroidpro.center.home.bean.entity.Website
import com.delta.playandroidpro.common.BaseResponse
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * @description 首页相关接口
 * @author delta
 * @date 2025/2/8 16:54
 */
interface HomeService {

    //首页文章
    @GET(WebConstant.homeAPI.API_GET_HOME_ARTICLE)
    suspend fun article(
        @Path("page")page:Int
    ): Response<BaseResponse<Pack<Article>>>

    //首页banner
    @GET(WebConstant.homeAPI.API_GET_HOME_BANNER)
    suspend fun banner(
    ):Response<BaseResponse<List<Banner>>>

    //常用网站
    @GET(WebConstant.homeAPI.API_GET_HOME_WEBSITE)
    suspend fun website(
    ):Response<BaseResponse<List<Website>>>

    //收藏文章
    @POST(WebConstant.homeAPI.API_HOME_COLLECT_ARTICLE)
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    // 取消收藏
    @POST(WebConstant.homeAPI.API_HOME_DISCOLLECT_ARTICLE)
    suspend fun unCollectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>
}