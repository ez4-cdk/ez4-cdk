package com.delta.playandroidpro;

/**
 * @description PlayAndroidPro APP
 * @author delta
 * @date 2025/1/18 15:39
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\f2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/delta/playandroidpro/PlayAndroidPro;", "Landroid/app/Application;", "()V", "cookie", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "user", "Lcom/delta/playandroidpro/login/bean/User;", "getCookie", "getUser", "saveUser", "", "setCookie", "setUser", "app_debug"})
public final class PlayAndroidPro extends android.app.Application {
    @org.jetbrains.annotations.Nullable
    private java.util.HashSet<java.lang.String> cookie;
    @org.jetbrains.annotations.Nullable
    private com.delta.playandroidpro.login.bean.User user;
    
    public PlayAndroidPro() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.delta.playandroidpro.login.bean.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable
    com.delta.playandroidpro.login.bean.User user) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.HashSet<java.lang.String> getCookie() {
        return null;
    }
    
    public final void setCookie(@org.jetbrains.annotations.NotNull
    java.util.HashSet<java.lang.String> cookie) {
    }
    
    public final void saveUser() {
    }
}