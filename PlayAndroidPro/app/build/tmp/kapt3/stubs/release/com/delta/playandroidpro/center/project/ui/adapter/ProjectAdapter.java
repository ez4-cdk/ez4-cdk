package com.delta.playandroidpro.center.project.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$viewHolder;", "onItemClickListener", "Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$onProjectItemClickListener;", "(Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$onProjectItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "onProjectItemClickListener", "viewHolder", "app_release"})
public final class ProjectAdapter extends androidx.paging.PagingDataAdapter<com.delta.playandroidpro.center.home.bean.entity.Article, com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.viewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.onProjectItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroidpro.center.home.bean.entity.Article> COMPARATOR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.Companion Companion = null;
    
    public ProjectAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.onProjectItemClickListener onItemClickListener) {
        super(null, null, null);
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.viewHolder holder, int position) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.delta.playandroidpro.center.project.ui.adapter.ProjectAdapter.viewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$Companion;", "", "()V", "COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$onProjectItemClickListener;", "", "onFirstItemLoaded", "", "onItemClick", "url", "", "app_release"})
    public static abstract interface onProjectItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        java.lang.String url);
        
        public abstract void onFirstItemLoaded();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter$viewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/playandroidpro/databinding/ProjectBinding;", "(Lcom/delta/playandroidpro/center/project/ui/adapter/ProjectAdapter;Lcom/delta/playandroidpro/databinding/ProjectBinding;)V", "bind", "", "project", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "app_release"})
    public final class viewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.playandroidpro.databinding.ProjectBinding binding = null;
        
        public viewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.ProjectBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Article project) {
        }
    }
}