package com.delta.playandroid.di;

import com.delta.playandroid.data.interceptor.GetCookieInterceptor;
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
public final class ApiClientModule_ProvideGetCookieInterceptorFactory implements Factory<GetCookieInterceptor> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public ApiClientModule_ProvideGetCookieInterceptorFactory(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public GetCookieInterceptor get() {
    return provideGetCookieInterceptor(dataStoreManagerProvider.get());
  }

  public static ApiClientModule_ProvideGetCookieInterceptorFactory create(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new ApiClientModule_ProvideGetCookieInterceptorFactory(dataStoreManagerProvider);
  }

  public static GetCookieInterceptor provideGetCookieInterceptor(
      DataStoreManager dataStoreManager) {
    return Preconditions.checkNotNullFromProvides(ApiClientModule.INSTANCE.provideGetCookieInterceptor(dataStoreManager));
  }
}
