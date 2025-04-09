package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.CollectRepo;
import com.delta.playandroid.data.model.repository.HomeRepo;
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
public final class ArticleViewModel_Factory implements Factory<ArticleViewModel> {
  private final Provider<HomeRepo> homeRepoProvider;

  private final Provider<CollectRepo> collectRepoProvider;

  public ArticleViewModel_Factory(Provider<HomeRepo> homeRepoProvider,
      Provider<CollectRepo> collectRepoProvider) {
    this.homeRepoProvider = homeRepoProvider;
    this.collectRepoProvider = collectRepoProvider;
  }

  @Override
  public ArticleViewModel get() {
    return newInstance(homeRepoProvider.get(), collectRepoProvider.get());
  }

  public static ArticleViewModel_Factory create(Provider<HomeRepo> homeRepoProvider,
      Provider<CollectRepo> collectRepoProvider) {
    return new ArticleViewModel_Factory(homeRepoProvider, collectRepoProvider);
  }

  public static ArticleViewModel newInstance(HomeRepo homeRepo, CollectRepo collectRepo) {
    return new ArticleViewModel(homeRepo, collectRepo);
  }
}
