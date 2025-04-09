package com.delta.playandroidpro.search.room;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/delta/playandroidpro/search/room/HistoryDao;", "", "existUserHistory", "", "username", "getHistoryByUsername", "insertHistory", "", "historyEntity", "Lcom/delta/playandroidpro/search/room/HistoryTag;", "modifyHistory", "", "app_debug"})
@androidx.room.Dao
public abstract interface HistoryDao {
    
    @androidx.room.Query(value = "SELECT history FROM historyTable WHERE username =:username")
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getHistoryByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username);
    
    @androidx.room.Insert
    public abstract long insertHistory(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.search.room.HistoryTag historyEntity);
    
    @androidx.room.Update
    public abstract int modifyHistory(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.search.room.HistoryTag historyEntity);
    
    @androidx.room.Query(value = "SELECT history FROM historyTable WHERE username =:username")
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String existUserHistory(@org.jetbrains.annotations.NotNull
    java.lang.String username);
}