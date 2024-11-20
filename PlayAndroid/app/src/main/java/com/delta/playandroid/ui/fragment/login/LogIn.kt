package com.delta.playandroid.ui.fragment.login

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.LoginBinding
import com.delta.playandroid.ui.activity.LoginActivity
import com.delta.playandroid.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LogIn:BaseFragment<LoginBinding>(R.layout.login,LoginBinding::bind) {
    private val loginViewModel:LoginViewModel by viewModels()
    override fun initView() {
        //初始化binding
        databinding.loginViewModel = loginViewModel
        databinding.lifecycleOwner = this

        loginViewModel.loginStatus.observe(this){
            if (it!=null){
                //登录成功
                lifecycleScope.launch(Dispatchers.Main) {
                    (activity as LoginActivity).onLoginSuccess(it)
                }
            }
        }

        databinding.freeMode.setOnClickListener {
            (activity as LoginActivity).onLoginSuccess(null)
        }

        databinding.jump.setOnClickListener {
            (activity as LoginActivity).switchToSignUp()
        }

        loginViewModel.loginInfo.observe(this){
            Toast.makeText(this.context,it,Toast.LENGTH_SHORT).show()
        }

        loginViewModel.loadLastLoginUser(this)

        databinding.autoLoginUser.setOnClickListener{
            (activity as LoginActivity).switchToFastLogin()
        }

    }
}