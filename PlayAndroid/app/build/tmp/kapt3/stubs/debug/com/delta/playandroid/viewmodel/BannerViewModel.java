package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Banner;
import com.delta.playandroid.data.model.repository.HomeRepo;
import kotlinx.coroutines.Dispatchers;
import com.delta.playandroid.common.Result;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R$\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroid/viewmodel/BannerViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "homeRepo", "Lcom/delta/playandroid/data/model/repository/HomeRepo;", "(Lcom/delta/playandroid/data/model/repository/HomeRepo;)V", "_exception", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "get_exception", "()Landroidx/lifecycle/MutableLiveData;", "set_exception", "(Landroidx/lifecycle/MutableLiveData;)V", "banners", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Banner;", "Lkotlin/collections/ArrayList;", "getBanners", "()Landroidx/lifecycle/LiveData;", "exception", "getException", "fetchData", "", "app_debug"})
public final class BannerViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.HomeRepo homeRepo = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Exception> _exception;
    
    @javax.inject.Inject
    public BannerViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.HomeRepo homeRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Banner>> getBanners() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> get_exception() {
        return null;
    }
    
    public final void set_exception(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Exception> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Exception> getException() {
        return null;
    }
    
    public final void fetchData() {
    }
}