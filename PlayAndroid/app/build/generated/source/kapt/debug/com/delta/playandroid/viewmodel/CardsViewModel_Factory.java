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
public final class CardsViewModel_Factory implements Factory<CardsViewModel> {
  private final Provider<SystemRepo> systemRepoProvider;

  public CardsViewModel_Factory(Provider<SystemRepo> systemRepoProvider) {
    this.systemRepoProvider = systemRepoProvider;
  }

  @Override
  public CardsViewModel get() {
    return newInstance(systemRepoProvider.get());
  }

  public static CardsViewModel_Factory create(Provider<SystemRepo> systemRepoProvider) {
    return new CardsViewModel_Factory(systemRepoProvider);
  }

  public static CardsViewModel newInstance(SystemRepo systemRepo) {
    return new CardsViewModel(systemRepo);
  }
}
