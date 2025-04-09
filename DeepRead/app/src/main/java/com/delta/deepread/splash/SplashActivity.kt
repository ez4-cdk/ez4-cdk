package com.delta.deepread.splash

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.delta.deepread.R
import com.delta.deepread.center.CenterActivity
import com.delta.deepread.center.room.DefaultDatabase

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        
        ObjectAnimator.ofFloat(this.findViewById(R.id.splash_text),"alpha",0f,1f).apply {
            duration = 2000
            start()
        }
        Handler(Looper.getMainLooper()).postDelayed({
            // 延迟一段时间后跳转到主界面
            val intent = Intent(this, CenterActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}
   