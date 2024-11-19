package com.delta.playandroid.data.interceptor

import android.content.Context
import com.delta.playandroid.data.local.Manager.DataStoreManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class AddCookieInterceptor @Inject constructor(
    private val dataStoreManager: DataStoreManager
) :Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val origin:Request = chain.request()
        val cookie: String? = getCookie()
        if (cookie.isNullOrEmpty()){
            return chain.proceed(origin)
        }
        val processed:Request = origin.newBuilder().addHeader("Cookie",cookie).build()
        return chain.proceed(processed)
    }

    private fun getCookie(): String? {
       return runBlocking {
           dataStoreManager.readFromDataStore("COOKIE_KEY")
       }
    }
}