package com.delta.playandroid.data.api;

import com.delta.playandroid.common.BaseResponse;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.Chapter;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.data.model.bean.entity.Harmony;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/delta/playandroid/data/api/HarmonyAPI;", "", "askAndAnswer", "Lcom/delta/playandroid/common/BaseResponse;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "column", "Lcom/delta/playandroid/data/model/bean/entity/Chapter;", "getHarmonyColumn", "Lcom/delta/playandroid/data/model/bean/entity/Harmony;", "route", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "app_debug"})
public abstract interface HarmonyAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "https://wanandroid.com/harmony/index/json")
    public abstract java.lang.Object getHarmonyColumn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.Harmony>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "https://wanandroid.com/popular/wenda/json")
    public abstract java.lang.Object askAndAnswer(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.Article>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "https://wanandroid.com/popular/column/json")
    public abstract java.lang.Object column(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.Chapter>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "https://wanandroid.com/popular/route/json")
    public abstract java.lang.Object route(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.delta.playandroid.common.BaseResponse<com.delta.playandroid.data.model.bean.entity.Column>> continuation);
}