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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<LoginRepo> loginRepoProvider;

  public SignUpViewModel_Factory(Provider<LoginRepo> loginRepoProvider) {
    this.loginRepoProvider = loginRepoProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(loginRepoProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<LoginRepo> loginRepoProvider) {
    return new SignUpViewModel_Factory(loginRepoProvider);
  }

  public static SignUpViewModel newInstance(LoginRepo loginRepo) {
    return new SignUpViewModel(loginRepo);
  }
}
