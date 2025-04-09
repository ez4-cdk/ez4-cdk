package com.delta.playandroid.ui.adapter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.provider.ContactsContract.Data;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.delta.playandroid.R;
import com.delta.playandroid.WanAndroidApp;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.databinding.ArticleItemBinding;
import com.delta.playandroid.databinding.EditCollectArticleBinding;
import com.delta.playandroid.databinding.FooterItemBinding;
import com.delta.playandroid.ui.activity.WebViewActivity;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u001b\u001c\u001d\u001e\u001f B-\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "collectedArticles", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isCollectPage", "", "onClickListener", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$clickInterface;", "(Ljava/util/ArrayList;ZLcom/delta/playandroid/ui/adapter/ArticleListAdapter$clickInterface;)V", "getItemViewType", "", "position", "isCollect", "id", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showInputDialog", "context", "Landroid/content/Context;", "Companion", "FooterViewHolder", "ItemViewHolder", "clickInterface", "collectedClickListener", "uncollectedClickListener", "app_debug"})
public final class ArticleListAdapter extends androidx.paging.PagingDataAdapter<com.delta.playandroid.data.model.bean.entity.Article, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Article> collectedArticles = null;
    private final boolean isCollectPage = false;
    private final com.delta.playandroid.ui.adapter.ArticleListAdapter.clickInterface onClickListener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.ui.adapter.ArticleListAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_FOOTER = 1;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.delta.playandroid.data.model.bean.entity.Article> COMPARATOR = null;
    
    public ArticleListAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Article> collectedArticles, boolean isCollectPage, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.ArticleListAdapter.clickInterface onClickListener) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final void showInputDialog(android.content.Context context, int position) {
    }
    
    private final boolean isCollect(int id) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$clickInterface;", "", "onArticleCollect", "", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onArticleItemClick", "", "url", "", "app_debug"})
    public static abstract interface clickInterface {
        
        public abstract void onArticleItemClick(@org.jetbrains.annotations.NotNull
        java.lang.String url);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onArticleCollect(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$uncollectedClickListener;", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$clickInterface;", "onArticleUnCollect", "", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface uncollectedClickListener extends com.delta.playandroid.ui.adapter.ArticleListAdapter.clickInterface {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onArticleUnCollect(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$collectedClickListener;", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$clickInterface;", "editCollectArticle", "", "id", "", "title", "", "link", "author", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onArticleUnCollect", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFooterClick", "", "app_debug"})
    public static abstract interface collectedClickListener extends com.delta.playandroid.ui.adapter.ArticleListAdapter.clickInterface {
        
        public abstract void onFooterClick();
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object onArticleUnCollect(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object editCollectArticle(int id, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String link, @org.jetbrains.annotations.NotNull
        java.lang.String author, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/playandroid/databinding/FooterItemBinding;", "(Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;Lcom/delta/playandroid/databinding/FooterItemBinding;)V", "app_debug"})
    public final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.databinding.FooterItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/playandroid/databinding/ArticleItemBinding;", "(Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;Lcom/delta/playandroid/databinding/ArticleItemBinding;)V", "collect", "", "transitionDrawable", "Landroid/graphics/drawable/TransitionDrawable;", "bind", "", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.delta.playandroid.databinding.ArticleItemBinding binding = null;
        private boolean collect = false;
        private android.graphics.drawable.TransitionDrawable transitionDrawable;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.databinding.ArticleItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.model.bean.entity.Article article) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$Companion;", "", "()V", "COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "VIEW_TYPE_FOOTER", "", "VIEW_TYPE_ITEM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}