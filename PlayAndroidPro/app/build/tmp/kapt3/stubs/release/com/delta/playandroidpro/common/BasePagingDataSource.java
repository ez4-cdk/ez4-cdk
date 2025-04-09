package com.delta.playandroidpro.common;

/**
 * @description 一个通用的PagingDataSource基类
 * @author delta
 * @date 2025/2/3 10:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003BI\u0012.\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/playandroidpro/common/BasePagingDataSource;", "item", "", "Landroidx/paging/PagingSource;", "", "loadData", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "CLASS_TYPE", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Class;)V", "Lkotlin/jvm/functions/Function2;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract class BasePagingDataSource<item extends java.lang.Object> extends androidx.paging.PagingSource<java.lang.Integer, item> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends item>>>, java.lang.Object> loadData = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<item> CLASS_TYPE = null;
    
    public BasePagingDataSource(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends item>>>, ? extends java.lang.Object> loadData, @org.jetbrains.annotations.NotNull
    java.lang.Class<item> CLASS_TYPE) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, item> state) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, item>> $completion) {
        return null;
    }
}