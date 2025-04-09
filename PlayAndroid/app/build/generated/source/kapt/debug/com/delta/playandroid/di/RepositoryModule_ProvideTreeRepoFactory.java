package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.model.repository.SystemRepo;
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
public final class RepositoryModule_ProvideTreeRepoFactory implements Factory<SystemRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public RepositoryModule_ProvideTreeRepoFactory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public SystemRepo get() {
    return provideTreeRepo(apiClientProvider.get());
  }

  public static RepositoryModule_ProvideTreeRepoFactory create(
      Provider<ApiClient> apiClientProvider) {
    return new RepositoryModule_ProvideTreeRepoFactory(apiClientProvider);
  }

  public static SystemRepo provideTreeRepo(ApiClient apiClient) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideTreeRepo(apiClient));
  }
}
