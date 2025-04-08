package com.delta.deepread.center.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/delta/deepread/center/room/DefaultDatabase;", "Landroidx/room/RoomDatabase;", "()V", "bookstoreDao", "Lcom/delta/deepread/center/room/BookshelfDao;", "deleteDatabase", "", "context", "Landroid/content/Context;", "musicDao", "Lcom/delta/deepread/center/room/MusicDao;", "Companion", "app_release"})
@androidx.room.Database(entities = {com.delta.deepread.center.read.bookshelf.data.Novel.class, com.delta.deepread.center.music.data.Song.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.delta.deepread.center.room.TypeConverter.class})
public abstract class DefaultDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DB_NAME = "DEFAULT_DATABASE";
    @org.jetbrains.annotations.Nullable
    private static com.delta.deepread.center.room.DefaultDatabase instance;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.center.room.DefaultDatabase.Companion Companion = null;
    
    public DefaultDatabase() {
        super();
    }
    
    public final void deleteDatabase(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.delta.deepread.center.room.BookshelfDao bookstoreDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.delta.deepread.center.room.MusicDao musicDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/deepread/center/room/DefaultDatabase$Companion;", "", "()V", "DB_NAME", "", "instance", "Lcom/delta/deepread/center/room/DefaultDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.delta.deepread.center.room.DefaultDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}