package com.delta.playandroidpro.center.system.ui.fragment;

/**
 * @description 标签下文章的界面
 * @author delta
 * @date 2025/2/26 16:15
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0011J \u0010&\u001a\u00020\u001a2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0013j\b\u0012\u0004\u0012\u00020\f`\'H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/delta/playandroidpro/center/system/ui/fragment/Articles;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/ArticlesBinding;", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;", "()V", "adapter", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "getAdapter", "()Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "cookie", "", "getCookie", "()Ljava/lang/String;", "cookie$delegate", "expandPosition", "", "tabList", "Ljava/util/ArrayList;", "viewModel", "Lcom/delta/playandroidpro/center/system/SystemViewModel;", "getViewModel", "()Lcom/delta/playandroidpro/center/system/SystemViewModel;", "viewModel$delegate", "initView", "", "loaded", "loading", "onCollectArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectArticle", "onShowArticleInWeb", "setExpandPosition", "position", "setUpTabLayout", "Lkotlin/collections/ArrayList;", "app_release"})
public final class Articles extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.ArticlesBinding> implements com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.onArticleClickInterFace {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> tabList;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy adapter$delegate = null;
    private int expandPosition = -1;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cookie$delegate = null;
    
    public Articles() {
        super(0, null);
    }
    
    private final com.delta.playandroidpro.center.system.SystemViewModel getViewModel() {
        return null;
    }
    
    private final com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter getAdapter() {
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
    
    private final void setUpTabLayout(java.util.ArrayList<java.lang.String> tabList) {
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
    
    public final void setExpandPosition(int position) {
    }
}