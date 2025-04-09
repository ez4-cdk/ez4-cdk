package com.delta.playandroid.di;

import android.content.Context;
import com.delta.playandroid.data.local.Manager.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataStoreModule_ProvideDataStoreManagerFactory implements Factory<DataStoreManager> {
  private final Provider<Context> contextProvider;

  public DataStoreModule_ProvideDataStoreManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreManager get() {
    return provideDataStoreManager(contextProvider.get());
  }

  public static DataStoreModule_ProvideDataStoreManagerFactory create(
      Provider<Context> contextProvider) {
    return new DataStoreModule_ProvideDataStoreManagerFactory(contextProvider);
  }

  public static DataStoreManager provideDataStoreManager(Context context) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideDataStoreManager(context));
  }
}
