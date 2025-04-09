package com.delta.playandroid.data.model.repository;

import com.delta.playandroid.data.api.ApiClient;
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
public final class CollectRepo_Factory implements Factory<CollectRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public CollectRepo_Factory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public CollectRepo get() {
    return newInstance(apiClientProvider.get());
  }

  public static CollectRepo_Factory create(Provider<ApiClient> apiClientProvider) {
    return new CollectRepo_Factory(apiClientProvider);
  }

  public static CollectRepo newInstance(ApiClient apiClient) {
    return new CollectRepo(apiClient);
  }
}
