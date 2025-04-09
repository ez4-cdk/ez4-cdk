package com.delta.playandroid.data.api;

import com.delta.playandroid.data.interceptor.AddCookieInterceptor;
import com.delta.playandroid.data.interceptor.GetCookieInterceptor;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b.\u0010/R\u0011\u00101\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u0012\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u0012\u001a\u0004\b9\u00106\u00a8\u0006;"}, d2 = {"Lcom/delta/playandroid/data/api/ApiClient;", "", "addCookieInterceptor", "Lcom/delta/playandroid/data/interceptor/AddCookieInterceptor;", "getCookieInterceptor", "Lcom/delta/playandroid/data/interceptor/GetCookieInterceptor;", "(Lcom/delta/playandroid/data/interceptor/AddCookieInterceptor;Lcom/delta/playandroid/data/interceptor/GetCookieInterceptor;)V", "BASE_URL", "", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "getCollectAPI", "Lcom/delta/playandroid/data/api/CollectAPI;", "getGetCollectAPI", "()Lcom/delta/playandroid/data/api/CollectAPI;", "getCollectAPI$delegate", "Lkotlin/Lazy;", "getHarmonyService", "Lcom/delta/playandroid/data/api/HarmonyAPI;", "getGetHarmonyService", "()Lcom/delta/playandroid/data/api/HarmonyAPI;", "getHarmonyService$delegate", "getHomeService", "Lcom/delta/playandroid/data/api/HomeAPI;", "getGetHomeService", "()Lcom/delta/playandroid/data/api/HomeAPI;", "getHomeService$delegate", "getLoginService", "Lcom/delta/playandroid/data/api/LoginAPI;", "getGetLoginService", "()Lcom/delta/playandroid/data/api/LoginAPI;", "getLoginService$delegate", "getProjectService", "Lcom/delta/playandroid/data/api/ProjectAPI;", "getGetProjectService", "()Lcom/delta/playandroid/data/api/ProjectAPI;", "getProjectService$delegate", "getSearchAPI", "Lcom/delta/playandroid/data/api/SearchAPI;", "getGetSearchAPI", "()Lcom/delta/playandroid/data/api/SearchAPI;", "getSearchAPI$delegate", "getSystemService", "Lcom/delta/playandroid/data/api/SystemAPI;", "getGetSystemService", "()Lcom/delta/playandroid/data/api/SystemAPI;", "getSystemService$delegate", "loginClient", "getLoginClient", "loginRetrofit", "Lretrofit2/Retrofit;", "getLoginRetrofit", "()Lretrofit2/Retrofit;", "loginRetrofit$delegate", "retrofit", "getRetrofit", "retrofit$delegate", "app_debug"})
public final class ApiClient {
    private final com.delta.playandroid.data.interceptor.AddCookieInterceptor addCookieInterceptor = null;
    private final com.delta.playandroid.data.interceptor.GetCookieInterceptor getCookieInterceptor = null;
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient loginClient = null;
    private final java.lang.String BASE_URL = "https://www.wanandroid.com";
    
    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(添加)
     */
    private final kotlin.Lazy retrofit$delegate = null;
    
    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(获取)
     */
    private final kotlin.Lazy loginRetrofit$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getHarmonyService$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getHomeService$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getSystemService$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getLoginService$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getProjectService$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getCollectAPI$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy getSearchAPI$delegate = null;
    
    @javax.inject.Inject
    public ApiClient(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.interceptor.AddCookieInterceptor addCookieInterceptor, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.interceptor.GetCookieInterceptor getCookieInterceptor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getLoginClient() {
        return null;
    }
    
    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(添加)
     */
    private final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    /**
     * 创建Retrofit实例 -- 添加了cookie拦截器(获取)
     */
    private final retrofit2.Retrofit getLoginRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.HarmonyAPI getGetHarmonyService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.HomeAPI getGetHomeService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.SystemAPI getGetSystemService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.LoginAPI getGetLoginService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.ProjectAPI getGetProjectService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.CollectAPI getGetCollectAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.SearchAPI getGetSearchAPI() {
        return null;
    }
}