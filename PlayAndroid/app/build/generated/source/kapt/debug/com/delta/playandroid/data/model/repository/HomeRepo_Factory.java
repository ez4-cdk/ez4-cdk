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
public final class HomeRepo_Factory implements Factory<HomeRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public HomeRepo_Factory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public HomeRepo get() {
    return newInstance(apiClientProvider.get());
  }

  public static HomeRepo_Factory create(Provider<ApiClient> apiClientProvider) {
    return new HomeRepo_Factory(apiClientProvider);
  }

  public static HomeRepo newInstance(ApiClient apiClient) {
    return new HomeRepo(apiClient);
  }
}
