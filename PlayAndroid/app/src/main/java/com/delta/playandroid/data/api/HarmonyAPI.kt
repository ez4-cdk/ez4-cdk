package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Chapter
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.model.bean.entity.Harmony
import retrofit2.http.GET

interface HarmonyAPI {

    //专栏
    @GET("https://wanandroid.com/harmony/index/json")
    suspend fun getHarmonyColumn(
    ):BaseResponse<Harmony>

    //首页最受欢迎板块-问答
    @GET("https://wanandroid.com/popular/wenda/json")
    suspend fun askAndAnswer(
    ):BaseResponse<Article>

    //首页最受欢迎板块-专栏
    @GET("https://wanandroid.com/popular/column/json")
    suspend fun column(
    ):BaseResponse<Chapter>

    //首页最受欢迎板块-路线
    @GET("https://wanandroid.com/popular/route/json")
    suspend fun route(
    ):BaseResponse<Column>

}