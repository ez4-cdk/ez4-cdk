package com.delta.playandroidpro.search.ui.adapter;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter;", "T", "", "onQueryTextClickListener", "Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;", "(Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;)V", "getOnQueryTextClickListener", "()Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;", "addInfo", "", "tags", "", "box", "Lcom/google/android/flexbox/FlexboxLayout;", "OnQueryTextClickListener", "app_release"})
public final class SearchInfoAdapter<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener onQueryTextClickListener = null;
    
    public SearchInfoAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener onQueryTextClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener getOnQueryTextClickListener() {
        return null;
    }
    
    public final void addInfo(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> tags, @org.jetbrains.annotations.NotNull
    com.google.android.flexbox.FlexboxLayout box) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/search/ui/adapter/SearchInfoAdapter$OnQueryTextClickListener;", "", "onSearchTextClick", "", "text", "", "app_release"})
    public static abstract interface OnQueryTextClickListener {
        
        public abstract void onSearchTextClick(@org.jetbrains.annotations.NotNull
        java.lang.String text);
    }
}