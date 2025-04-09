package com.delta.playandroidpro.center.coin;

/**
 * @description 积分模块VIEWMODEL
 * @author delta
 * @date 2025/3/5 10:45
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u0013\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\rR \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/delta/playandroidpro/center/coin/CoinViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_coinDetail", "Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroidpro/center/coin/bean/entity/CoinDetail;", "_coinInfo", "Lcom/delta/playandroidpro/center/coin/bean/entity/Coin;", "_cookie", "", "_user", "Lcom/delta/playandroidpro/login/bean/User;", "coinDetail", "Landroidx/lifecycle/LiveData;", "getCoinDetail", "()Landroidx/lifecycle/LiveData;", "coinInfo", "getCoinInfo", "coinModel", "Lcom/delta/playandroidpro/center/coin/CoinModel;", "cookie", "getCookie", "user", "getUser", "getCoinDetailInfo", "", "setCookie", "setUser", "app_release"})
public final class CoinViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.delta.playandroidpro.center.coin.CoinModel coinModel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.login.bean.User> _user = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _cookie = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.center.coin.bean.entity.Coin> _coinInfo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail>>> _coinDetail = null;
    
    public CoinViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getCookie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroidpro.center.coin.bean.entity.Coin> getCoinInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail>>> getCoinDetail() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.bean.User user) {
    }
    
    public final void setCookie(@org.jetbrains.annotations.NotNull
    java.lang.String cookie) {
    }
    
    public final void getCoinInfo() {
    }
    
    public final void getCoinDetailInfo() {
    }
}