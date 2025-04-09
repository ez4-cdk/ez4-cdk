package com.delta.playandroid.viewmodel;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagingData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.repository.CollectRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.model.bean.entity.Website;
import kotlinx.coroutines.Dispatchers;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"J\u0019\u0010#\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J1\u0010%\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J)\u0010(\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020+J!\u0010,\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/delta/playandroid/viewmodel/CollectViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "collectRepo", "Lcom/delta/playandroid/data/model/repository/CollectRepo;", "(Lcom/delta/playandroid/data/model/repository/CollectRepo;)V", "_exceptionMSG", "Landroidx/lifecycle/MutableLiveData;", "", "articles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "getArticles", "()Lkotlinx/coroutines/flow/Flow;", "setArticles", "(Lkotlinx/coroutines/flow/Flow;)V", "exceptionMSG", "Landroidx/lifecycle/LiveData;", "getExceptionMSG", "()Landroidx/lifecycle/LiveData;", "websites", "", "Lcom/delta/playandroid/data/model/bean/entity/Website;", "getWebsites", "addCollectArticle", "", "name", "link", "author", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCollectWebsite", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "id", "", "deleteCollectWebsite", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editCollectArticle", "title", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editCollectWebsite", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectWebs", "", "uncollect", "originId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CollectViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.CollectRepo collectRepo = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> articles;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.delta.playandroid.data.model.bean.entity.Website>> websites = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _exceptionMSG;
    
    @javax.inject.Inject
    public CollectViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.CollectRepo collectRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.delta.playandroid.data.model.bean.entity.Website>> getWebsites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getExceptionMSG() {
        return null;
    }
    
    public final void getCollectWebs() {
    }
    
    public final boolean collect(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object uncollect(int id, int originId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectArticle(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCollectWebsite(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addCollectArticle(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object editCollectWebsite(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCollectWebsite(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}