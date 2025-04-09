package com.delta.playandroidpro.search.ui.fragment;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/delta/playandroidpro/search/ui/fragment/SearchResult;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/SearchResultBinding;", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;", "()V", "adapter", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "getAdapter", "()Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "cookie", "", "getCookie", "()Ljava/lang/String;", "cookie$delegate", "viewModel", "Lcom/delta/playandroidpro/search/SearchViewModel;", "getViewModel", "()Lcom/delta/playandroidpro/search/SearchViewModel;", "viewModel$delegate", "initView", "", "loaded", "loading", "onCollectArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectArticle", "onShowArticleInWeb", "search", "text", "app_debug"})
public final class SearchResult extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.SearchResultBinding> implements com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.onArticleClickInterFace {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cookie$delegate = null;
    
    public SearchResult() {
        super(0, null);
    }
    
    private final com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter getAdapter() {
        return null;
    }
    
    private final com.delta.playandroidpro.search.SearchViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.String getCookie() {
        return null;
    }
    
    @java.lang.Override
    public void loading() {
    }
    
    @java.lang.Override
    public void loaded() {
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onDiscollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onShowArticleInWeb(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}