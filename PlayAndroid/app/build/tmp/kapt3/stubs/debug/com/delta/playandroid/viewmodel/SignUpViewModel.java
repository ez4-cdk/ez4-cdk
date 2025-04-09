package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.repository.LoginRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.model.bean.entity.User;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/delta/playandroid/viewmodel/SignUpViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "loginRepo", "Lcom/delta/playandroid/data/model/repository/LoginRepo;", "(Lcom/delta/playandroid/data/model/repository/LoginRepo;)V", "_mutex", "", "_signUpException", "Landroidx/lifecycle/MutableLiveData;", "", "_signUpStatus", "Lcom/delta/playandroid/data/model/bean/entity/User;", "exceptionMSG", "Landroidx/lifecycle/LiveData;", "getExceptionMSG", "()Landroidx/lifecycle/LiveData;", "loginStatus", "getLoginStatus", "pwdInput", "getPwdInput", "()Landroidx/lifecycle/MutableLiveData;", "rePwdInput", "getRePwdInput", "usnInput", "getUsnInput", "signUp", "", "app_debug"})
public final class SignUpViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.LoginRepo loginRepo = null;
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.User> _signUpStatus;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _signUpException;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> usnInput = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> pwdInput = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> rePwdInput = null;
    private boolean _mutex = false;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.LoginRepo loginRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.User> getLoginStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getExceptionMSG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsnInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPwdInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRePwdInput() {
        return null;
    }
    
    public final void signUp() {
    }
}