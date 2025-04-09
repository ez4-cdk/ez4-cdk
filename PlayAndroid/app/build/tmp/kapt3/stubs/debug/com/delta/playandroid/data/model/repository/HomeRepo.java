package com.delta.playandroid.data.model.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Banner;
import com.delta.playandroid.data.model.bean.entity.User;
import com.delta.playandroid.data.source.HomeDataSource;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

/**
 * 首页
 * 文章     article     首页文章用paging实现
 * 轮播图    banner     首页banner用LiveData来存储
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fJ\u0010\u0010\"\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\'\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/delta/playandroid/data/model/repository/HomeRepo;", "", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "(Lcom/delta/playandroid/data/api/ApiClient;)V", "_banner", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Banner;", "_user", "Lcom/delta/playandroid/data/model/bean/entity/User;", "apiService", "Lcom/delta/playandroid/data/api/HomeAPI;", "getApiService", "()Lcom/delta/playandroid/data/api/HomeAPI;", "banner", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getBanner", "()Landroidx/lifecycle/LiveData;", "user", "getUser", "collectInsideArticle", "Lcom/delta/playandroid/common/Result;", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomeBanners", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "setUser", "unCollectInsideArticle", "Companion", "app_debug"})
public final class HomeRepo {
    private final com.delta.playandroid.data.api.ApiClient apiClient = null;
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroid.data.api.HomeAPI apiService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.data.model.repository.HomeRepo.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.delta.playandroid.data.model.repository.HomeRepo instance;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Banner>> _banner;
    
    /**
     * 设置用户
     */
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.User> _user;
    
    @javax.inject.Inject
    public HomeRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.HomeAPI getApiService() {
        return null;
    }
    
    /**
     * Article
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Banner>> getBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchHomeBanners(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.User> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable
    com.delta.playandroid.data.model.bean.entity.User user) {
    }
    
    /**
     * 取消收藏
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object unCollectInsideArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/delta/playandroid/data/model/repository/HomeRepo$Companion;", "", "()V", "instance", "Lcom/delta/playandroid/data/model/repository/HomeRepo;", "getInstance", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroid.data.model.repository.HomeRepo getInstance(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.api.ApiClient apiClient) {
            return null;
        }
    }
}