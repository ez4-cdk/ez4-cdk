package com.delta.playandroidpro.collect;

/**
 * @description 收藏模块的ViewModel
 * @author delta
 * @date 2025/3/3 11:52
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010+\u001a\u00020!2\u0006\u0010&\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010\u0018\u001a\u00020,J\u0006\u0010\u001c\u001a\u00020,J\u000e\u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\fR \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\'\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u001b0\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u000e\u0010 \u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/delta/playandroidpro/collect/CollectViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_collectArticles", "Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "_collectWebsites", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "_cookie", "", "addCollectArticle", "Lkotlinx/coroutines/sync/Mutex;", "articleMutex", "collectModel", "Lcom/delta/playandroidpro/collect/CollectModel;", "getCollectModel", "()Lcom/delta/playandroidpro/collect/CollectModel;", "collectModel$delegate", "Lkotlin/Lazy;", "collectedArticles", "Landroidx/lifecycle/LiveData;", "getCollectedArticles", "()Landroidx/lifecycle/LiveData;", "collectedWebsites", "Lkotlin/collections/ArrayList;", "getCollectedWebsites", "()Landroidx/lifecycle/MutableLiveData;", "cookie", "getCookie", "websiteMutex", "", "article", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectArticle", "collectWebsite", "website", "(Lcom/delta/playandroidpro/center/home/bean/entity/Website;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disCollectArticle", "disCollectWebsite", "editArticle", "editWebsite", "", "initCookie", "app_release"})
public final class CollectViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy collectModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.Mutex articleMutex = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.Mutex websiteMutex = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.Mutex addCollectArticle = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> _collectArticles = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Website>> _collectWebsites = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _cookie = null;
    
    public CollectViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> getCollectedArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Website>> getCollectedWebsites() {
        return null;
    }
    
    private final com.delta.playandroidpro.collect.CollectModel getCollectModel() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.String> getCookie() {
        return null;
    }
    
    public final void getCollectedArticles() {
    }
    
    public final void getCollectedWebsites() {
    }
    
    public final void initCookie(@org.jetbrains.annotations.NotNull
    java.lang.String cookie) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object disCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object disCollectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}