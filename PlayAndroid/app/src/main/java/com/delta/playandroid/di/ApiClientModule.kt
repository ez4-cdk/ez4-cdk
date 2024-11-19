package com.delta.playandroid.di

import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.interceptor.AddCookieInterceptor
import com.delta.playandroid.data.interceptor.GetCookieInterceptor
import com.delta.playandroid.data.local.Manager.DataStoreManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ApiClientModule {

    @Provides
    @Singleton
    fun provideAddCookieInterceptor(dataStoreManager: DataStoreManager): AddCookieInterceptor {
        return AddCookieInterceptor(dataStoreManager)
    }

    @Provides
    @Singleton
    fun provideGetCookieInterceptor(dataStoreManager: DataStoreManager): GetCookieInterceptor {
        return GetCookieInterceptor(dataStoreManager)
    }

    @Singleton
    @Provides
    fun provideApiClient(addCookieInterceptor: AddCookieInterceptor, getCookieInterceptor: GetCookieInterceptor): ApiClient {
        return ApiClient(addCookieInterceptor,getCookieInterceptor)
    }
}