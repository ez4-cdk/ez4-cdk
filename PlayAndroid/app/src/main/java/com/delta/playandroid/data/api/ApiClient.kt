package com.delta.playandroid.data.api

import com.delta.playandroid.data.interceptor.AddCookieInterceptor
import com.delta.playandroid.data.interceptor.GetCookieInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class ApiClient @Inject constructor(
    private val addCookieInterceptor: AddCookieInterceptor,
    private val getCookieInterceptor: GetCookieInterceptor
) {

    val client = OkHttpClient.Builder()
        .addInterceptor(addCookieInterceptor)
        .readTimeout(15,TimeUnit.SECONDS)
        .writeTimeout(15,TimeUnit.SECONDS)
        .build()

    val loginClient = OkHttpClient.Builder()
        .addInterceptor(getCookieInterceptor)
        .readTimeout(15,TimeUnit.SECONDS)
        .writeTimeout(15,TimeUnit.SECONDS)
        .build()

    private val BASE_URL = "https://www.wanandroid.com"

    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(添加)
     */
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(获取)
     */
    private val loginRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(loginClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val getHarmonyService: HarmonyAPI by lazy {
        retrofit.create(HarmonyAPI::class.java)
    }

    val getHomeService: HomeAPI by lazy {
        retrofit.create(HomeAPI::class.java)
    }

    val getSystemService: SystemAPI by lazy {
        retrofit.create(SystemAPI::class.java)
    }

    val getLoginService: LoginAPI by lazy {
        loginRetrofit.create(LoginAPI::class.java)
    }

    val getProjectService: ProjectAPI by lazy {
        retrofit.create(ProjectAPI::class.java)
    }

    val getCollectAPI: CollectAPI by lazy {
        retrofit.create(CollectAPI::class.java)
    }

    val getSearchAPI: SearchAPI by lazy {
        retrofit.create(SearchAPI::class.java)
    }
}
