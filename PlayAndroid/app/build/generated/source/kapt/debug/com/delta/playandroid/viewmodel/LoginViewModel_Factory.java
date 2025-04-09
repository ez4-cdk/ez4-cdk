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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginRepo> loginRepoProvider;

  public LoginViewModel_Factory(Provider<LoginRepo> loginRepoProvider) {
    this.loginRepoProvider = loginRepoProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginRepoProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginRepo> loginRepoProvider) {
    return new LoginViewModel_Factory(loginRepoProvider);
  }

  public static LoginViewModel newInstance(LoginRepo loginRepo) {
    return new LoginViewModel(loginRepo);
  }
}
