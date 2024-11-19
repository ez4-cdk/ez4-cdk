package com.delta.playandroid.data.api

import com.delta.playandroid.common.BaseResponse
import com.delta.playandroid.data.model.bean.entity.User
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface LoginAPI {
    @POST("/user/login")
    @FormUrlEncoded
    suspend fun login(
        @Field("username") username:String,
        @Field("password") password:String
    ):Response<BaseResponse<User>>

    @POST("/user/register")
    @FormUrlEncoded
    suspend fun register(
        @Field("username") username:String,
        @Field("password") password: String,
        @Field("repassword") repassword:String
    ):Response<BaseResponse<User>>

    @GET("/user/logout/json")
    suspend fun logout(
    ):Response<BaseResponse<User>>
}