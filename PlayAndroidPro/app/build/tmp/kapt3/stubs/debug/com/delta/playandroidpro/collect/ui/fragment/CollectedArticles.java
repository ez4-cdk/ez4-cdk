package com.delta.playandroidpro.collect.ui.fragment;

/**
 * @description 收藏文章页面
 * @author delta
 * @date 2025/3/3 11:36
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/fragment/CollectedArticles;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/CollectFmBinding;", "Lcom/delta/playandroidpro/center/home/ui/adapter/CollectArticlesAdapter$onArticleClickInterFace;", "()V", "adapter", "Lcom/delta/playandroidpro/center/home/ui/adapter/CollectArticlesAdapter;", "viewModel", "Lcom/delta/playandroidpro/collect/CollectViewModel;", "getViewModel", "()Lcom/delta/playandroidpro/collect/CollectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addOutsideArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editArticle", "initView", "", "loaded", "loading", "onCollectArticle", "onDiscollectArticle", "onShowArticleInWeb", "app_debug"})
public final class CollectedArticles extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.CollectFmBinding> implements com.delta.playandroidpro.center.home.ui.adapter.CollectArticlesAdapter.onArticleClickInterFace {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.delta.playandroidpro.center.home.ui.adapter.CollectArticlesAdapter adapter;
    
    public CollectedArticles() {
        super(0, null);
    }
    
    private final com.delta.playandroidpro.collect.CollectViewModel getViewModel() {
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
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object editArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addOutsideArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}