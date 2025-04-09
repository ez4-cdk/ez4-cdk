package com.delta.playandroid.data.interceptor;

import com.delta.playandroid.data.local.Manager.DataStoreManager;
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
public final class GetCookieInterceptor_Factory implements Factory<GetCookieInterceptor> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public GetCookieInterceptor_Factory(Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public GetCookieInterceptor get() {
    return newInstance(dataStoreManagerProvider.get());
  }

  public static GetCookieInterceptor_Factory create(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new GetCookieInterceptor_Factory(dataStoreManagerProvider);
  }

  public static GetCookieInterceptor newInstance(DataStoreManager dataStoreManager) {
    return new GetCookieInterceptor(dataStoreManager);
  }
}
