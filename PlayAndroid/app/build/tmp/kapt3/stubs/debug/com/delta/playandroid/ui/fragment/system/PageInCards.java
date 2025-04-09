package com.delta.playandroid.ui.fragment.system;

import com.delta.playandroid.R;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.databinding.TabAndViewpagerBinding;
import com.delta.playandroid.ui.adapter.TabViewpagerAdapter;
import com.delta.playandroid.viewmodel.TabViewpagerViewModel;
import com.google.android.material.tabs.TabLayoutMediator;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/delta/playandroid/ui/fragment/system/PageInCards;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/TabAndViewpagerBinding;", "columnId", "", "childId", "(II)V", "tabViewpagerViewModel", "Lcom/delta/playandroid/viewmodel/TabViewpagerViewModel;", "getTabViewpagerViewModel", "()Lcom/delta/playandroid/viewmodel/TabViewpagerViewModel;", "tabViewpagerViewModel$delegate", "Lkotlin/Lazy;", "viewPagerAdapter", "Lcom/delta/playandroid/ui/adapter/TabViewpagerAdapter;", "initView", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class PageInCards extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.TabAndViewpagerBinding> {
    private final int columnId = 0;
    private final int childId = 0;
    private com.delta.playandroid.ui.adapter.TabViewpagerAdapter viewPagerAdapter;
    private final kotlin.Lazy tabViewpagerViewModel$delegate = null;
    
    public PageInCards(int columnId, int childId) {
        super(0, null);
    }
    
    private final com.delta.playandroid.viewmodel.TabViewpagerViewModel getTabViewpagerViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
}