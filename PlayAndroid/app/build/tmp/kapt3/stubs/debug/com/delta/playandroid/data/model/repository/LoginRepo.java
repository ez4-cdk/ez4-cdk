package com.delta.playandroid.data.model.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.bean.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import javax.inject.Inject;

/**
 * 登录
 * 注册
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\nJ/\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\'\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u00120\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/delta/playandroid/data/model/repository/LoginRepo;", "", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "(Lcom/delta/playandroid/data/api/ApiClient;Lcom/delta/playandroid/data/local/Manager/DataStoreManager;)V", "_autoLoginUser", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/User;", "_lastLoginUser", "apiService", "Lcom/delta/playandroid/data/api/LoginAPI;", "getApiService", "()Lcom/delta/playandroid/data/api/LoginAPI;", "autoLoginUser", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getAutoLoginUser", "()Landroidx/lifecycle/LiveData;", "lastLoginUser", "getLastLoginUser", "tokenType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "Login", "Lcom/delta/playandroid/common/Result;", "", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAutoLoginUser", "readLastLoginUser", "saveAutoLoginUser", "user", "saveLastLoginUser", "signUp", "repassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class LoginRepo {
    private final com.delta.playandroid.data.api.ApiClient apiClient = null;
    private final com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.data.model.repository.LoginRepo.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.delta.playandroid.data.model.repository.LoginRepo instance;
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroid.data.api.LoginAPI apiService = null;
    private final java.lang.reflect.Type tokenType = null;
    
    /**
     * 登录模块
     */
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.User> _lastLoginUser;
    
    /**
     * 自动登录模块
     */
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.User>> _autoLoginUser;
    
    @javax.inject.Inject
    public LoginRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.delta.playandroid.data.api.LoginAPI getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.User> getLastLoginUser() {
        return null;
    }
    
    public final void readLastLoginUser() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object Login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    public final void saveAutoLoginUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.User user) {
    }
    
    /**
     * 注册模块
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signUp(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String repassword, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.Result<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.User>> getAutoLoginUser() {
        return null;
    }
    
    public final void readAutoLoginUser() {
    }
    
    public final void saveLastLoginUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.User user) {
    }
    
    /**
     * 单例注入
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/playandroid/data/model/repository/LoginRepo$Companion;", "", "()V", "instance", "Lcom/delta/playandroid/data/model/repository/LoginRepo;", "getInstance", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroid.data.model.repository.LoginRepo getInstance(@org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
        com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
            return null;
        }
    }
}