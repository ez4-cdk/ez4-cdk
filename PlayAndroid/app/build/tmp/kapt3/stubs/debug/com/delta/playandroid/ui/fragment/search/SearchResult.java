package com.delta.playandroid.ui.fragment.search;

import android.content.Intent;
import android.widget.Toast;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.delta.playandroid.R;
import com.delta.playandroid.WanAndroidApp;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.databinding.SearchResultRvBinding;
import com.delta.playandroid.ui.activity.LoginActivity;
import com.delta.playandroid.ui.activity.WebViewActivity;
import com.delta.playandroid.ui.adapter.ArticleListAdapter;
import com.delta.playandroid.viewmodel.SearchViewModel;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0019\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/delta/playandroid/ui/fragment/search/SearchResult;", "Lcom/delta/playandroid/common/BaseFragment;", "error/NonExistentClass", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$uncollectedClickListener;", "searchViewModel", "Lcom/delta/playandroid/viewmodel/SearchViewModel;", "pagingData", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/viewmodel/SearchViewModel;Landroidx/paging/PagingData;)V", "resultAdapter", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;", "initView", "", "onArticleCollect", "", "article", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onArticleItemClick", "url", "", "onArticleUnCollect", "app_debug"})
public final class SearchResult extends com.delta.playandroid.common.BaseFragment<error.NonExistentClass> implements com.delta.playandroid.ui.adapter.ArticleListAdapter.uncollectedClickListener {
    
    /**
     * @Date 2024/11/20
     * @Description: 修复了搜索结果不能收藏的BUG
     */
    private final com.delta.playandroid.viewmodel.SearchViewModel searchViewModel = null;
    private final androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article> pagingData = null;
    private com.delta.playandroid.ui.adapter.ArticleListAdapter resultAdapter;
    
    public SearchResult(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.viewmodel.SearchViewModel searchViewModel, @org.jetbrains.annotations.NotNull
    androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article> pagingData) {
        super(0, null);
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onArticleItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    /**
     * @Date 2024/11/20
     * @Description 添加了收藏的逻辑
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object onArticleCollect(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object onArticleUnCollect(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}