package com.delta.playandroid.data.api;

import com.delta.playandroid.data.interceptor.AddCookieInterceptor;
import com.delta.playandroid.data.interceptor.GetCookieInterceptor;
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
public final class ApiClient_Factory implements Factory<ApiClient> {
  private final Provider<AddCookieInterceptor> addCookieInterceptorProvider;

  private final Provider<GetCookieInterceptor> getCookieInterceptorProvider;

  public ApiClient_Factory(Provider<AddCookieInterceptor> addCookieInterceptorProvider,
      Provider<GetCookieInterceptor> getCookieInterceptorProvider) {
    this.addCookieInterceptorProvider = addCookieInterceptorProvider;
    this.getCookieInterceptorProvider = getCookieInterceptorProvider;
  }

  @Override
  public ApiClient get() {
    return newInstance(addCookieInterceptorProvider.get(), getCookieInterceptorProvider.get());
  }

  public static ApiClient_Factory create(
      Provider<AddCookieInterceptor> addCookieInterceptorProvider,
      Provider<GetCookieInterceptor> getCookieInterceptorProvider) {
    return new ApiClient_Factory(addCookieInterceptorProvider, getCookieInterceptorProvider);
  }

  public static ApiClient newInstance(AddCookieInterceptor addCookieInterceptor,
      GetCookieInterceptor getCookieInterceptor) {
    return new ApiClient(addCookieInterceptor, getCookieInterceptor);
  }
}
