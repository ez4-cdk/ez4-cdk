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
    private var cookie: String = ""
    private var client: OkHttpClient =
        OkHttpClient.Builder()
            .connectTimeout(8, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .build()

    private var retrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(WebConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .validateEagerly(true)
            .build()

    fun <T> buildService(
        service: Class<T>,
        cookie: String? = null
    ): T {
        if (cookie != null && this.cookie.equals("")) {
            // cookie 为空，表示为登录服务，不需要添加cookie
            this.cookie = cookie
            client = client.newBuilder().addInterceptor(AddCookieInterceptor(this.cookie)).build()
            retrofit = retrofit.newBuilder().client(client).build()
        }
        return retrofit.create(service)
    }

}