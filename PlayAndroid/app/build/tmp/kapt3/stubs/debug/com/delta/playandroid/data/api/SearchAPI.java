package com.delta.playandroid.data.api;

import com.delta.playandroid.common.BaseResponse;
import com.delta.playandroid.data.model.bean.entity.ArticlePack;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * 搜索
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroid/data/api/SearchAPI;", "", "collectInsideArticle", "Lretrofit2/Response;", "Lcom/delta/playandroid/common/BaseResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotkey", "", "Lcom/delta/playandroid/data/model/bean/entity/Hotkey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/delta/playandroid/data/model/bean/entity/ArticlePack;", "page", "key", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unCollectInsideArticle", "app_debug"})
public abstract interface SearchAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/hotkey/json")
    public abstract java.lang.Object hotkey(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.util.List<com.delta.playandroid.data.model.bean.entity.Hotkey>>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "/article/query/{page}/json")
    public abstract java.lang.Object search(@retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "k")
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.ArticlePack>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/lg/collect/{id}/json")
    public abstract java.lang.Object collectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.lang.Object>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/lg/uncollect_originId/{id}/json")
    public abstract java.lang.Object unCollectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.lang.Object>>> continuation);
}