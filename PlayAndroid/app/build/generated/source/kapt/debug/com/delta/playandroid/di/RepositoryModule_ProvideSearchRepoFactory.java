package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import com.delta.playandroid.data.model.repository.SearchRepo;
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
public final class RepositoryModule_ProvideSearchRepoFactory implements Factory<SearchRepo> {
  private final Provider<ApiClient> apiClientProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public RepositoryModule_ProvideSearchRepoFactory(Provider<ApiClient> apiClientProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.apiClientProvider = apiClientProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public SearchRepo get() {
    return provideSearchRepo(apiClientProvider.get(), dataStoreManagerProvider.get());
  }

  public static RepositoryModule_ProvideSearchRepoFactory create(
      Provider<ApiClient> apiClientProvider, Provider<DataStoreManager> dataStoreManagerProvider) {
    return new RepositoryModule_ProvideSearchRepoFactory(apiClientProvider, dataStoreManagerProvider);
  }

  public static SearchRepo provideSearchRepo(ApiClient apiClient,
      DataStoreManager dataStoreManager) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideSearchRepo(apiClient, dataStoreManager));
  }
}
