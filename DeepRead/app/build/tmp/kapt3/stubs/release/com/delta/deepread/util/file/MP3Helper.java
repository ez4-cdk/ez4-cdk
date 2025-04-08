package com.delta.deepread.util.file;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001d\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/delta/deepread/util/file/MP3Helper;", "", "()V", "MUSIC_DIR_NAME", "", "createMP3SourcesDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "getFileNameFromUri", "uri", "Landroid/net/Uri;", "getMp3Duration", "", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/Long;", "getMp3FileSize", "readMP3FromFile", "", "writeMp3ToFile", "song", "Lcom/delta/deepread/center/music/data/Song;", "app_release"})
public final class MP3Helper {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MUSIC_DIR_NAME = "sources/music";
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.util.file.MP3Helper INSTANCE = null;
    
    private MP3Helper() {
        super();
    }
    
    private final java.io.File createMP3SourcesDirectory(android.content.Context context) {
        return null;
    }
    
    private final byte[] readMP3FromFile(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String writeMp3ToFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.data.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getMp3FileSize(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getMp3Duration(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String getFileNameFromUri(android.content.Context context, android.net.Uri uri) {
        return null;
    }
}