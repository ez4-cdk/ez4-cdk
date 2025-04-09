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
public final class AddCookieInterceptor_Factory implements Factory<AddCookieInterceptor> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public AddCookieInterceptor_Factory(Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public AddCookieInterceptor get() {
    return newInstance(dataStoreManagerProvider.get());
  }

  public static AddCookieInterceptor_Factory create(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new AddCookieInterceptor_Factory(dataStoreManagerProvider);
  }

  public static AddCookieInterceptor newInstance(DataStoreManager dataStoreManager) {
    return new AddCookieInterceptor(dataStoreManager);
  }
}
