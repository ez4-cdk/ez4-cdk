package com.delta.playandroidpro.center.home.ui.adapter;

/**
 * 首页文章
 * 点击标题时跳转到文章详情页面
 * 点击作者时展示作者的文章
 * 点击Tag时展示该标签下的文章
 * 点击♥时收藏或取消收藏文章
 * 收藏页面
 * 长按可以编辑
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0015\u0016\u0017\u0018B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "user", "Lcom/delta/playandroidpro/login/bean/User;", "onArticleClick", "Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;", "(Lcom/delta/playandroidpro/login/bean/User;Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;)V", "getUser", "()Lcom/delta/playandroidpro/login/bean/User;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ArticleViewHolder", "Companion", "FooterViewHolder", "onArticleClickInterFace", "app_release"})
public final class ArticleAdapter extends androidx.paging.PagingDataAdapter<com.delta.playandroidpro.center.home.bean.entity.Article, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private final com.delta.playandroidpro.login.bean.User user = null;
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.onArticleClickInterFace onArticleClick = null;
    public static final int TYPE_ARTICLE = 0;
    public static final int TYPE_FOOTER = 1;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroidpro.center.home.bean.entity.Article> COMPARATOR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.Companion Companion = null;
    
    public ArticleAdapter(@org.jetbrains.annotations.Nullable
    com.delta.playandroidpro.login.bean.User user, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.center.home.ui.adapter.ArticleAdapter.onArticleClickInterFace onArticleClick) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.delta.playandroidpro.login.bean.User getUser() {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$ArticleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "articleItemBinding", "Lcom/delta/playandroidpro/databinding/ArticleBinding;", "(Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;Lcom/delta/playandroidpro/databinding/ArticleBinding;)V", "getArticleItemBinding", "()Lcom/delta/playandroidpro/databinding/ArticleBinding;", "bind", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "app_release"})
    public final class ArticleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.playandroidpro.databinding.ArticleBinding articleItemBinding = null;
        
        public ArticleViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.ArticleBinding articleItemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroidpro.databinding.ArticleBinding getArticleItemBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Article article) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$Companion;", "", "()V", "COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "TYPE_ARTICLE", "", "TYPE_FOOTER", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "footerBinding", "Lcom/delta/playandroidpro/databinding/FooterBinding;", "(Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter;Lcom/delta/playandroidpro/databinding/FooterBinding;)V", "getFooterBinding", "()Lcom/delta/playandroidpro/databinding/FooterBinding;", "bind", "", "app_release"})
    public final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.playandroidpro.databinding.FooterBinding footerBinding = null;
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.databinding.FooterBinding footerBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroidpro.databinding.FooterBinding getFooterBinding() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/delta/playandroidpro/center/home/ui/adapter/ArticleAdapter$onArticleClickInterFace;", "", "onCollectArticle", "", "article", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "(Lcom/delta/playandroidpro/center/home/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDiscollectArticle", "onShowArticleInWeb", "", "app_release"})
    public static abstract interface onArticleClickInterFace {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onCollectArticle(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onDiscollectArticle(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onShowArticleInWeb(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.center.home.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    }
}