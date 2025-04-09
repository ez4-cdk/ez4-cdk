package com.delta.playandroidpro.collect;

/**
 * @description 收藏模块的model
 * 功能包括：收藏,编辑或取消收藏文章、收藏,编辑或取消收藏网站、查看收藏文章、查看收藏网站
 * @author delta
 * @date 2025/3/3 11:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u00190\u00182\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\u001b\u001a\u00020\u00142\u001c\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u001dj\b\u0012\u0004\u0012\u00020\r`\u001e0\u00182\u0006\u0010\u0007\u001a\u00020\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/delta/playandroidpro/collect/CollectModel;", "", "()V", "addCollectArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "cookie", "", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectArticle", "collectWebsite", "website", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Website;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disCollectArticle", "disCollectWebsite", "editCollectArticle", "editCollectWebsite", "getCollectedArticles", "", "viewModel", "Lcom/delta/playandroidpro/collect/CollectViewModel;", "_collectArticles", "Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getCollectedWebsites", "_collectWebsites", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class CollectModel {
    
    public CollectModel() {
        super();
    }
    
    public final void getCollectedArticles(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.collect.CollectViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>>> _collectArticles, @org.jetbrains.annotations.NotNull
    java.lang.String cookie) {
    }
    
    public final void getCollectedWebsites(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Website>> _collectWebsites, @org.jetbrains.annotations.NotNull
    java.lang.String cookie) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object disCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object disCollectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    java.lang.String cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}