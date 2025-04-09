package com.delta.playandroid.di;

import com.delta.playandroid.data.api.ApiClient;
import com.delta.playandroid.data.interceptor.AddCookieInterceptor;
import com.delta.playandroid.data.interceptor.GetCookieInterceptor;
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
public final class ApiClientModule_ProvideApiClientFactory implements Factory<ApiClient> {
  private final Provider<AddCookieInterceptor> addCookieInterceptorProvider;

  private final Provider<GetCookieInterceptor> getCookieInterceptorProvider;

  public ApiClientModule_ProvideApiClientFactory(
      Provider<AddCookieInterceptor> addCookieInterceptorProvider,
      Provider<GetCookieInterceptor> getCookieInterceptorProvider) {
    this.addCookieInterceptorProvider = addCookieInterceptorProvider;
    this.getCookieInterceptorProvider = getCookieInterceptorProvider;
  }

  @Override
  public ApiClient get() {
    return provideApiClient(addCookieInterceptorProvider.get(), getCookieInterceptorProvider.get());
  }

  public static ApiClientModule_ProvideApiClientFactory create(
      Provider<AddCookieInterceptor> addCookieInterceptorProvider,
      Provider<GetCookieInterceptor> getCookieInterceptorProvider) {
    return new ApiClientModule_ProvideApiClientFactory(addCookieInterceptorProvider, getCookieInterceptorProvider);
  }

  public static ApiClient provideApiClient(AddCookieInterceptor addCookieInterceptor,
      GetCookieInterceptor getCookieInterceptor) {
    return Preconditions.checkNotNullFromProvides(ApiClientModule.INSTANCE.provideApiClient(addCookieInterceptor, getCookieInterceptor));
  }
}
