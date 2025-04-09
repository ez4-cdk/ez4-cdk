package com.delta.playandroid.ui.adapter;

import android.annotation.SuppressLint;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.delta.playandroid.R;
import com.delta.playandroid.data.model.bean.entity.User;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u000eH\u0007J\u001c\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$viewHolder;", "onLogInPosition", "Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$onUserClickListener;", "(Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$onUserClickListener;)V", "userList", "Ljava/util/ArrayList;", "Lcom/delta/playandroid/data/model/bean/entity/User;", "getItemCount", "", "initUserList", "", "users", "Lkotlin/collections/ArrayList;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUserClickListener", "viewHolder", "app_debug"})
public final class FastLogInUserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.delta.playandroid.ui.adapter.FastLogInUserAdapter.viewHolder> {
    private final com.delta.playandroid.ui.adapter.FastLogInUserAdapter.onUserClickListener onLogInPosition = null;
    private java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.User> userList;
    
    public FastLogInUserAdapter(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.FastLogInUserAdapter.onUserClickListener onLogInPosition) {
        super();
    }
    
    /**
     * @Date 2024/11/19
     * @Description 修复了进入游客模式后点击收藏时闪退的BUG
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void initUserList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.delta.playandroid.data.model.bean.entity.User> users) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.delta.playandroid.ui.adapter.FastLogInUserAdapter.viewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.delta.playandroid.ui.adapter.FastLogInUserAdapter.viewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$onUserClickListener;", "", "login", "", "position", "", "app_debug"})
    public static abstract interface onUserClickListener {
        
        public abstract void login(int position);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter$viewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/delta/playandroid/ui/adapter/FastLogInUserAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getAvatar", "()Landroid/widget/ImageView;", "username", "Landroid/widget/TextView;", "getUsername", "()Landroid/widget/TextView;", "app_debug"})
    public final class viewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView username = null;
        private final android.widget.ImageView avatar = null;
        
        public viewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getUsername() {
            return null;
        }
        
        public final android.widget.ImageView getAvatar() {
            return null;
        }
    }
}