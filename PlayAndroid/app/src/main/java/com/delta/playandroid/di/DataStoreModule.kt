package com.delta.playandroid.di

import android.content.Context
import com.delta.playandroid.data.local.Manager.DataStoreManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Provides
    @Singleton
    fun provideDataStoreManager(@ApplicationContext context:Context):DataStoreManager{
        return DataStoreManager.getInstance(context)
    }
}