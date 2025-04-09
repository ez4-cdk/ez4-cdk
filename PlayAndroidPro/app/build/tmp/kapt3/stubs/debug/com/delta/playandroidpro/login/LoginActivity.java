package com.delta.playandroidpro.login;

/**
 * @description 登录活动
 * @author delta
 * @date 2025/2/3 11:06
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/delta/playandroidpro/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "logIn", "Lcom/delta/playandroidpro/login/ui/fragment/LogIn;", "root", "Landroid/widget/FrameLayout;", "signUp", "Lcom/delta/playandroidpro/login/ui/fragment/SignUp;", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLoginSuccess", "user", "Lcom/delta/playandroidpro/login/bean/User;", "switchToLogIn", "switchToSignUp", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private com.delta.playandroidpro.login.ui.fragment.LogIn logIn;
    @org.jetbrains.annotations.NotNull
    private com.delta.playandroidpro.login.ui.fragment.SignUp signUp;
    private android.widget.FrameLayout root;
    
    public LoginActivity() {
        super();
    }
    
    public final void initView() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void switchToSignUp() {
    }
    
    public final void switchToLogIn() {
    }
    
    public final void onLoginSuccess(@org.jetbrains.annotations.Nullable
    com.delta.playandroidpro.login.bean.User user) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}