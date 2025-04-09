package com.delta.playandroid.viewmodel;

import androidx.paging.PagingData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.repository.SystemRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import com.delta.playandroid.common.Result;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006J\u0019\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroid/viewmodel/TreeViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "systemRepo", "Lcom/delta/playandroid/data/model/repository/SystemRepo;", "(Lcom/delta/playandroid/data/model/repository/SystemRepo;)V", "_cid", "", "articles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "getArticles", "()Lkotlinx/coroutines/flow/Flow;", "setArticles", "(Lkotlinx/coroutines/flow/Flow;)V", "collect", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchData", "", "setCid", "cid", "uncollect", "app_debug"})
public final class TreeViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.SystemRepo systemRepo = null;
    private int _cid = -1;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> articles;
    
    @javax.inject.Inject
    public TreeViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.SystemRepo systemRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> p0) {
    }
    
    public final void fetchData() {
    }
    
    public final void setCid(int cid) {
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