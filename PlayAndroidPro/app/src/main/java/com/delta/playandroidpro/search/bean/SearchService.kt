package com.delta.playandroidpro.search.bean

import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.common.Pack
import com.delta.playandroidpro.common.BaseResponse
import com.delta.playandroidpro.search.bean.entity.Hotkey
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * 搜索
 */

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
interface SearchService {

    //搜索热词 这里本来URL是https://www.wanandroid.com//hotkey/json，传入单斜杠能够访问，传入双斜杠访问不了
    @GET(WebConstant.searchAPI.API_GET_HOTKEY)
    suspend fun hotkey(
    ): Response<BaseResponse<List<Hotkey>>>

    //搜索
    //这里没加@FormUrlEncoded，排查了一个下午，原来这里没有加，导致参数没有传进去，返回404
    //再补一条：接口url打错了。。。
    @POST(WebConstant.searchAPI.API_GET_SEARCH_RESULT)
    @FormUrlEncoded
    suspend fun search(
        @Path("page") page:Int,
        @Field("k") key:String
    ):Response<BaseResponse<Pack<Article>>>

    // 收藏
    @POST(WebConstant.searchAPI.API_COLLECT_SEARCH_RESULT)
    suspend fun collectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>

    // 取消收藏
    @POST(WebConstant.searchAPI.API_DISCOLLECT_SEARCH_RESULT)
    suspend fun disCollectInsideArticle(
        @Path("id") id:Int
    ): Response<BaseResponse<Any>>
}