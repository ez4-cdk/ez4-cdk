package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.model.repository.ProjectRepo;
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
public final class RepositoryModule_ProvideProjectRepoFactory implements Factory<ProjectRepo> {
  private final Provider<ApiClient> apiClientProvider;

  public RepositoryModule_ProvideProjectRepoFactory(Provider<ApiClient> apiClientProvider) {
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public ProjectRepo get() {
    return provideProjectRepo(apiClientProvider.get());
  }

  public static RepositoryModule_ProvideProjectRepoFactory create(
      Provider<ApiClient> apiClientProvider) {
    return new RepositoryModule_ProvideProjectRepoFactory(apiClientProvider);
  }

  public static ProjectRepo provideProjectRepo(ApiClient apiClient) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideProjectRepo(apiClient));
  }
}
