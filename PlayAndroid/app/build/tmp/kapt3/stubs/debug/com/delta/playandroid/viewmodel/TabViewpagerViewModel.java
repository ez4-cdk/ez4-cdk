package com.delta.playandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.delta.playandroid.common.BaseViewModel;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.data.model.repository.SystemRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/delta/playandroid/viewmodel/TabViewpagerViewModel;", "Lcom/delta/playandroid/common/BaseViewModel;", "systemRepo", "Lcom/delta/playandroid/data/model/repository/SystemRepo;", "(Lcom/delta/playandroid/data/model/repository/SystemRepo;)V", "_column", "Landroidx/lifecycle/MutableLiveData;", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "column", "Landroidx/lifecycle/LiveData;", "getColumn", "()Landroidx/lifecycle/LiveData;", "value", "", "columnId", "getColumnId", "()I", "setColumnId", "(I)V", "fetchData", "", "app_debug"})
public final class TabViewpagerViewModel extends com.delta.playandroid.common.BaseViewModel {
    private final com.delta.playandroid.data.model.repository.SystemRepo systemRepo = null;
    private int columnId = 0;
    private androidx.lifecycle.MutableLiveData<com.delta.playandroid.data.model.bean.entity.Column> _column;
    
    @javax.inject.Inject
    public TabViewpagerViewModel(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.repository.SystemRepo systemRepo) {
        super();
    }
    
    public final int getColumnId() {
        return 0;
    }
    
    public final void setColumnId(int value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.playandroid.data.model.bean.entity.Column> getColumn() {
        return null;
    }
    
    public final void fetchData() {
    }
}