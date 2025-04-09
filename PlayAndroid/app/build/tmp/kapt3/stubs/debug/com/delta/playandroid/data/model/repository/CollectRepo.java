package com.delta.playandroid.data.model.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.delta.playandroid.data.api.ApiClient;
import javax.inject.Inject;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Website;
import com.delta.playandroid.data.source.CollectArticlesDS;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J/\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0&J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\'\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/delta/playandroid/data/model/repository/CollectRepo;", "", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "(Lcom/delta/playandroid/data/api/ApiClient;)V", "_collectWebs", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/delta/playandroid/data/model/bean/entity/Website;", "apiService", "Lcom/delta/playandroid/data/api/CollectAPI;", "getApiService", "()Lcom/delta/playandroid/data/api/CollectAPI;", "collectWebs", "Landroidx/lifecycle/LiveData;", "getCollectWebs", "()Landroidx/lifecycle/LiveData;", "collectArticle", "Lcom/delta/playandroid/common/Result;", "", "name", "", "link", "author", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectInsideArticle", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWebsite", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCollectWebsite", "editCollectArticle", "title", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editCollectWebsite", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unCollectInsideArticle", "originID", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class CollectRepo {
    private final com.delta.playandroid.data.api.ApiClient apiClient = null;
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroid.data.api.CollectAPI apiService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.data.model.repository.CollectRepo.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.delta.playandroid.data.model.repository.CollectRepo instance;
    
    /**
     * 收藏网址列表
     */
    private androidx.lifecycle.MutableLiveData<java.util.List<com.delta.playandroid.data.model.bean.entity.Website>> _collectWebs;
    
    @javax.inject.Inject
    public CollectRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.CollectAPI getApiService() {
        return null;
    }
    
    /**
     * 收藏文章列表
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticles() {
        return null;
    }
    
    /**
     * 收藏站内文章
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectInsideArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 取消收藏
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object unCollectInsideArticle(int id, int originID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 编辑收藏文章
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectArticle(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.delta.playandroid.data.model.bean.entity.Website>> getCollectWebs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCollectWebs(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 收藏网站
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectWebsite(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 收藏文章
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 编辑收藏网站
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectWebsite(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 删除收藏网站
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCollectWebsite(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/delta/playandroid/data/model/repository/CollectRepo$Companion;", "", "()V", "instance", "Lcom/delta/playandroid/data/model/repository/CollectRepo;", "getInstance", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroid.data.model.repository.CollectRepo getInstance(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.api.ApiClient apiClient) {
            return null;
        }
    }
}