package com.delta.playandroid.data.source;

import com.delta.playandroid.common.BasePagingDataSource;
import com.delta.playandroid.data.api.CollectAPI;
import com.delta.playandroid.data.model.bean.entity.Article;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/data/source/CollectArticlesDS;", "Lcom/delta/playandroid/common/BasePagingDataSource;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "collectAPI", "Lcom/delta/playandroid/data/api/CollectAPI;", "(Lcom/delta/playandroid/data/api/CollectAPI;)V", "app_debug"})
public final class CollectArticlesDS extends com.delta.playandroid.common.BasePagingDataSource<com.delta.playandroid.data.model.bean.entity.Article> {
    private final com.delta.playandroid.data.api.CollectAPI collectAPI = null;
    
    public CollectArticlesDS(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.CollectAPI collectAPI) {
        super(null, null);
    }
}