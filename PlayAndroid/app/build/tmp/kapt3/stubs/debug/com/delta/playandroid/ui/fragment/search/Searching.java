package com.delta.playandroid.ui.fragment.search;

import com.delta.playandroid.R;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import com.delta.playandroid.databinding.SearchSearchingBinding;
import com.delta.playandroid.ui.adapter.SearchAdapter;
import com.delta.playandroid.viewmodel.SearchViewModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/delta/playandroid/ui/fragment/search/Searching;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/SearchSearchingBinding;", "searchViewModel", "Lcom/delta/playandroid/viewmodel/SearchViewModel;", "onSearchTextClickListener", "Lcom/delta/playandroid/ui/adapter/SearchAdapter$onSearchTextClickListener;", "(Lcom/delta/playandroid/viewmodel/SearchViewModel;Lcom/delta/playandroid/ui/adapter/SearchAdapter$onSearchTextClickListener;)V", "historyAdapter", "Lcom/delta/playandroid/ui/adapter/SearchAdapter;", "", "hotkeyAdapter", "Lcom/delta/playandroid/data/model/bean/entity/Hotkey;", "initView", "", "app_debug"})
public final class Searching extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.SearchSearchingBinding> {
    private final com.delta.playandroid.viewmodel.SearchViewModel searchViewModel = null;
    private final com.delta.playandroid.ui.adapter.SearchAdapter.onSearchTextClickListener onSearchTextClickListener = null;
    private com.delta.playandroid.ui.adapter.SearchAdapter<com.delta.playandroid.data.model.bean.entity.Hotkey> hotkeyAdapter;
    private com.delta.playandroid.ui.adapter.SearchAdapter<java.lang.String> historyAdapter;
    
    public Searching(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.viewmodel.SearchViewModel searchViewModel, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.SearchAdapter.onSearchTextClickListener onSearchTextClickListener) {
        super(0, null);
    }
    
    @java.lang.Override
    public void initView() {
    }
}