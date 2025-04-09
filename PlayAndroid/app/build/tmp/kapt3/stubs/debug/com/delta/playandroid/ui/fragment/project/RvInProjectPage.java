package com.delta.playandroid.ui.fragment.project;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.delta.playandroid.R;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.databinding.RvPageBinding;
import com.delta.playandroid.ui.activity.WebViewActivity;
import com.delta.playandroid.ui.adapter.ProjectListAdapter;
import com.delta.playandroid.viewmodel.TreeViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/delta/playandroid/ui/fragment/project/RvInProjectPage;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/RvPageBinding;", "Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$onProjectItemClickListener;", "cid", "", "(I)V", "rvAdapter", "Lcom/delta/playandroid/ui/adapter/ProjectListAdapter;", "rvViewModel", "Lcom/delta/playandroid/viewmodel/TreeViewModel;", "getRvViewModel", "()Lcom/delta/playandroid/viewmodel/TreeViewModel;", "rvViewModel$delegate", "Lkotlin/Lazy;", "initView", "", "onItemClick", "url", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RvInProjectPage extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.RvPageBinding> implements com.delta.playandroid.ui.adapter.ProjectListAdapter.onProjectItemClickListener {
    private final int cid = 0;
    private final kotlin.Lazy rvViewModel$delegate = null;
    private com.delta.playandroid.ui.adapter.ProjectListAdapter rvAdapter;
    
    public RvInProjectPage(int cid) {
        super(0, null);
    }
    
    private final com.delta.playandroid.viewmodel.TreeViewModel getRvViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
}