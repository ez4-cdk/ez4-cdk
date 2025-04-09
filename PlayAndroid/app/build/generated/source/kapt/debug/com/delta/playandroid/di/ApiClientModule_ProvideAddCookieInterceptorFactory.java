package com.delta.playandroid.di;

import com.delta.playandroid.data.interceptor.AddCookieInterceptor;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApiClientModule_ProvideAddCookieInterceptorFactory implements Factory<AddCookieInterceptor> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public ApiClientModule_ProvideAddCookieInterceptorFactory(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public AddCookieInterceptor get() {
    return provideAddCookieInterceptor(dataStoreManagerProvider.get());
  }

  public static ApiClientModule_ProvideAddCookieInterceptorFactory create(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new ApiClientModule_ProvideAddCookieInterceptorFactory(dataStoreManagerProvider);
  }

  public static AddCookieInterceptor provideAddCookieInterceptor(
      DataStoreManager dataStoreManager) {
    return Preconditions.checkNotNullFromProvides(ApiClientModule.INSTANCE.provideAddCookieInterceptor(dataStoreManager));
  }
}
