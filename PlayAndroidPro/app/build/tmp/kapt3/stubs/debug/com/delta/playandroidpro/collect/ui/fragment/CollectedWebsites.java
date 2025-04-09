package com.delta.playandroidpro.collect.ui.fragment;

/**
 * @description 收藏网站页面
 * @author delta
 * @date 2025/3/3 11:51
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/fragment/CollectedWebsites;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/CollectFmBinding;", "Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$onWebsiteOperationsInterFace;", "()V", "adapter", "Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter;", "viewModel", "Lcom/delta/playandroidpro/collect/CollectViewModel;", "getViewModel", "()Lcom/delta/playandroidpro/collect/CollectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initView", "", "loaded", "loading", "onCollectWebsite", "", "website", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Website;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectWebsite", "onEditWebsite", "onReloadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowWebContents", "app_debug"})
public final class CollectedWebsites extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.CollectFmBinding> implements com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter.onWebsiteOperationsInterFace {
    private com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public CollectedWebsites() {
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
    public java.lang.Object onCollectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onDiscollectWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    public void onShowWebContents(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onEditWebsite(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object onReloadData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}