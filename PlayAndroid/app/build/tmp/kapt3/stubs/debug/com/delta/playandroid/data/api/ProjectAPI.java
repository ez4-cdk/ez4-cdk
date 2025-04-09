package com.delta.playandroid.data.api;

import com.delta.playandroid.common.BaseResponse;
import com.delta.playandroid.data.model.bean.entity.Column;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * 项目
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/delta/playandroid/data/api/ProjectAPI;", "", "projects", "Lretrofit2/Response;", "Lcom/delta/playandroid/common/BaseResponse;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProjectAPI {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "https://www.wanandroid.com/project/tree/json")
    public abstract java.lang.Object projects(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.delta.playandroid.common.BaseResponse<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column>>>> continuation);
}