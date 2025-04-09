package com.delta.playandroidpro.center.home.ui;

/**
 * @description 首页
 * @author delta
 * @date 2025/2/8 16:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u0019\u0010&\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/Home;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/HomeBinding;", "Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$onBannerClick;", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;", "()V", "articleAdapter", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "bannerAdapter", "Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter;", "bannerRun", "Ljava/lang/Runnable;", "cookie", "", "getCookie", "()Ljava/lang/String;", "cookie$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "viewModel", "Lcom/delta/playandroidpro/center/home/HomeViewModel;", "initArticleList", "", "initBanner", "initView", "loaded", "loading", "onBannerClick", "url", "onCollectArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectArticle", "onPause", "onResume", "onShowArticleInWeb", "app_release"})
public final class Home extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.HomeBinding> implements com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.onBannerClick, com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.onArticleClickInterFace {
    private com.delta.playandroidpro.center.home.HomeViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cookie$delegate = null;
    private com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter articleAdapter;
    private com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter bannerAdapter;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable bannerRun = null;
    
    public Home() {
        super(0, null);
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
    
    private final void initArticleList() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    private final void initBanner() {
    }
    
    @java.lang.Override
    public void onBannerClick(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
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