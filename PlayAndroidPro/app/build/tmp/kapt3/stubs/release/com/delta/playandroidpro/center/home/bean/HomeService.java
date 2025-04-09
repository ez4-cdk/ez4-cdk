package com.delta.playandroidpro.center.home.bean;

/**
 * @description 首页相关接口
 * @author delta
 * @date 2025/2/8 16:54
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroidpro/center/home/bean/HomeService;", "", "article", "Lretrofit2/Response;", "Lcom/delta/playandroidpro/common/BaseResponse;", "Lcom/delta/playandroidpro/common/Pack;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "banner", "", "Lcom/delta/playandroidpro/center/home/bean/entity/Banner;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectInsideArticle", "id", "unCollectInsideArticle", "website", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "app_release"})
public abstract interface HomeService {
    
    @retrofit2.http.GET(value = "/article/list/{page}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object article(@retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.home.bean.entity.Article>>>> $completion);
    
    @retrofit2.http.GET(value = "/banner/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object banner(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.util.List<com.delta.playandroidpro.center.home.bean.entity.Banner>>>> $completion);
    
    @retrofit2.http.GET(value = "/friend/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object website(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.util.List<com.delta.playandroidpro.center.home.bean.entity.Website>>>> $completion);
    
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
}