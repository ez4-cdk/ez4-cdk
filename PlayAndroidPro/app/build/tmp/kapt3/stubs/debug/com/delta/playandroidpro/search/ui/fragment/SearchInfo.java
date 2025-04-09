package com.delta.playandroidpro.search.ui.fragment;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\tR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/delta/playandroidpro/search/ui/fragment/SearchInfo;", "Lcom/delta/playandroidpro/common/BaseFragment;", "Lcom/delta/playandroidpro/databinding/SearchInfoBinding;", "Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;", "()V", "historyAdapter", "Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter;", "", "getHistoryAdapter", "()Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter;", "historyAdapter$delegate", "Lkotlin/Lazy;", "hotkeyAdapter", "Lcom/delta/playandroidpro/search/bean/entity/Hotkey;", "getHotkeyAdapter", "hotkeyAdapter$delegate", "viewModel", "Lcom/delta/playandroidpro/search/SearchViewModel;", "getViewModel", "()Lcom/delta/playandroidpro/search/SearchViewModel;", "viewModel$delegate", "initView", "", "loaded", "loading", "onSearchTextClick", "text", "app_debug"})
public final class SearchInfo extends com.delta.playandroidpro.common.BaseFragment<com.delta.playandroidpro.databinding.SearchInfoBinding> implements com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy hotkeyAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy historyAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public SearchInfo() {
        super(0, null);
    }
    
    private final com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter<com.delta.playandroidpro.search.bean.entity.Hotkey> getHotkeyAdapter() {
        return null;
    }
    
    private final com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter<java.lang.String> getHistoryAdapter() {
        return null;
    }
    
    private final com.delta.playandroidpro.search.SearchViewModel getViewModel() {
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
    public void onSearchTextClick(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
}