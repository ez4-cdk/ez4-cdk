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
public final class TabViewpagerViewModel_Factory implements Factory<TabViewpagerViewModel> {
  private final Provider<SystemRepo> systemRepoProvider;

  public TabViewpagerViewModel_Factory(Provider<SystemRepo> systemRepoProvider) {
    this.systemRepoProvider = systemRepoProvider;
  }

  @Override
  public TabViewpagerViewModel get() {
    return newInstance(systemRepoProvider.get());
  }

  public static TabViewpagerViewModel_Factory create(Provider<SystemRepo> systemRepoProvider) {
    return new TabViewpagerViewModel_Factory(systemRepoProvider);
  }

  public static TabViewpagerViewModel newInstance(SystemRepo systemRepo) {
    return new TabViewpagerViewModel(systemRepo);
  }
}
