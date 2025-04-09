package com.delta.playandroid.ui.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delta.playandroid.R;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.data.model.bean.entity.Hotkey;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Queue;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J&\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/playandroid/ui/adapter/SearchAdapter;", "T", "", "onQueryTextClickListener", "Lcom/delta/playandroid/ui/adapter/SearchAdapter$onSearchTextClickListener;", "(Lcom/delta/playandroid/ui/adapter/SearchAdapter$onSearchTextClickListener;)V", "texts", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "tvItems", "Landroid/widget/TextView;", "addInfo", "", "columnList", "flexboxLayout", "Lcom/google/android/flexbox/FlexboxLayout;", "onSearchTextClickListener", "app_debug"})
public final class SearchAdapter<T extends java.lang.Object> {
    private final com.delta.playandroid.ui.adapter.SearchAdapter.onSearchTextClickListener onQueryTextClickListener = null;
    private java.util.ArrayList<android.widget.TextView> tvItems;
    private java.util.ArrayList<java.lang.String> texts;
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.SearchAdapter.onSearchTextClickListener onQueryTextClickListener) {
        super();
    }
    
    public final void addInfo(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<T> columnList, @org.jetbrains.annotations.NotNull
    com.google.android.flexbox.FlexboxLayout flexboxLayout) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/ui/adapter/SearchAdapter$onSearchTextClickListener;", "", "onSearchTextClick", "", "text", "", "app_debug"})
    public static abstract interface onSearchTextClickListener {
        
        public abstract void onSearchTextClick(@org.jetbrains.annotations.NotNull
        java.lang.String text);
    }
}