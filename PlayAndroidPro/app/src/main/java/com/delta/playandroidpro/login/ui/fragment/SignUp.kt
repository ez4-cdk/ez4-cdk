package com.delta.playandroidpro.login.ui.fragment

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.databinding.SignupBinding
import com.delta.playandroidpro.login.LoginActivity
import com.delta.playandroidpro.login.viewmodel.SignUpViewModel


class SignUp : BaseFragment<SignupBinding>(R.layout.signup,SignupBinding::inflate) {

    private val signUpViewModel : SignUpViewModel by lazy {
        ViewModelProvider(this).get(SignUpViewModel::class.java).also {
            it.init("")
        }
    }

    override fun loading() {
        binding.signUpProgressBar.visibility = View.VISIBLE
    }

    override fun loaded() {
        binding.signUpProgressBar.visibility = View.GONE
    }

    override fun initView() {

        binding.jump.setOnClickListener {
            (activity as LoginActivity).switchToLogIn()
        }

        signUpViewModel.signUpStatus.observe(this){
            if (it!=null){
                (activity as LoginActivity).onLoginSuccess(it)
            }
        }

        binding.login.setOnClickListener {
            signUpViewModel.signUp(binding.username.text.toString(),binding.password.text.toString(),binding.rePassword.text.toString())
        }

        signUpViewModel.cookie.observe(this){
            if (it!=null){
                (requireActivity().application as PlayAndroidPro).setCookie(it)
            }
        }

        signUpViewModel.signUpInfo.observe(this){
            Toast.makeText(this.context,it,Toast.LENGTH_SHORT).show()
        }
    }
}