package com.delta.playandroidpro.center.system.bean;

/**
 * @description 体系数据的API
 * @author delta
 * @date 2025/2/26 16:14
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J7\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroidpro/center/system/bean/SystemService;", "", "articleUnderDataCid", "Lretrofit2/Response;", "Lcom/delta/playandroidpro/common/BaseResponse;", "Lcom/delta/playandroidpro/common/Pack;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "page", "", "cid", "pageSize", "(IILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectInsideArticle", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "Lcom/delta/playandroidpro/center/project/bean/entity/Column;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findArticleByAuthor", "author", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unCollectInsideArticle", "app_debug"})
public abstract interface SystemService {
    
    @retrofit2.http.GET(value = "/tree/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object data(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.util.List<com.delta.playandroidpro.center.project.bean.entity.Column>>>> $completion);
    
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object articleUnderDataCid(@retrofit2.http.Path(value = "page")
    int page, @retrofit2.http.Query(value = "cid")
    int cid, @retrofit2.http.Query(value = "page_size")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.home.bean.entity.Article>>>> $completion);
    
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findArticleByAuthor(@retrofit2.http.Path(value = "page")
    int page, @retrofit2.http.Query(value = "author")
    @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.home.bean.entity.Article>>>> $completion);
    
    @retrofit2.http.POST(value = "/lg/collect/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object collectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.lang.Object>>> $completion);
    
    @retrofit2.http.POST(value = "/lg/uncollect_originId/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object unCollectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.lang.Object>>> $completion);
    
    /**
     * @description 体系数据的API
     * @author delta
     * @date 2025/2/26 16:14
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}