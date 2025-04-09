package com.delta.playandroidpro.search.room;

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/search/room/HistoryDataBase;", "Landroidx/room/RoomDatabase;", "()V", "historyDao", "Lcom/delta/playandroidpro/search/room/HistoryDao;", "Companion", "app_release"})
@androidx.room.Database(entities = {com.delta.playandroidpro.search.room.HistoryTag.class}, version = 1, exportSchema = false)
public abstract class HistoryDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DB_NAME = "HISTORY_DATABASE";
    @org.jetbrains.annotations.Nullable
    private static com.delta.playandroidpro.search.room.HistoryDataBase instance;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.playandroidpro.search.room.HistoryDataBase.Companion Companion = null;
    
    public HistoryDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.delta.playandroidpro.search.room.HistoryDao historyDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/playandroidpro/search/room/HistoryDataBase$Companion;", "", "()V", "DB_NAME", "", "instance", "Lcom/delta/playandroidpro/search/room/HistoryDataBase;", "getInstance", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.playandroidpro.search.room.HistoryDataBase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}