package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.CollectRepo;
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
public final class CollectViewModel_Factory implements Factory<CollectViewModel> {
  private final Provider<CollectRepo> collectRepoProvider;

  public CollectViewModel_Factory(Provider<CollectRepo> collectRepoProvider) {
    this.collectRepoProvider = collectRepoProvider;
  }

  @Override
  public CollectViewModel get() {
    return newInstance(collectRepoProvider.get());
  }

  public static CollectViewModel_Factory create(Provider<CollectRepo> collectRepoProvider) {
    return new CollectViewModel_Factory(collectRepoProvider);
  }

  public static CollectViewModel newInstance(CollectRepo collectRepo) {
    return new CollectViewModel(collectRepo);
  }
}
