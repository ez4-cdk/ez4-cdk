package com.delta.playandroidpro.login;

/**
 * @description 登录model
 * @author delta
 * @date 2025/2/4 17:27
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J]\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u000fj\b\u0012\u0004\u0012\u00020\u000b`\u00100\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J7\u0010\u001a\u001a\u00020\u00062\u001c\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u001cj\b\u0012\u0004\u0012\u00020\t`\u001d0\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/delta/playandroidpro/login/LoginModel;", "", "()V", "gson", "Lcom/google/gson/Gson;", "login", "", "_loginStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/delta/playandroidpro/login/bean/User;", "username", "", "password", "_loginInfo", "_cookie", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvatar", "context", "Landroid/content/Context;", "user", "(Landroid/content/Context;Lcom/delta/playandroidpro/login/bean/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLastLoginUser", "_lastLoginUser", "(Landroidx/lifecycle/MutableLiveData;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLocalAutoLoginUser", "_autoLoginUsers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "saveLastLoginUser", "app_debug"})
public final class LoginModel {
    
    /**
     * 密码登录fragment
     */
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    public LoginModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readLocalAutoLoginUser(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.login.bean.User>> _autoLoginUsers, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.login.bean.User> _loginStatus, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _loginInfo, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.HashSet<java.lang.String>> _cookie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readLastLoginUser(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.login.bean.User> _lastLoginUser, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveLastLoginUser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.bean.User user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readAvatar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.bean.User user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}