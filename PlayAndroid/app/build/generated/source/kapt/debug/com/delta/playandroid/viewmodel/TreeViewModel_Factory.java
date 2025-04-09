package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.SystemRepo;
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
public final class TreeViewModel_Factory implements Factory<TreeViewModel> {
  private final Provider<SystemRepo> systemRepoProvider;

  public TreeViewModel_Factory(Provider<SystemRepo> systemRepoProvider) {
    this.systemRepoProvider = systemRepoProvider;
  }

  @Override
  public TreeViewModel get() {
    return newInstance(systemRepoProvider.get());
  }

  public static TreeViewModel_Factory create(Provider<SystemRepo> systemRepoProvider) {
    return new TreeViewModel_Factory(systemRepoProvider);
  }

  public static TreeViewModel newInstance(SystemRepo systemRepo) {
    return new TreeViewModel(systemRepo);
  }
}
