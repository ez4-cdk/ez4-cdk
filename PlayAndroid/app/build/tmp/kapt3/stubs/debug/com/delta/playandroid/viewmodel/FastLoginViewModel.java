package com.delta.playandroid.viewmodel;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.bean.entity.User;
import com.delta.playandroid.data.model.repository.LoginRepo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000f0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/delta/playandroid/viewmodel/FastLoginViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "loginRepo", "Lcom/delta/playandroid/data/model/repository/LoginRepo;", "(Lcom/delta/playandroid/data/model/repository/LoginRepo;)V", "_loginException", "Landroidx/lifecycle/MutableLiveData;", "", "_loginMutex", "Lkotlinx/coroutines/sync/Mutex;", "_loginStatus", "Lcom/delta/playandroid/data/model/bean/entity/User;", "autoLoginUser", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAutoLoginUser", "()Landroidx/lifecycle/LiveData;", "loginException", "getLoginException", "loginStatus", "getLoginStatus", "login", "", "position", "", "app_debug"})
public final class FastLoginViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.LoginRepo loginRepo = null;
    private kotlinx.coroutines.sync.Mutex _loginMutex;
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.User> _loginStatus;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _loginException;
    
    @javax.inject.Inject
    public FastLoginViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.LoginRepo loginRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.User>> getAutoLoginUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.User> getLoginStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getLoginException() {
        return null;
    }
    
    public final void login(int position) {
    }
}