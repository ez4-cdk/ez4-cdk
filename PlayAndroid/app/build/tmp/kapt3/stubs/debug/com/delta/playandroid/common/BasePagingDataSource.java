package com.delta.playandroid.common;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Website;
import kotlin.Result;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003BI\u0012.\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J#\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroid/common/BasePagingDataSource;", "Object", "", "Landroidx/paging/PagingSource;", "", "loadData", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "CLASS_TYPE", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Class;)V", "Lkotlin/jvm/functions/Function2;", "getLastItem", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BasePagingDataSource<Object extends java.lang.Object> extends androidx.paging.PagingSource<java.lang.Integer, Object> {
    private final kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends Object>>>, java.lang.Object> loadData = null;
    private final java.lang.Class<Object> CLASS_TYPE = null;
    
    public BasePagingDataSource(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends Object>>>, ? extends java.lang.Object> loadData, @org.jetbrains.annotations.NotNull
    java.lang.Class<Object> CLASS_TYPE) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, Object> state) {
        return null;
    }
    
    private final java.util.List<Object> getLastItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Object>> continuation) {
        return null;
    }
}