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
public final class SystemRepo_Factory implements Factory<SystemRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public SystemRepo_Factory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public SystemRepo get() {
    return newInstance(apiClientProvider.get());
  }

  public static SystemRepo_Factory create(Provider<ApiClient> apiClientProvider) {
    return new SystemRepo_Factory(apiClientProvider);
  }

  public static SystemRepo newInstance(ApiClient apiClient) {
    return new SystemRepo(apiClient);
  }
}
