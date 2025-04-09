package com.delta.playandroid.data.model.repository;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class SearchRepo_Factory implements Factory<SearchRepo> {
  private final Provider<ApiClient> apiClientProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public SearchRepo_Factory(Provider<ApiClient> apiClientProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.apiClientProvider = apiClientProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public SearchRepo get() {
    return newInstance(apiClientProvider.get(), dataStoreManagerProvider.get());
  }

  public static SearchRepo_Factory create(Provider<ApiClient> apiClientProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new SearchRepo_Factory(apiClientProvider, dataStoreManagerProvider);
  }

  public static SearchRepo newInstance(ApiClient apiClient, DataStoreManager dataStoreManager) {
    return new SearchRepo(apiClient, dataStoreManager);
  }
}
