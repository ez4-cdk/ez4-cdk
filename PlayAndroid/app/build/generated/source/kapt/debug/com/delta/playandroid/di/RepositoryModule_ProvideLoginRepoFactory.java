package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.repository.LoginRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideLoginRepoFactory implements Factory<LoginRepo> {
  private final Provider<ApiClient> apiClientProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public RepositoryModule_ProvideLoginRepoFactory(Provider<ApiClient> apiClientProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.apiClientProvider = apiClientProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public LoginRepo get() {
    return provideLoginRepo(apiClientProvider.get(), dataStoreManagerProvider.get());
  }

  public static RepositoryModule_ProvideLoginRepoFactory create(
      Provider<ApiClient> apiClientProvider, Provider<DataStoreManager> dataStoreManagerProvider) {
    return new RepositoryModule_ProvideLoginRepoFactory(apiClientProvider, dataStoreManagerProvider);
  }

  public static LoginRepo provideLoginRepo(ApiClient apiClient, DataStoreManager dataStoreManager) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLoginRepo(apiClient, dataStoreManager));
  }
}
