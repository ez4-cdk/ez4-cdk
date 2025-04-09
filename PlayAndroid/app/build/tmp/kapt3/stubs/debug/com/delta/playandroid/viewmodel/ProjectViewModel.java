package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.common.Result;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.data.model.repository.ProjectRepo;
import com.delta.playandroid.data.model.repository.SystemRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/delta/playandroid/viewmodel/ProjectViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "projectRepo", "Lcom/delta/playandroid/data/model/repository/ProjectRepo;", "(Lcom/delta/playandroid/data/model/repository/ProjectRepo;)V", "projects", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "Lkotlin/collections/ArrayList;", "getProjects", "()Landroidx/lifecycle/LiveData;", "fetchData", "", "app_debug"})
public final class ProjectViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.ProjectRepo projectRepo = null;
    
    @javax.inject.Inject
    public ProjectViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.ProjectRepo projectRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column>> getProjects() {
        return null;
    }
    
    public final void fetchData() {
    }
}