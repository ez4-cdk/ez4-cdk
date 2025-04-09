package com.delta.playandroid.ui.activity;

import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.paging.PagingData;
import com.delta.playandroid.R;
import com.delta.playandroid.databinding.SearchRootBinding;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.ui.adapter.SearchAdapter;
import com.delta.playandroid.ui.fragment.search.SearchResult;
import com.delta.playandroid.ui.fragment.search.Searching;
import com.delta.playandroid.viewmodel.SearchViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroid/ui/activity/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/delta/playandroid/databinding/SearchRootBinding;", "searchInfoFragment", "Lcom/delta/playandroid/ui/fragment/search/Searching;", "searchViewModel", "Lcom/delta/playandroid/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lcom/delta/playandroid/viewmodel/SearchViewModel;", "searchViewModel$delegate", "Lkotlin/Lazy;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "searching", "showResultFragment", "pagingData", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.delta.playandroid.databinding.SearchRootBinding binding;
    private com.delta.playandroid.ui.fragment.search.Searching searchInfoFragment;
    private final kotlin.Lazy searchViewModel$delegate = null;
    
    public SearchActivity() {
        super();
    }
    
    private final com.delta.playandroid.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void initView() {
    }
    
    private final void showResultFragment(com.delta.playandroid.viewmodel.SearchViewModel searchViewModel, androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article> pagingData) {
    }
    
    private final void searching() {
    }
}