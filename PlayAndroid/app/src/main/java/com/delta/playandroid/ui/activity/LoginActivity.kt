package com.delta.playandroid.ui.activity

import android.content.Intent
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.common.BaseActivity
import com.delta.playandroid.data.model.bean.entity.User
import com.delta.playandroid.ui.fragment.login.FastLogIn
import com.delta.playandroid.ui.fragment.login.LogIn
import com.delta.playandroid.ui.fragment.login.SignUp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : BaseActivity() {

    private var fastLogin:FastLogIn
    private var logIn:LogIn
    private var signUp:SignUp

    init {
        fastLogin = FastLogIn()
        logIn = LogIn()
        signUp = SignUp()
    }
    override fun initView() {
        switchToFastLogin()
    }

    fun switchToFastLogin(){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left)
            .replace(root.id,fastLogin,"FastLogInTag")
            .commit()
    }

    fun switchToSignUp(){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left)
            .replace(root.id, signUp,"SignUpTag")
            .commit()
    }

    fun switchToLogIn(){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left)
            .replace(root.id,logIn,"LogInTag")
            .commit()
    }

    fun onLoginSuccess(user: User?){
        (application as WanAndroidApp).setUser(user)
        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

}