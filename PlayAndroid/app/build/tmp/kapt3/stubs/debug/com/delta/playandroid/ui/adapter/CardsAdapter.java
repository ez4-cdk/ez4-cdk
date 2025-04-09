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
import com.google.android.flexbox.FlexboxLayout;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/delta/playandroid/ui/adapter/CardsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/delta/playandroid/ui/adapter/CardsAdapter$TreePageDirAdapterViewHolder;", "listener", "Lcom/delta/playandroid/ui/adapter/CardsAdapter$onDirClickListener;", "(Lcom/delta/playandroid/ui/adapter/CardsAdapter$onDirClickListener;)V", "cardInfoList", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "textviewParams", "Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;", "addInfo", "", "dirList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TreePageDirAdapterViewHolder", "onDirClickListener", "app_debug"})
public final class CardsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.delta.playandroid.ui.adapter.CardsAdapter.TreePageDirAdapterViewHolder> {
    private final com.delta.playandroid.ui.adapter.CardsAdapter.onDirClickListener listener = null;
    private java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column> cardInfoList;
    private final com.google.android.flexbox.FlexboxLayout.LayoutParams textviewParams = null;
    
    public CardsAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.CardsAdapter.onDirClickListener listener) {
        super();
    }
    
    public final void addInfo(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroid.data.model.bean.entity.Column> dirList) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.delta.playandroid.ui.adapter.CardsAdapter.TreePageDirAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.CardsAdapter.TreePageDirAdapterViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/playandroid/ui/adapter/CardsAdapter$onDirClickListener;", "", "onDirClick", "", "columnId", "", "childId", "app_debug"})
    public static abstract interface onDirClickListener {
        
        public abstract void onDirClick(int columnId, int childId);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/delta/playandroid/ui/adapter/CardsAdapter$TreePageDirAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/delta/playandroid/ui/adapter/CardsAdapter;Landroid/view/View;)V", "container", "Lcom/google/android/flexbox/FlexboxLayout;", "kotlin.jvm.PlatformType", "getContainer", "()Lcom/google/android/flexbox/FlexboxLayout;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getView", "()Landroid/view/View;", "app_debug"})
    public final class TreePageDirAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.view.View view = null;
        private final com.google.android.flexbox.FlexboxLayout container = null;
        private final android.widget.TextView title = null;
        
        public TreePageDirAdapterViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getView() {
            return null;
        }
        
        public final com.google.android.flexbox.FlexboxLayout getContainer() {
            return null;
        }
        
        public final android.widget.TextView getTitle() {
            return null;
        }
    }
}