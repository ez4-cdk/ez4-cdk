package com.delta.playandroidpro.center.project;

/**
 * @description 项目ViewModel
 * @author delta
 * @date 2025/2/25 18:14
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u0012\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\'\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lcom/delta/playandroidpro/center/project/ProjectViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentArticleList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/delta/playandroidpro/center/home/bean/entity/Article;", "_projectList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/delta/playandroidpro/center/project/bean/entity/Column;", "currentArticleList", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentArticleList", "()Lkotlinx/coroutines/flow/StateFlow;", "projectList", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getProjectList", "()Landroidx/lifecycle/LiveData;", "projectModel", "Lcom/delta/playandroidpro/center/project/ProjectModel;", "getProjectModel", "()Lcom/delta/playandroidpro/center/project/ProjectModel;", "projectModel$delegate", "Lkotlin/Lazy;", "getArticleUnderColumn", "", "cid", "", "app_debug"})
public final class ProjectViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy projectModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>> _currentArticleList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.playandroidpro.center.project.bean.entity.Column>> _projectList = null;
    
    public ProjectViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.delta.playandroidpro.center.home.bean.entity.Article>> getCurrentArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.playandroidpro.center.project.bean.entity.Column>> getProjectList() {
        return null;
    }
    
    private final com.delta.playandroidpro.center.project.ProjectModel getProjectModel() {
        return null;
    }
    
    public final void getProjectList() {
    }
    
    public final void getArticleUnderColumn(int cid) {
    }
}