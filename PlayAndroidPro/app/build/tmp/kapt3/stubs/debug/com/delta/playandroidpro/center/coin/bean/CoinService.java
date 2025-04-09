package com.delta.playandroidpro.center.coin.bean;

/**
 * @description 积分模块API
 * @author delta
 * @date 2025/3/5 10:44
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/delta/playandroidpro/center/coin/bean/CoinService;", "", "getMyCoinDetailInfo", "Lretrofit2/Response;", "Lcom/delta/playandroidpro/common/BaseResponse;", "Lcom/delta/playandroidpro/common/Pack;", "Lcom/delta/playandroidpro/center/coin/bean/entity/CoinDetail;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyCoinInfo", "Lcom/delta/playandroidpro/center/coin/bean/entity/Coin;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CoinService {
    
    @retrofit2.http.GET(value = "/lg/coin/userinfo/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyCoinInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.center.coin.bean.entity.Coin>>> $completion);
    
    @retrofit2.http.GET(value = "/lg/coin/list/{page}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyCoinDetailInfo(@retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroidpro.common.BaseResponse<com.delta.playandroidpro.common.Pack<com.delta.playandroidpro.center.coin.bean.entity.CoinDetail>>>> $completion);
}