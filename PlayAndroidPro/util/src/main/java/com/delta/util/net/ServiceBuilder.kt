package com.delta.util.net

import AddCookieInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @description 网络服务构造器
 * @author delta
 * @date 2025/2/4 10:26
 */
object ServiceBuilder {

    private val retrofit = Retrofit.Builder()
        .baseUrl(WebConstant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    private val client =OkHttpClient.Builder()
        .connectTimeout(8,TimeUnit.SECONDS)
        .readTimeout(20,TimeUnit.SECONDS)
        .writeTimeout(20,TimeUnit.SECONDS)

    fun <T> buildService(
        service:Class<T>,
        cookie:String?=null
    ):T{
        val retrofit = retrofit
        return if (cookie==null){
            retrofit.client(client.build()).build().create(service)
        }else{
            retrofit
                .client(client.addInterceptor(AddCookieInterceptor(cookie)).build())
                .build()
                .create(service)
        }
    }

}