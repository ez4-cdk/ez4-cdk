package com.delta.playandroidpro.login.room;

/**
 * @description 用户数据访问对象
 * @author delta
 * @date 2025/2/4 16:12
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/delta/playandroidpro/login/room/UserDao;", "", "checkValid", "Lcom/delta/playandroidpro/login/room/UserTag;", "username", "", "password", "deleteUser", "", "user", "getAllUser", "", "getAvatarByUsername", "insertUser", "", "updateUser", "app_debug"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM user")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.delta.playandroidpro.login.room.UserTag> getAllUser();
    
    @androidx.room.Query(value = "SELECT * FROM user WHERE username = :username AND password = :password")
    @org.jetbrains.annotations.Nullable
    public abstract com.delta.playandroidpro.login.room.UserTag checkValid(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password);
    
    @androidx.room.Insert
    public abstract long insertUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.room.UserTag user);
    
    @androidx.room.Delete
    public abstract int deleteUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.room.UserTag user);
    
    @androidx.room.Update
    public abstract int updateUser(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.room.UserTag user);
    
    @androidx.room.Query(value = "SELECT avatar FROM user WHERE username = :username")
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getAvatarByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username);
}