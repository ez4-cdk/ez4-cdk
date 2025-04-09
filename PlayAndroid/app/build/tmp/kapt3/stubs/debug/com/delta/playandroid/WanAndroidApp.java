package com.delta.playandroid;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dagger.hilt.android.HiltAndroidApp;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J\u001e\u0010!\u001a\u00020\u001a2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u000bJ\u0010\u0010#\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/delta/playandroid/WanAndroidApp;", "Landroid/app/Application;", "()V", "_collectArticles", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "_user", "Lcom/delta/playandroid/data/model/bean/entity/User;", "collectArticles", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getCollectArticles", "()Landroidx/lifecycle/LiveData;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "getDataStoreManager", "()Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "setDataStoreManager", "(Lcom/delta/playandroid/data/local/Manager/DataStoreManager;)V", "tokenType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "user", "getUser", "addCollectArticle", "", "article", "onCreate", "readCollectArticles", "name", "", "removeCollectArticle", "saveCollectArticles", "articles", "setUser", "app_debug"})
@dagger.hilt.android.HiltAndroidApp
public final class WanAndroidApp extends android.app.Application {
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.User> _user;
    public com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager;
    
    /**
     * @Date 2024/11/20
     * @Description 修复了收藏文章在各个模块之间不同步的bug
     */
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Article>> _collectArticles;
    private final java.lang.reflect.Type tokenType = null;
    
    public WanAndroidApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.local.Manager.DataStoreManager getDataStoreManager() {
        return null;
    }
    
    public final void setDataStoreManager(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager p0) {
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable
    com.delta.playandroid.data.model.bean.entity.User user) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Article>> getCollectArticles() {
        return null;
    }
    
    public final void addCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article) {
    }
    
    public final void removeCollectArticle(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Article article) {
    }
    
    public final void readCollectArticles(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void saveCollectArticles(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Article> articles) {
    }
}