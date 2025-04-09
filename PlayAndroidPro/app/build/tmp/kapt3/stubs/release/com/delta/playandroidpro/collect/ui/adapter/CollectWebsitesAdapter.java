package com.delta.playandroidpro.collect.ui.adapter;

/**
 * @description 收藏网站页面的适配器
 * @author delta
 * @date 2025/3/3 11:34
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J \u0010\u0014\u001a\u00020\u000e2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onWebsiteOperations", "Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$onWebsiteOperationsInterFace;", "(Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$onWebsiteOperationsInterFace;)V", "websiteList", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setWebsiteList", "Lkotlin/collections/ArrayList;", "Companion", "FooterViewHolder", "WebsiteViewHolder", "onWebsiteOperationsInterFace", "app_release"})
public final class CollectWebsitesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter.onWebsiteOperationsInterFace onWebsiteOperations = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Website> websiteList;
    public static final int TYPE_WEBSITE = 0;
    public static final int TYPE_FOOTER = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter.Companion Companion = null;
    
    public CollectWebsitesAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.collect.ui.adapter.CollectWebsitesAdapter.onWebsiteOperationsInterFace onWebsiteOperations) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setWebsiteList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Website> websiteList) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$Companion;", "", "()V", "TYPE_FOOTER", "", "TYPE_WEBSITE", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "footerBinding", "Lcom/delta/playandroidpro/databinding/FooterBinding;", "(Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter;Lcom/delta/playandroidpro/databinding/FooterBinding;)V", "app_release"})
    public final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.FooterBinding footerBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$WebsiteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "websiteItemBinding", "Lcom/delta/playandroidpro/databinding/WebsiteBinding;", "(Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter;Lcom/delta/playandroidpro/databinding/WebsiteBinding;)V", "bind", "", "website", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "app_release"})
    public final class WebsiteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.playandroidpro.databinding.WebsiteBinding websiteItemBinding = null;
        
        public WebsiteViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.WebsiteBinding websiteItemBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Website website) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/delta/playandroidpro/collect/ui/adapter/CollectWebsitesAdapter$onWebsiteOperationsInterFace;", "", "onCollectWebsite", "", "website", "Lcom/delta/playandroidpro/center/home/bean/entity/Website;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Website;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectWebsite", "onEditWebsite", "onReloadData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowWebContents", "app_release"})
    public static abstract interface onWebsiteOperationsInterFace {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onCollectWebsite(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onDiscollectWebsite(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
        
        public abstract void onShowWebContents(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Website website);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onEditWebsite(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Website website, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onReloadData(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    }
}