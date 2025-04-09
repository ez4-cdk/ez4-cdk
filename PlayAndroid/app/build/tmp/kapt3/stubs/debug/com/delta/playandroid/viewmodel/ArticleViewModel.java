package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagingData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Article;
import com.delta.playandroid.data.model.bean.entity.User;
import com.delta.playandroid.data.model.repository.HomeRepo;
import com.delta.playandroid.data.model.repository.CollectRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import com.delta.playandroid.common.Result;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0019\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/delta/playandroid/viewmodel/ArticleViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "homeRepo", "Lcom/delta/playandroid/data/model/repository/HomeRepo;", "collectRepo", "Lcom/delta/playandroid/data/model/repository/CollectRepo;", "(Lcom/delta/playandroid/data/model/repository/HomeRepo;Lcom/delta/playandroid/data/model/repository/CollectRepo;)V", "_exceptionMSG", "Landroidx/lifecycle/MutableLiveData;", "", "articles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroid/data/model/bean/entity/Article;", "getArticles", "()Lkotlinx/coroutines/flow/Flow;", "setArticles", "(Lkotlinx/coroutines/flow/Flow;)V", "exceptionMSG", "Landroidx/lifecycle/LiveData;", "getExceptionMSG", "()Landroidx/lifecycle/LiveData;", "collect", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetFlow", "", "setUser", "user", "Lcom/delta/playandroid/data/model/bean/entity/User;", "uncollect", "app_debug"})
public final class ArticleViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.HomeRepo homeRepo = null;
    private final com.delta.playandroid.data.model.repository.CollectRepo collectRepo = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> articles;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _exceptionMSG;
    
    @javax.inject.Inject
    public ArticleViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.HomeRepo homeRepo, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.CollectRepo collectRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.delta.playandroid.data.model.bean.entity.Article>> p0) {
    }
    
    public final void resetFlow() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getExceptionMSG() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable
    com.delta.playandroid.data.model.bean.entity.User user) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collect(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object uncollect(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}