package com.delta.playandroidpro.center.project.bean;

/**
 * 项目
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/delta/playandroidpro/center/project/bean/ProjectService;", "", "projectArticle", "Lretrofit2/Response;", "Lcom/delta/playandroidpro/common/BaseResponse;", "Lcom/delta/playandroidpro/common/Pack;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "page", "", "cid", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "projects", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/center/project/bean/entity/Column;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProjectService {
    
    @retrofit2.http.GET(value = "/project/tree/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object projects(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.util.ArrayList<com.delta.playandroidpro.center.project.bean.entity.Column>>>> $completion);
    
    @retrofit2.http.GET(value = "/project/list/{page}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object projectArticle(@retrofit2.http.Path(value = "page")
    int page, @retrofit2.http.Query(value = "cid")
    int cid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.home.bean.entity.Article>>>> $completion);
}