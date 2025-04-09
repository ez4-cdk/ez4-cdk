package com.delta.playandroid.viewmodel;

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
public final class BannerViewModel_Factory implements Factory<BannerViewModel> {
  private final Provider<HomeRepo> homeRepoProvider;

  public BannerViewModel_Factory(Provider<HomeRepo> homeRepoProvider) {
    this.homeRepoProvider = homeRepoProvider;
  }

  @Override
  public BannerViewModel get() {
    return newInstance(homeRepoProvider.get());
  }

  public static BannerViewModel_Factory create(Provider<HomeRepo> homeRepoProvider) {
    return new BannerViewModel_Factory(homeRepoProvider);
  }

  public static BannerViewModel newInstance(HomeRepo homeRepo) {
    return new BannerViewModel(homeRepo);
  }
}
