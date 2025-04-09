package com.delta.playandroidpro.center.home;

/**
 * @description 首页ViewModel
 * @author delta
 * @date 2025/2/8 16:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0006\u0010\u000f\u001a\u00020#J\u0006\u0010\u0012\u001a\u00020#R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/delta/playandroidpro/center/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_articleList", "Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "_bannerList", "", "Lcom/delta/playandroidpro/center/home/bean/entity/Banner;", "_exception", "", "articleList", "Landroidx/lifecycle/LiveData;", "getArticleList", "()Landroidx/lifecycle/LiveData;", "bannerList", "getBannerList", "exception", "getException", "homeModel", "Lcom/delta/playandroidpro/center/home/HomeModel;", "getHomeModel", "()Lcom/delta/playandroidpro/center/home/HomeModel;", "homeModel$delegate", "Lkotlin/Lazy;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "collectArticle", "", "article", "cookie", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discollectArticle", "", "app_release"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.delta.playandroidpro.center.home.bean.entity.Banner>> _bannerList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> _articleList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _exception = null;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.delta.playandroidpro.center.home.bean.entity.Banner>> getBannerList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> getArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getException() {
        return null;
    }
    
    private final com.delta.playandroidpro.center.home.HomeModel getHomeModel() {
        return null;
    }
    
    public final void getBannerList() {
    }
    
    public final void getArticleList() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object discollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}