package com.delta.playandroid.di;

import android.content.Context;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/playandroid/di/DataStoreModule;", "", "()V", "provideDataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class DataStoreModule {
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.di.DataStoreModule INSTANCE = null;
    
    private DataStoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.local.Manager.DataStoreManager provideDataStoreManager(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}