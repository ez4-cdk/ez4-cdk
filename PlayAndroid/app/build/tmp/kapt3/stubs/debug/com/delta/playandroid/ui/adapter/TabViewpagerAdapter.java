package com.delta.playandroid.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.delta.playandroid.data.model.bean.entity.Column;
import com.delta.playandroid.ui.fragment.project.RvInProjectPage;
import com.delta.playandroid.ui.fragment.system.RvInPage;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\bJ\b\u0010\u001c\u001a\u00020\bH\u0016J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010\u001d\u001a\u00020\u001e2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020 0\u000fj\b\u0012\u0004\u0012\u00020 `\"R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R3\u0010\t\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/delta/playandroid/ui/adapter/TabViewpagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "_cidMap", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "cidMap", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/HashMap;", "getCidMap", "()Landroidx/lifecycle/LiveData;", "fragmentList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "getFragmentList", "()Ljava/util/ArrayList;", "setFragmentList", "(Ljava/util/ArrayList;)V", "fragmentTitleList", "", "getFragmentTitleList", "setFragmentTitleList", "createFragment", "position", "getFragmentTitle", "getItemCount", "setUp", "", "column", "Lcom/delta/playandroid/data/model/bean/entity/Column;", "columns", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class TabViewpagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.Integer, java.lang.Integer>> _cidMap;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<androidx.fragment.app.Fragment> fragmentList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> fragmentTitleList;
    
    public TabViewpagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity activity) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.HashMap<java.lang.Integer, java.lang.Integer>> getCidMap() {
        return null;
    }
    
    public final void setUp(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.data.model.bean.entity.Column column) {
    }
    
    public final void setUp(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.Column> columns) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<androidx.fragment.app.Fragment> getFragmentList() {
        return null;
    }
    
    public final void setFragmentList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getFragmentTitleList() {
        return null;
    }
    
    public final void setFragmentTitleList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFragmentTitle(int position) {
        return null;
    }
}