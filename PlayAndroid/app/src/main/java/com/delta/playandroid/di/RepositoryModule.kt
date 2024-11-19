package com.delta.playandroid.di

import com.delta.playandroid.data.api.ApiClient
import com.delta.playandroid.data.local.Manager.DataStoreManager
import com.delta.playandroid.data.model.repository.HomeRepo
import com.delta.playandroid.data.model.repository.LoginRepo
import com.delta.playandroid.data.model.repository.ProjectRepo
import com.delta.playandroid.data.model.repository.SearchRepo
import com.delta.playandroid.data.model.repository.CollectRepo
import com.delta.playandroid.data.model.repository.SystemRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module //注明Dagger模块，可提供依赖
@InstallIn(SingletonComponent::class)//应用程序整个生命周期设置单例
object RepositoryModule {
    @Provides
    @Singleton//在应用生命周期中是唯一的
    fun provideTreeRepo(apiClient: ApiClient):SystemRepo = SystemRepo.getInstance(apiClient)

    @Provides
    @Singleton
    fun provideHomeRepo(apiClient: ApiClient): HomeRepo = HomeRepo.getInstance(apiClient)

    @Provides
    @Singleton
    fun provideLoginRepo(apiClient: ApiClient,dataStoreManager: DataStoreManager):LoginRepo = LoginRepo.getInstance(apiClient,dataStoreManager)

    @Provides
    @Singleton
    fun provideProjectRepo(apiClient: ApiClient):ProjectRepo = ProjectRepo.getInstance(apiClient)

    @Provides
    @Singleton
    fun provideSelfInfoRepo(apiClient: ApiClient): CollectRepo = CollectRepo.getInstance(apiClient)

    @Provides
    @Singleton
    fun provideSearchRepo(apiClient: ApiClient,dataStoreManager: DataStoreManager): SearchRepo = SearchRepo.getInstance(apiClient,dataStoreManager)
}