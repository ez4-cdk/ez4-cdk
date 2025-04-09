package com.delta.playandroidpro.search;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:01
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J/\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0013\u001a\u00020\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019JB\u0010\u001a\u001a\u00020\u00142\u001c\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u00180\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006JP\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u001c\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u00180\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ*\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!0 2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$JP\u0010%\u001a\u00020\u00142\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u001c\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0016j\b\u0012\u0004\u0012\u00020\r`\u00180\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/delta/playandroidpro/search/SearchModel;", "", "()V", "checkIfExistsUserHistory", "", "context", "Landroidx/lifecycle/LiveData;", "Landroid/content/Context;", "user", "Lcom/delta/playandroidpro/login/bean/User;", "collectArticle", "_exception", "Landroidx/lifecycle/MutableLiveData;", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "cookie", "(Landroidx/lifecycle/MutableLiveData;Lcom/delta/playandroidpro/center/home/bean/entity/Article;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discollectArticle", "fetchHotKey", "", "_hotkeys", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/search/bean/entity/Hotkey;", "Lkotlin/collections/ArrayList;", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLocalHistory", "_history", "saveLocalHistory", "history", "search", "_searchResultFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "key", "searchViewModel", "Lcom/delta/playandroidpro/search/SearchViewModel;", "updateLocalHistory", "app_release"})
public final class SearchModel {
    
    public SearchModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchHotKey(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.search.bean.entity.Hotkey>> _hotkeys, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void loadLocalHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> _history, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<android.content.Context> context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> user) {
    }
    
    public final void saveLocalHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<android.content.Context> context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> user, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> history, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _exception) {
    }
    
    public final boolean checkIfExistsUserHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<android.content.Context> context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> user) {
        return false;
    }
    
    public final void updateLocalHistory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<android.content.Context> context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> user, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> history, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _exception) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>> _searchResultFlow, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.search.SearchViewModel searchViewModel) {
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