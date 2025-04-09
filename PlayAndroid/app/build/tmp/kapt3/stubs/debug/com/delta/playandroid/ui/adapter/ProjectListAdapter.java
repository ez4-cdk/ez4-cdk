package com.delta.playandroid.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.databinding.ProjectItemBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ProjectListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$viewHolder;", "onItemClickListener", "Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$onProjectItemClickListener;", "(Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$onProjectItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "onProjectItemClickListener", "viewHolder", "app_debug"})
public final class ProjectListAdapter extends androidx.paging.PagingDataAdapter<com.delta.playandroid.data.model.bean.entity.Article, com.delta.playandroid.ui.adapter.ProjectListAdapter.viewHolder> {
    private final com.delta.playandroid.ui.adapter.ProjectListAdapter.onProjectItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.ui.adapter.ProjectListAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroid.data.model.bean.entity.Article> COMPARATOR = null;
    
    public ProjectListAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.ProjectListAdapter.onProjectItemClickListener onItemClickListener) {
        super(null, null);
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.ProjectListAdapter.viewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.delta.playandroid.ui.adapter.ProjectListAdapter.viewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$onProjectItemClickListener;", "", "onItemClick", "", "url", "", "app_debug"})
    public static abstract interface onProjectItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        java.lang.String url);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$viewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/playandroid/databinding/ProjectItemBinding;", "(Lcom/delta/playandroid/ui/adapter/ProjectListAdapter;Lcom/delta/playandroid/databinding/ProjectItemBinding;)V", "bind", "", "project", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "app_debug"})
    public final class viewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.delta.playandroid.databinding.ProjectItemBinding binding = null;
        
        public viewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.databinding.ProjectItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.model.bean.entity.Article project) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ProjectListAdapter$Companion;", "", "()V", "COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}