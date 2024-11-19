package com.delta.playandroid.data.interceptor

import android.content.Context
import com.delta.playandroid.data.local.Manager.DataStoreManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class GetCookieInterceptor @Inject constructor(
    private val dataStoreManager: DataStoreManager
):Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val response:Response = chain.proceed(chain.request())
        val cookies = response.headers("Set-cookie")
        val cookieSet = HashSet<String>()
        if (cookies.isNotEmpty()){
            cookies.forEach {
                cookieSet.add(it)
            }
        }
        saveCookie(cookieSet)
        return response
    }
    private fun saveCookie(cookieSet: HashSet<String>) {
        CoroutineScope(Dispatchers.IO).launch {
            dataStoreManager.saveToDataStore("COOKIE_KEY",cookieSet.toString())
        }
    }
}

