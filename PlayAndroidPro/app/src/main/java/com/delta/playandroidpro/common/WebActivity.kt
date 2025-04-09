package com.delta.playandroidpro.common

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.delta.playandroidpro.R

class WebActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        webView = findViewById(R.id.webView_container)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        val url = intent.getStringExtra("url")
        if (!url.isNullOrBlank()) {
            webView.loadUrl(url)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        webView.destroy()
    }
}
