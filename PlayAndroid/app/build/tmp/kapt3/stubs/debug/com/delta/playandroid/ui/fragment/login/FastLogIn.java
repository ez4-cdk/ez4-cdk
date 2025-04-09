package com.delta.playandroid.ui.fragment.login;

import android.app.Application;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.delta.playandroid.R;
import com.delta.playandroid.WanAndroidApp;
import com.delta.playandroid.common.BaseFragment;
import com.delta.playandroid.databinding.FastLoginBinding;
import com.delta.playandroid.ui.activity.LoginActivity;
import com.delta.playandroid.ui.adapter.FastLogInUserAdapter;
import com.delta.playandroid.viewmodel.FastLoginViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/playandroid/ui/fragment/login/FastLogIn;", "Lcom/delta/playandroid/common/BaseFragment;", "Lcom/delta/playandroid/databinding/FastLoginBinding;", "Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$onUserClickListener;", "()V", "fastLoginViewModel", "Lcom/delta/playandroid/viewmodel/FastLoginViewModel;", "getFastLoginViewModel", "()Lcom/delta/playandroid/viewmodel/FastLoginViewModel;", "fastLoginViewModel$delegate", "Lkotlin/Lazy;", "usersAdapter", "Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter;", "initView", "", "login", "position", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FastLogIn extends com.delta.playandroid.common.BaseFragment<com.delta.playandroid.databinding.FastLoginBinding> implements com.delta.playandroid.ui.adapter.FastLogInUserAdapter.onUserClickListener {
    private final kotlin.Lazy fastLoginViewModel$delegate = null;
    private com.delta.playandroid.ui.adapter.FastLogInUserAdapter usersAdapter;
    
    public FastLogIn() {
        super(0, null);
    }
    
    private final com.delta.playandroid.viewmodel.FastLoginViewModel getFastLoginViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void login(int position) {
    }
}