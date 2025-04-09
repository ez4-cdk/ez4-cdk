package com.delta.playandroid.data.model.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.data.source.CardsArticleDS;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

/**
 * 系统模块仓库
 * 卡片数据
 * 卡片数据下的文章 -- paging3
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0014J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/delta/playandroid/data/model/repository/SystemRepo;", "", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "(Lcom/delta/playandroid/data/api/ApiClient;)V", "_cards", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "apiService", "Lcom/delta/playandroid/data/api/SystemAPI;", "cards", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getCards", "()Landroidx/lifecycle/LiveData;", "collectArticle", "Lcom/delta/playandroid/common/Result;", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCardsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticlePaging", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "cid", "getColumnByColumnId", "columnId", "unCollectArticle", "Companion", "app_debug"})
public final class SystemRepo {
    private final com.delta.playandroid.data.api.ApiClient apiClient = null;
    private final com.delta.playandroid.data.api.SystemAPI apiService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.data.model.repository.SystemRepo.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.delta.playandroid.data.model.repository.SystemRepo instance;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column>> _cards;
    
    @javax.inject.Inject
    public SystemRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column>> getCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCardsData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.delta.playandroid.data.model.bean.entity.Column getColumnByColumnId(int columnId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticlePaging(int cid) {
        return null;
    }
    
    /**
     * @Date 2024/11/20
     * @Description 添加了收藏和取消收藏
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object unCollectArticle(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/delta/playandroid/data/model/repository/SystemRepo$Companion;", "", "()V", "instance", "Lcom/delta/playandroid/data/model/repository/SystemRepo;", "getInstance", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroid.data.model.repository.SystemRepo getInstance(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.api.ApiClient apiClient) {
            return null;
        }
    }
}