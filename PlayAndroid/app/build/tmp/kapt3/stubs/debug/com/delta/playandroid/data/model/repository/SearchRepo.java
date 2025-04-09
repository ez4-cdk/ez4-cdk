package com.delta.playandroid.data.model.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import java.util.LinkedList;
import java.util.Queue;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010$\u001a\u00020\u000eJ\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\u00150\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\'\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u000bj\b\u0012\u0004\u0012\u00020\u000e`\u00150\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/delta/playandroid/data/model/repository/SearchRepo;", "", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "(Lcom/delta/playandroid/data/api/ApiClient;Lcom/delta/playandroid/data/local/Manager/DataStoreManager;)V", "MAX_SEARCH_HISTORY_SIZE", "", "_hotkey", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Hotkey;", "_searchHistory", "", "apiService", "Lcom/delta/playandroid/data/api/SearchAPI;", "getApiService", "()Lcom/delta/playandroid/data/api/SearchAPI;", "hotkey", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getHotkey", "()Landroidx/lifecycle/LiveData;", "searchHistory", "getSearchHistory", "clearSearchHistory", "Lcom/delta/playandroid/common/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectArticle", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHotKey", "readSearchHistory", "saveSearchHistory", "key", "unCollectArticle", "Companion", "app_debug"})
public final class SearchRepo {
    private final com.delta.playandroid.data.api.ApiClient apiClient = null;
    private final com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager = null;
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroid.data.api.SearchAPI apiService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.data.model.repository.SearchRepo.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.delta.playandroid.data.model.repository.SearchRepo instance;
    
    /**
     * 搜索热词
     */
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Hotkey>> _hotkey;
    
    /**
     * 获取搜索历史
     */
    private final int MAX_SEARCH_HISTORY_SIZE = 10;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> _searchHistory;
    
    @javax.inject.Inject
    public SearchRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.SearchAPI getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Hotkey>> getHotkey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchHotKey(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 保存搜索历史
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.common.Result<kotlin.Unit> saveSearchHistory(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getSearchHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * 清空搜索历史
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    /**
     * @Date 2024/11/20
     * @Description 搜索结果的收藏与取消收藏
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/playandroid/data/model/repository/SearchRepo$Companion;", "", "()V", "instance", "Lcom/delta/playandroid/data/model/repository/SearchRepo;", "getInstance", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroid.data.model.repository.SearchRepo getInstance(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
            return null;
        }
    }
}