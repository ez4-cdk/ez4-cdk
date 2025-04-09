package com.delta.playandroid.ui.fragment.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.delta.playandroid.R;
import com.delta.playandroid.WanAndroidApp;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.databinding.BannerAndRvBinding;
import com.delta.playandroid.ui.activity.LoginActivity;
import com.delta.playandroid.ui.activity.WebViewActivity;
import com.delta.playandroid.ui.adapter.ArticleListAdapter;
import com.delta.playandroid.ui.adapter.BannerAdapter;
import com.delta.playandroid.viewmodel.ArticleViewModel;
import com.delta.playandroid.viewmodel.BannerViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\u0019\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010\'\u001a\u00020\u001aH\u0016J\b\u0010(\u001a\u00020\u001aH\u0017J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/delta/playandroid/ui/fragment/home/HomeRoot;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/BannerAndRvBinding;", "Lcom/delta/playandroid/ui/adapter/BannerAdapter$onBannerClickListener;", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter$uncollectedClickListener;", "()V", "articleListAdapter", "Lcom/delta/playandroid/ui/adapter/ArticleListAdapter;", "articleViewModel", "Lcom/delta/playandroid/viewmodel/ArticleViewModel;", "getArticleViewModel", "()Lcom/delta/playandroid/viewmodel/ArticleViewModel;", "articleViewModel$delegate", "Lkotlin/Lazy;", "bannerAdapter", "Lcom/delta/playandroid/ui/adapter/BannerAdapter;", "bannerViewModel", "Lcom/delta/playandroid/viewmodel/BannerViewModel;", "getBannerViewModel", "()Lcom/delta/playandroid/viewmodel/BannerViewModel;", "bannerViewModel$delegate", "handler", "Landroid/os/Handler;", "runnable", "Ljava/lang/Runnable;", "initBanner", "", "initHeadArticleRecyclerView", "initView", "onArticleCollect", "", "article", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lcom/delta/playandroid/data/model/bean/entity/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onArticleItemClick", "url", "", "onArticleUnCollect", "onBannerClick", "onPause", "onResume", "onStart", "startBanner", "stopBanner", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeRoot extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.BannerAndRvBinding> implements com.delta.playandroid.ui.adapter.BannerAdapter.onBannerClickListener, com.delta.playandroid.ui.adapter.ArticleListAdapter.uncollectedClickListener {
    private final kotlin.Lazy articleViewModel$delegate = null;
    private final kotlin.Lazy bannerViewModel$delegate = null;
    private com.delta.playandroid.ui.adapter.ArticleListAdapter articleListAdapter;
    private com.delta.playandroid.ui.adapter.BannerAdapter bannerAdapter;
    
    /**
     * @Date:2024/11/19
     * @Destription:加上了忘记写的自动轮播功能
     */
    private final android.os.Handler handler = null;
    private final java.lang.Runnable runnable = null;
    
    public HomeRoot() {
        super(0, null);
    }
    
    private final com.delta.playandroid.viewmodel.ArticleViewModel getArticleViewModel() {
        return null;
    }
    
    private final com.delta.playandroid.viewmodel.BannerViewModel getBannerViewModel() {
        return null;
    }
    
    private final void startBanner() {
    }
    
    private final void stopBanner() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final void initBanner() {
    }
    
    private final void initHeadArticleRecyclerView() {
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onBannerClick(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
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
}