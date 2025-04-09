package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.LoginRepo;
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
public final class FastLoginViewModel_Factory implements Factory<FastLoginViewModel> {
  private final Provider<LoginRepo> loginRepoProvider;

  public FastLoginViewModel_Factory(Provider<LoginRepo> loginRepoProvider) {
    this.loginRepoProvider = loginRepoProvider;
  }

  @Override
  public FastLoginViewModel get() {
    return newInstance(loginRepoProvider.get());
  }

  public static FastLoginViewModel_Factory create(Provider<LoginRepo> loginRepoProvider) {
    return new FastLoginViewModel_Factory(loginRepoProvider);
  }

  public static FastLoginViewModel newInstance(LoginRepo loginRepo) {
    return new FastLoginViewModel(loginRepo);
  }
}
