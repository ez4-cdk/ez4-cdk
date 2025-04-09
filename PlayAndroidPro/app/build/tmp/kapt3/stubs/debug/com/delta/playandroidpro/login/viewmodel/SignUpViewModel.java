package com.delta.playandroidpro.login.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lcom/delta/playandroidpro/login/viewmodel/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cookie", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashSet;", "", "_signUpInfo", "_signUpStatus", "Lcom/delta/playandroidpro/login/bean/User;", "cookie", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/HashSet;", "getCookie", "()Landroidx/lifecycle/LiveData;", "mutex", "", "signUpInfo", "getSignUpInfo", "signUpStatus", "getSignUpStatus", "signupModel", "Lcom/delta/playandroidpro/login/SignupModel;", "getSignupModel", "()Lcom/delta/playandroidpro/login/SignupModel;", "signupModel$delegate", "Lkotlin/Lazy;", "signUp", "", "username", "password", "repassword", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy signupModel$delegate = null;
    private boolean mutex = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.delta.playandroidpro.login.bean.User> _signUpStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _signUpInfo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.HashSet<java.lang.String>> _cookie = null;
    
    public SignUpViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroidpro.login.bean.User> getSignUpStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getSignUpInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.HashSet<java.lang.String>> getCookie() {
        return null;
    }
    
    private final com.delta.playandroidpro.login.SignupModel getSignupModel() {
        return null;
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String repassword) {
    }
}