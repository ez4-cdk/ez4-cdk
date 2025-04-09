package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.repository.HomeRepo;
import com.delta.playandroid.data.model.repository.LoginRepo;
import com.delta.playandroid.data.model.repository.ProjectRepo;
import com.delta.playandroid.data.model.repository.SearchRepo;
import com.delta.playandroid.data.model.repository.CollectRepo;
import com.delta.playandroid.data.model.repository.SystemRepo;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/playandroid/di/RepositoryModule;", "", "()V", "provideHomeRepo", "Lcom/delta/playandroid/data/model/repository/HomeRepo;", "apiClient", "Lcom/delta/playandroid/data/api/ApiClient;", "provideLoginRepo", "Lcom/delta/playandroid/data/model/repository/LoginRepo;", "dataStoreManager", "Lcom/delta/playandroid/data/local/Manager/DataStoreManager;", "provideProjectRepo", "Lcom/delta/playandroid/data/model/repository/ProjectRepo;", "provideSearchRepo", "Lcom/delta/playandroid/data/model/repository/SearchRepo;", "provideSelfInfoRepo", "Lcom/delta/playandroid/data/model/repository/CollectRepo;", "provideTreeRepo", "Lcom/delta/playandroid/data/model/repository/SystemRepo;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroid.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.SystemRepo provideTreeRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.HomeRepo provideHomeRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.LoginRepo provideLoginRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.ProjectRepo provideProjectRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.CollectRepo provideSelfInfoRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.delta.playandroid.data.model.repository.SearchRepo provideSearchRepo(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.api.ApiClient apiClient, @org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.local.Manager.DataStoreManager dataStoreManager) {
        return null;
    }
}