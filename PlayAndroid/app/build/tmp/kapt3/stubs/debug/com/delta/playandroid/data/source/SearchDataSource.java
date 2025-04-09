package com.delta.playandroid.data.source;

import android.util.Log;
import com.delta.playandroid.common.BasePagingDataSource;
import com.delta.playandroid.data.api.SearchAPI;
import com.delta.playandroid.data.model.bean.entity.Article;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/delta/playandroid/data/source/SearchDataSource;", "Lcom/delta/playandroid/common/BasePagingDataSource;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "searchAPI", "Lcom/delta/playandroid/data/api/SearchAPI;", "key", "", "(Lcom/delta/playandroid/data/api/SearchAPI;Ljava/lang/String;)V", "app_debug"})
public final class SearchDataSource extends com.delta.playandroid.common.BasePagingDataSource<com.delta.playandroid.data.model.bean.entity.Article> {
    private final com.delta.playandroid.data.api.SearchAPI searchAPI = null;
    private final java.lang.String key = null;
    
    public SearchDataSource(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.SearchAPI searchAPI, @org.jetbrains.annotations.NotNull
    java.lang.String key) {
        super(null, null);
    }
}