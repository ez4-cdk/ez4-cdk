package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import com.delta.playandroid.data.model.repository.SearchRepo;
import com.delta.playandroid.data.source.SearchDataSource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;
import com.delta.playandroid.common.Result;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fJ\u0010\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010\u0013J\u0006\u0010,\u001a\u00020\u001fJ\u0019\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\'\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00130\u00130\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/delta/playandroid/viewmodel/SearchViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "searchRepo", "Lcom/delta/playandroid/data/model/repository/SearchRepo;", "(Lcom/delta/playandroid/data/model/repository/SearchRepo;)V", "_mutex", "Lkotlinx/coroutines/sync/Mutex;", "_searchResults", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "hotKey", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Hotkey;", "Lkotlin/collections/ArrayList;", "getHotKey", "()Landroidx/lifecycle/LiveData;", "searchHistory", "", "getSearchHistory", "searchInput", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getSearchInput", "()Landroidx/lifecycle/MutableLiveData;", "searchResults", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchResults", "()Lkotlinx/coroutines/flow/StateFlow;", "cleanHistory", "", "collect", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchResultByPaging", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHotKey", "loadSearchHistory", "onSearchTextChange", "newText", "search", "uncollect", "app_debug"})
public final class SearchViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.SearchRepo searchRepo = null;
    
    /**
     * 搜索
     * searchResult
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchInput = null;
    private kotlinx.coroutines.sync.Mutex _mutex;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> _searchResults = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> searchResults = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.SearchRepo searchRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Hotkey>> getHotKey() {
        return null;
    }
    
    public final void loadHotKey() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getSearchHistory() {
        return null;
    }
    
    public final void loadSearchHistory() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchInput() {
        return null;
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.Nullable
    java.lang.String newText) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getSearchResults() {
        return null;
    }
    
    /**
     * 清空历史
     */
    public final void cleanHistory() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSearchResultByPaging(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void search() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collect(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object uncollect(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}