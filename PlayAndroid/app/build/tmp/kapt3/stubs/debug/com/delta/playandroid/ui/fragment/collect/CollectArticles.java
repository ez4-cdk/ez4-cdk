package com.delta.playandroid.ui.fragment.collect;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.delta.playandroid.R;
import com.delta.playandroid.WanAndroidApp;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.databinding.EditCollectArticleBinding;
import com.delta.playandroid.databinding.RvPageBinding;
import com.delta.playandroid.ui.activity.WebViewActivity;
import com.delta.playandroid.ui.adapter.ArticleListAdapter;
import com.delta.playandroid.viewmodel.CollectViewModel;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0019\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/delta/playandroid/ui/fragment/collect/CollectArticles;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/RvPageBinding;", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$collectedClickListener;", "collectViewModel", "Lcom/delta/playandroid/viewmodel/CollectViewModel;", "(Lcom/delta/playandroid/viewmodel/CollectViewModel;)V", "addArticleDialogBuilder", "Landroidx/appcompat/app/AlertDialog$Builder;", "articleListAdapter", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;", "editCollectArticle", "", "id", "", "title", "", "link", "author", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initView", "", "onArticleCollect", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onArticleItemClick", "url", "onArticleUnCollect", "onFooterClick", "onResume", "app_debug"})
public final class CollectArticles extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.RvPageBinding> implements com.delta.playandroid.ui.adapter.ArticleListAdapter.collectedClickListener {
    private final com.delta.playandroid.viewmodel.CollectViewModel collectViewModel = null;
    private com.delta.playandroid.ui.adapter.ArticleListAdapter articleListAdapter;
    private androidx.appcompat.app.AlertDialog.Builder addArticleDialogBuilder;
    
    public CollectArticles(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.viewmodel.CollectViewModel collectViewModel) {
        super(0, null);
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onArticleItemClick(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object onArticleCollect(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object onArticleUnCollect(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object editCollectArticle(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String link, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void onFooterClick() {
    }
}