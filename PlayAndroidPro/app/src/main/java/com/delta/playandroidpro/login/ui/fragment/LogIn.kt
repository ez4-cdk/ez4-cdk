package com.delta.playandroidpro.login.ui.fragment

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.databinding.LoginBinding
import com.delta.playandroidpro.login.LoginActivity
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.login.viewmodel.LoginViewModel
import com.delta.playandroidpro.login.widget.ExpandableCardView.ExpandableCardView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class LogIn:BaseFragment<LoginBinding>(R.layout.login,LoginBinding::inflate),
    ExpandableCardView.onClickListener {
    private val loginViewModel: LoginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java).also {
            it.init("")
        }
    }

    override fun loading() {
        binding.loginProgressBar.visibility = View.VISIBLE
    }

    override fun loaded() {
        binding.loginProgressBar.visibility = View.GONE
    }

    override fun initView() {

        loginViewModel.loginStatus.observe(this){
            loaded()
            if (it!=null){
                //登录成功
                loginViewModel.readAvatar(requireContext(),it)
                loginViewModel.saveLastLoginUser(requireContext(),it)
                lifecycleScope.launch(Dispatchers.Main) {
                    (activity as LoginActivity).onLoginSuccess(it)
                }

            }
        }

        loginViewModel.autoLoginUser.observe(this){
            if (it!=null){
                binding.loginTag.setData(it)
            }
        }

        loginViewModel.cookie.observe(this){
            if (it!=null){
                (requireActivity().application as PlayAndroidPro).setCookie(it)
            }
        }

        binding.login.setOnClickListener {
            loginViewModel.login(
                binding.username.text.toString(),
                binding.password.text.toString(),
                requireContext(),
                binding.AutoLogin.isChecked,
                binding.rememberPassword.isChecked
            )
        }

        binding.loginTag.setOnItemClickListener(this)

        binding.freeMode.setOnClickListener {
            (activity as LoginActivity).onLoginSuccess(null)
        }

        binding.jump.setOnClickListener {
            (activity as LoginActivity).switchToSignUp()
        }

        loginViewModel.loginInfo.observe(this){
            Toast.makeText(this.context,it,Toast.LENGTH_SHORT).show()
        }


        loginViewModel.lastLoginUser.observe(this){
            if (it!=null){
                binding.username.setText(it.username)
            }
        }
        loginViewModel.loadLastLoginUser(requireContext())
        lifecycleScope.launch(Dispatchers.IO) {
            loginViewModel.getAutoLoginUser(requireContext())
        }

    }

    override fun onClick(user: User) {
        binding.username.setText(user.username)
        binding.password.setText(user.password)
        binding.loginTag.findViewById<RecyclerView>(R.id.ecv_rv).visibility = View.GONE
        loading()
        binding.login.performClick()
    }
}