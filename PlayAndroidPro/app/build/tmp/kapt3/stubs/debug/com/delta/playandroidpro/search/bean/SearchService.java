package com.delta.playandroidpro.search.bean;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ7\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/delta/playandroidpro/search/bean/SearchService;", "", "collectInsideArticle", "Lretrofit2/Response;", "Lcom/delta/playandroidpro/common/BaseResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disCollectInsideArticle", "hotkey", "", "Lcom/delta/playandroidpro/search/bean/entity/Hotkey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/delta/playandroidpro/common/Pack;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "page", "key", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SearchService {
    
    @retrofit2.http.GET(value = "/hotkey/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object hotkey(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.util.List<com.delta.playandroidpro.search.bean.entity.Hotkey>>>> $completion);
    
    @retrofit2.http.POST(value = "/article/query/{page}/json")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object search(@retrofit2.http.Path(value = "page")
    int page, @retrofit2.http.Field(value = "k")
    @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.home.bean.entity.Article>>>> $completion);
    
    @retrofit2.http.POST(value = "/lg/collect/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object collectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.lang.Object>>> $completion);
    
    @retrofit2.http.POST(value = "/lg/uncollect_originId/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object disCollectInsideArticle(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<java.lang.Object>>> $completion);
}