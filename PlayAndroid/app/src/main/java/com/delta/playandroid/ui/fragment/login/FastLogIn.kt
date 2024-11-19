package com.delta.playandroid.ui.fragment.login

import android.app.Application
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.FastLoginBinding
import com.delta.playandroid.ui.activity.LoginActivity
import com.delta.playandroid.ui.adapter.FastLogInUserAdapter
import com.delta.playandroid.viewmodel.FastLoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FastLogIn:BaseFragment<FastLoginBinding>(R.layout.fast_login,FastLoginBinding::bind)
,FastLogInUserAdapter.onUserClickListener{
    private val fastLoginViewModel:FastLoginViewModel by viewModels()
    private lateinit var usersAdapter:FastLogInUserAdapter
    override fun initView() {

        databinding.usernameRv.layoutManager = LinearLayoutManager(this.context)
        usersAdapter = FastLogInUserAdapter(this)
        databinding.usernameRv.adapter = usersAdapter

        databinding.fastLoginViewModel = fastLoginViewModel
        databinding.lifecycleOwner = this

        fastLoginViewModel.autoLoginUser.observe(this){
            usersAdapter.initUserList(it)
            if (it.isEmpty()){
                databinding.noAutoLoginAccess.visibility = View.VISIBLE
            }
        }

        databinding.cancelButton.setOnClickListener {
            (activity as LoginActivity).switchToLogIn()
        }

        fastLoginViewModel.loginStatus.observe(this){
            if (it!=null){
                (activity as LoginActivity).onLoginSuccess(it)
            }
        }

        fastLoginViewModel.loginException.observe(this){
            Toast.makeText(this.context,it,Toast.LENGTH_SHORT).show()
        }

    }

    override fun login(position: Int) {
        fastLoginViewModel.login(position)
    }
}