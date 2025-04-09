package com.delta.playandroidpro.search;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/delta/playandroidpro/search/Search;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;", "()V", "searchInfo", "Lcom/delta/playandroidpro/search/ui/fragment/SearchInfo;", "getSearchInfo", "()Lcom/delta/playandroidpro/search/ui/fragment/SearchInfo;", "searchInfo$delegate", "Lkotlin/Lazy;", "searchResult", "Lcom/delta/playandroidpro/search/ui/fragment/SearchResult;", "getSearchResult", "()Lcom/delta/playandroidpro/search/ui/fragment/SearchResult;", "searchResult$delegate", "searchView", "Landroid/widget/SearchView;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSearchTextClick", "text", "", "showSearchInfo", "showSearchResult", "app_debug"})
public final class Search extends androidx.appcompat.app.AppCompatActivity implements com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy searchInfo$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy searchResult$delegate = null;
    private android.widget.SearchView searchView;
    
    public Search() {
        super();
    }
    
    private final com.delta.playandroidpro.search.ui.fragment.SearchInfo getSearchInfo() {
        return null;
    }
    
    private final com.delta.playandroidpro.search.ui.fragment.SearchResult getSearchResult() {
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
    
    private final void showSearchInfo() {
    }
    
    private final void showSearchResult() {
    }
    
    @java.lang.Override
    public void onSearchTextClick(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
}