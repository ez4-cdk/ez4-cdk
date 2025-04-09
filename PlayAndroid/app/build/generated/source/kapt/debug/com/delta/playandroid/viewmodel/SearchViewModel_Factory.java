package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.SearchRepo;
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchRepo> searchRepoProvider;

  public SearchViewModel_Factory(Provider<SearchRepo> searchRepoProvider) {
    this.searchRepoProvider = searchRepoProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(searchRepoProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<SearchRepo> searchRepoProvider) {
    return new SearchViewModel_Factory(searchRepoProvider);
  }

  public static SearchViewModel newInstance(SearchRepo searchRepo) {
    return new SearchViewModel(searchRepo);
  }
}
