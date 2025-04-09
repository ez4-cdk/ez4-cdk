package com.delta.playandroid.ui.fragment.system;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.delta.playandroid.R;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.databinding.DirRvBinding;
import com.delta.playandroid.ui.adapter.CardsAdapter;
import com.delta.playandroid.viewmodel.CardsViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroid/ui/fragment/system/Cards;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/DirRvBinding;", "Lcom/delta/playandroid/ui/adapter/CardsAdapter$onDirClickListener;", "()V", "cardsAdapter", "Lcom/delta/playandroid/ui/adapter/CardsAdapter;", "cardsViewModel", "Lcom/delta/playandroid/viewmodel/CardsViewModel;", "getCardsViewModel", "()Lcom/delta/playandroid/viewmodel/CardsViewModel;", "cardsViewModel$delegate", "Lkotlin/Lazy;", "initView", "", "onDirClick", "columnId", "", "childId", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class Cards extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.DirRvBinding> implements com.delta.playandroid.ui.adapter.CardsAdapter.onDirClickListener {
    private com.delta.playandroid.ui.adapter.CardsAdapter cardsAdapter;
    private final kotlin.Lazy cardsViewModel$delegate = null;
    
    public Cards() {
        super(0, null);
    }
    
    private final com.delta.playandroid.viewmodel.CardsViewModel getCardsViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onDirClick(int columnId, int childId) {
    }
}