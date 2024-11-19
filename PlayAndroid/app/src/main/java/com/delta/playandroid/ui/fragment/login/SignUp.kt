package com.delta.playandroid.ui.fragment.login

import android.widget.Toast
import androidx.fragment.app.viewModels
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.SignupBinding
import com.delta.playandroid.ui.activity.LoginActivity
import com.delta.playandroid.viewmodel.SignUpViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUp : BaseFragment<SignupBinding>(R.layout.signup,SignupBinding::bind) {

    private val signUpViewModel : SignUpViewModel by viewModels()
    override fun initView() {
        databinding.lifecycleOwner = this
        databinding.signUpViewModel = signUpViewModel

        databinding.jump.setOnClickListener {
            (activity as LoginActivity).switchToLogIn()
        }

        signUpViewModel.loginStatus.observe(this){
            if (it!=null){
                (activity as LoginActivity).onLoginSuccess(it)
            }
        }

        signUpViewModel.exceptionMSG.observe(this){
            Toast.makeText(this.context,it,Toast.LENGTH_SHORT).show()
        }
    }
}