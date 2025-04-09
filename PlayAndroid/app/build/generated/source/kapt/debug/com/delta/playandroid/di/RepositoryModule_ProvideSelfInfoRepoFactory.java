package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.model.repository.CollectRepo;
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
public final class RepositoryModule_ProvideSelfInfoRepoFactory implements Factory<CollectRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public RepositoryModule_ProvideSelfInfoRepoFactory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public CollectRepo get() {
    return provideSelfInfoRepo(apiClientProvider.get());
  }

  public static RepositoryModule_ProvideSelfInfoRepoFactory create(
      Provider<ApiClient> apiClientProvider) {
    return new RepositoryModule_ProvideSelfInfoRepoFactory(apiClientProvider);
  }

  public static CollectRepo provideSelfInfoRepo(ApiClient apiClient) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideSelfInfoRepo(apiClient));
  }
}
