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
public final class ProjectRepo_Factory implements Factory<ProjectRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public ProjectRepo_Factory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public ProjectRepo get() {
    return newInstance(apiClientProvider.get());
  }

  public static ProjectRepo_Factory create(Provider<ApiClient> apiClientProvider) {
    return new ProjectRepo_Factory(apiClientProvider);
  }

  public static ProjectRepo newInstance(ApiClient apiClient) {
    return new ProjectRepo(apiClient);
  }
}
