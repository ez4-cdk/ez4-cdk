package com.delta.playandroid.viewmodel;

import com.delta.playandroid.data.model.repository.ProjectRepo;
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
public final class ProjectViewModel_Factory implements Factory<ProjectViewModel> {
  private final Provider<ProjectRepo> projectRepoProvider;

  public ProjectViewModel_Factory(Provider<ProjectRepo> projectRepoProvider) {
    this.projectRepoProvider = projectRepoProvider;
  }

  @Override
  public ProjectViewModel get() {
    return newInstance(projectRepoProvider.get());
  }

  public static ProjectViewModel_Factory create(Provider<ProjectRepo> projectRepoProvider) {
    return new ProjectViewModel_Factory(projectRepoProvider);
  }

  public static ProjectViewModel newInstance(ProjectRepo projectRepo) {
    return new ProjectViewModel(projectRepo);
  }
}
