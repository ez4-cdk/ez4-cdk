package com.delta.playandroidpro.center.home;

/**
 * @description HomeModel
 * @author delta
 * @date 2025/2/8 16:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ \u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u00100\u0006J%\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/playandroidpro/center/home/HomeModel;", "", "()V", "collectArticle", "", "_exception", "Landroidx/lifecycle/MutableLiveData;", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "cookie", "(Landroidx/lifecycle/MutableLiveData;Lcom/delta/playandroidpro/center/home/bean/entity/Article;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discollectArticle", "getArticleList", "", "articlesFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getBannerList", "_banners", "", "Lcom/delta/playandroidpro/center/home/bean/entity/Banner;", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class HomeModel {
    
    public HomeModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBannerList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.delta.playandroidpro.center.home.bean.entity.Banner>> _banners, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void getArticleList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> articlesFlow) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _exception, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object discollectArticle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _exception, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}