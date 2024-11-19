package com.delta.playandroid.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.delta.playandroid.R

class WebViewActivity:AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        webView = findViewById(R.id.webView_container)

        val url = intent.getStringExtra("url")

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        // 加载 URL
        if (url != null) {
            webView.loadUrl(url)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        webView.destroy()
    }
}