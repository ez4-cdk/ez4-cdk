package com.delta.playandroidpro.search;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J!\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0016\u00104\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0011J\u0006\u00105\u001a\u000202J\u000e\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\'\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\u00190\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\'\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\tj\b\u0012\u0004\u0012\u00020\u000b`\u00190\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lcom/delta/playandroidpro/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_context", "Landroidx/lifecycle/MutableLiveData;", "Landroid/content/Context;", "_exception", "", "_history", "Ljava/util/ArrayList;", "_hotkey", "Lcom/delta/playandroidpro/search/bean/entity/Hotkey;", "_searchResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "_user", "Lcom/delta/playandroidpro/login/bean/User;", "context", "Landroidx/lifecycle/LiveData;", "getContext", "()Landroidx/lifecycle/LiveData;", "exception", "getException", "history", "Lkotlin/collections/ArrayList;", "getHistory", "hotkey", "getHotkey", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "searchModel", "Lcom/delta/playandroidpro/search/SearchModel;", "getSearchModel", "()Lcom/delta/playandroidpro/search/SearchModel;", "searchModel$delegate", "Lkotlin/Lazy;", "searchResult", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchResult", "()Lkotlinx/coroutines/flow/StateFlow;", "user", "getUser", "collectArticle", "", "article", "cookie", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discollectArticle", "getHotKey", "", "getLocalHistory", "initViewModel", "saveLocalHistory", "search", "key", "app_release"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy searchModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.search.bean.entity.Hotkey>> _hotkey = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<android.content.Context> _context = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> _history = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>> _searchResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _exception = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.login.bean.User> _user = null;
    
    public SearchViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroidpro.search.bean.entity.Hotkey>> getHotkey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>> getSearchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getException() {
        return null;
    }
    
    private final com.delta.playandroidpro.search.SearchModel getSearchModel() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<android.content.Context> getContext() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> getUser() {
        return null;
    }
    
    public final void initViewModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.bean.User user) {
    }
    
    public final void getHotKey() {
    }
    
    public final void getLocalHistory() {
    }
    
    public final void saveLocalHistory() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
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