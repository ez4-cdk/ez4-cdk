package com.delta.playandroid.data.api;

import com.delta.playandroid.common.BaseResponse;
import com.delta.playandroid.data.model.bean.entity.ArticlePack;
import com.delta.playandroid.data.model.bean.entity.Banner;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import com.delta.playandroid.data.model.bean.entity.Website;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * 首页相关
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/playandroid/data/api/HomeAPI;", "", "article", "Lretrofit2/Response;", "Lcom/delta/playandroid/common/BaseResponse;", "Lcom/delta/playandroid/data/model/bean/entity/ArticlePack;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "banner", "", "Lcom/delta/playandroid/data/model/bean/entity/Banner;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectInsideArticle", "id", "unCollectInsideArticle", "website", "Lcom/delta/playandroid/data/model/bean/entity/Website;", "app_debug"})
public abstract interface HomeAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    public abstract java.lang.Object article(@retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.ArticlePack>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/banner/json")
    public abstract java.lang.Object banner(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.util.List<com.delta.playandroid.data.model.bean.entity.Banner>>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/friend/json")
    public abstract java.lang.Object website(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.util.List<com.delta.playandroid.data.model.bean.entity.Website>>>> continuation);
    
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