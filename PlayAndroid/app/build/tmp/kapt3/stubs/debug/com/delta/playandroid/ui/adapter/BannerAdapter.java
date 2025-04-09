package com.delta.playandroid.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.delta.playandroid.R;
import com.delta.playandroid.data.model.bean.entity.Banner;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/playandroid/ui/adapter/BannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/delta/playandroid/ui/adapter/BannerAdapter$viewHoder;", "clickListener", "Lcom/delta/playandroid/ui/adapter/BannerAdapter$onBannerClickListener;", "(Lcom/delta/playandroid/ui/adapter/BannerAdapter$onBannerClickListener;)V", "bannerInfoList", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Banner;", "addIt", "", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBannerClickListener", "viewHoder", "app_debug"})
public final class BannerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.delta.playandroid.ui.adapter.BannerAdapter.viewHoder> {
    private final com.delta.playandroid.ui.adapter.BannerAdapter.onBannerClickListener clickListener = null;
    private java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Banner> bannerInfoList;
    
    public BannerAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.BannerAdapter.onBannerClickListener clickListener) {
        super();
    }
    
    public final void addIt(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroid.data.model.bean.entity.Banner> bannerInfoList) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.delta.playandroid.ui.adapter.BannerAdapter.viewHoder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.BannerAdapter.viewHoder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/ui/adapter/BannerAdapter$onBannerClickListener;", "", "onBannerClick", "", "url", "", "app_debug"})
    public static abstract interface onBannerClickListener {
        
        public abstract void onBannerClick(@org.jetbrains.annotations.NotNull
        java.lang.String url);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/delta/playandroid/ui/adapter/BannerAdapter$viewHoder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/delta/playandroid/ui/adapter/BannerAdapter;Landroid/view/View;)V", "underText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getUnderText", "()Landroid/widget/TextView;", "upImage", "Landroid/widget/ImageView;", "getUpImage", "()Landroid/widget/ImageView;", "app_debug"})
    public final class viewHoder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView underText = null;
        private final android.widget.ImageView upImage = null;
        
        public viewHoder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getUnderText() {
            return null;
        }
        
        public final android.widget.ImageView getUpImage() {
            return null;
        }
    }
}