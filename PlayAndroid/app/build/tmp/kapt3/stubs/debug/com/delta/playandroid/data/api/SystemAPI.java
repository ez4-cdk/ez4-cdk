package com.delta.playandroid.data.api;

import com.delta.playandroid.common.BaseResponse;
import com.delta.playandroid.data.model.bean.entity.ArticlePack;
import com.delta.playandroid.data.model.bean.entity.Column;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 体系
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J1\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/playandroid/data/api/SystemAPI;", "", "articleUnderDataCid", "Lretrofit2/Response;", "Lcom/delta/playandroid/common/BaseResponse;", "Lcom/delta/playandroid/data/model/bean/entity/ArticlePack;", "page", "", "cid", "pageSize", "(IILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectInsideArticle", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findArticleByAuthor", "author", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unCollectInsideArticle", "app_debug"})
public abstract interface SystemAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/tree/json")
    public abstract java.lang.Object data(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.util.List<com.delta.playandroid.data.model.bean.entity.Column>>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    public abstract java.lang.Object articleUnderDataCid(@retrofit2.http.Path(value = "page")
    int page, @retrofit2.http.Query(value = "cid")
    int cid, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page_size")
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.ArticlePack>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    public abstract java.lang.Object findArticleByAuthor(@retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "author")
    java.lang.String author, @org.jetbrains.annotations.NotNull
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
    
    /**
     * 体系
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}