package com.delta.playandroidpro.center.coin;

/**
 * @description 积分详情适配器
 * @author delta
 * @date 2025/3/5 10:46
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/delta/playandroidpro/center/coin/DetailInfoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/delta/playandroidpro/center/coin/bean/entity/CoinDetail;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DetailInfoViewHolder", "app_release"})
public final class DetailInfoAdapter extends androidx.paging.PagingDataAdapter<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail> COMPARATOR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroidpro.center.coin.DetailInfoAdapter.Companion Companion = null;
    
    public DetailInfoAdapter() {
        super(null, null, null);
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/delta/playandroidpro/center/coin/DetailInfoAdapter$Companion;", "", "()V", "COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/delta/playandroidpro/center/coin/bean/entity/CoinDetail;", "getCOMPARATOR", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail> getCOMPARATOR() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroidpro/center/coin/DetailInfoAdapter$DetailInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "coinDetailBinding", "Lcom/delta/playandroidpro/databinding/CoinDetailBinding;", "(Lcom/delta/playandroidpro/center/coin/DetailInfoAdapter;Lcom/delta/playandroidpro/databinding/CoinDetailBinding;)V", "bind", "", "coinDetail", "Lcom/delta/playandroidpro/center/coin/bean/entity/CoinDetail;", "app_release"})
    public final class DetailInfoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.playandroidpro.databinding.CoinDetailBinding coinDetailBinding = null;
        
        public DetailInfoViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.CoinDetailBinding coinDetailBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.coin.bean.entity.CoinDetail coinDetail) {
        }
    }
}