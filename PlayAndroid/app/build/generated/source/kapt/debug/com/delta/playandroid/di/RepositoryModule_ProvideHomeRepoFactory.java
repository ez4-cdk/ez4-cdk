package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.model.repository.HomeRepo;
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
public final class RepositoryModule_ProvideHomeRepoFactory implements Factory<HomeRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public RepositoryModule_ProvideHomeRepoFactory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public HomeRepo get() {
    return provideHomeRepo(apiClientProvider.get());
  }

  public static RepositoryModule_ProvideHomeRepoFactory create(
      Provider<ApiClient> apiClientProvider) {
    return new RepositoryModule_ProvideHomeRepoFactory(apiClientProvider);
  }

  public static HomeRepo provideHomeRepo(ApiClient apiClient) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideHomeRepo(apiClient));
  }
}
