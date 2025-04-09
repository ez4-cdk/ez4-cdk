package com.delta.playandroidpro.center.home.ui.adapter;

/**
 * @description 轮播图适配器
 * @author delta
 * @date 2025/2/8 11:08
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$BannerViewHolder;", "onBannerClickListener", "Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$onBannerClick;", "(Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$onBannerClick;)V", "bannerList", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/center/home/bean/entity/Banner;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBannerList", "", "BannerViewHolder", "onBannerClick", "app_release"})
public final class BannerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.BannerViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.onBannerClick onBannerClickListener = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.delta.playandroidpro.center.home.bean.entity.Banner> bannerList;
    
    public BannerAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.onBannerClick onBannerClickListener) {
        super();
    }
    
    public final void setBannerList(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.center.home.bean.entity.Banner> bannerList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.BannerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.ui.adapter.BannerAdapter.BannerViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter;Landroid/view/View;)V", "bannerImageText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "bannerImageView", "Landroid/widget/ImageView;", "bind", "", "banner", "Lcom/delta/playandroidpro/center/home/bean/entity/Banner;", "app_release"})
    public final class BannerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView bannerImageText = null;
        private final android.widget.ImageView bannerImageView = null;
        
        public BannerViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Banner banner) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/BannerAdapter$onBannerClick;", "", "onBannerClick", "", "url", "", "app_release"})
    public static abstract interface onBannerClick {
        
        public abstract void onBannerClick(@org.jetbrains.annotations.NotNull
        java.lang.String url);
    }
}