package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.Column
import retrofit2.Response
import retrofit2.http.GET

/**
 * 项目
 */
interface ProjectAPI {

    //项目树
    @GET("https://www.wanandroid.com/project/tree/json")
    suspend fun projects(
    ):Response<BaseResponse<ArrayList<Column>>>
}