package com.delta.playandroidpro.login.bean
import com.delta.playandroidpro.common.BaseResponse
import com.delta.util.net.WebConstant
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface LoginService {
    @POST(WebConstant.loginAPI.API_LOGIN)
    @FormUrlEncoded
    suspend fun login(
        @Field("username") username:String,
        @Field("password") password:String
    ):Response<BaseResponse<User>>

    @POST(WebConstant.loginAPI.API_REGISTER)
    @FormUrlEncoded
    suspend fun register(
        @Field("username") username:String,
        @Field("password") password: String,
        @Field("repassword") repassword:String
    ):Response<BaseResponse<User>>

    @GET(WebConstant.loginAPI.API_LOGOUT)
    suspend fun logout(
    ):Response<BaseResponse<User>>
}