package com.delta.playandroidpro.login

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.Center
import com.delta.playandroidpro.login.bean.User
import com.delta.playandroidpro.login.ui.fragment.LogIn
import com.delta.playandroidpro.login.ui.fragment.SignUp

/**
 * @description 登录活动
 * @author delta
 * @date 2025/2/3 11:06
 */
class LoginActivity:AppCompatActivity() {
    private var logIn: LogIn
    private var signUp: SignUp
    private lateinit var root:FrameLayout

    init {
        logIn = LogIn()
        signUp = SignUp()
    }
    fun initView() {
        switchToLogIn()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_root)
        root = findViewById(R.id.root)
        initView()
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
        (application as PlayAndroidPro).setUser(user)
        Toast.makeText(this,"登录成功,跳转至首页...", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,Center::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        logIn.onDestroy()
        signUp.onDestroy()
        super.onDestroy()
    }
}