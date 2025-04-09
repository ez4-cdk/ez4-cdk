package com.delta.playandroid.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.delta.playandroid.R;
import com.delta.playandroid.databinding.CollectRootBinding;
import com.delta.playandroid.ui.adapter.ViewpagerAdapter;
import com.delta.playandroid.ui.fragment.collect.CollectArticles;
import com.delta.playandroid.ui.fragment.collect.CollectWebs;
import com.delta.playandroid.viewmodel.CollectViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/delta/playandroid/ui/activity/CollectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/delta/playandroid/databinding/CollectRootBinding;", "collectViewModel", "Lcom/delta/playandroid/viewmodel/CollectViewModel;", "getCollectViewModel", "()Lcom/delta/playandroid/viewmodel/CollectViewModel;", "collectViewModel$delegate", "Lkotlin/Lazy;", "fragmentsAdapter", "Lcom/delta/playandroid/ui/adapter/ViewpagerAdapter;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CollectActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.delta.playandroid.databinding.CollectRootBinding binding;
    private com.delta.playandroid.ui.adapter.ViewpagerAdapter fragmentsAdapter;
    private final kotlin.Lazy collectViewModel$delegate = null;
    
    public CollectActivity() {
        super();
    }
    
    private final com.delta.playandroid.viewmodel.CollectViewModel getCollectViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
}