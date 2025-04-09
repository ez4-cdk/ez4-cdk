package com.delta.playandroid.data.interceptor;

import android.content.Context;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/delta/playandroid/data/interceptor/GetCookieInterceptor;", "Lokhttp3/Interceptor;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "(Lcom/delta/playandroid/data/local/Manager/DataStoreManager;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "saveCookie", "", "cookieSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "app_debug"})
public final class GetCookieInterceptor implements okhttp3.Interceptor {
    private final com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager = null;
    
    @javax.inject.Inject
    public GetCookieInterceptor(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final void saveCookie(java.util.HashSet<java.lang.String> cookieSet) {
    }
}