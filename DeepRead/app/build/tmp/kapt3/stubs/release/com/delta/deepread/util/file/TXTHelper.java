package com.delta.deepread.util.file;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/delta/deepread/util/file/TXTHelper;", "", "()V", "TEXT_DIR_NAME", "", "createTXTSourcesDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "deleteFileFromDirectory", "", "novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "readFromSourcesDirectory", "fileName", "readTXTFromFile", "uri", "Landroid/net/Uri;", "saveToSourcesDirectory", "app_release"})
public final class TXTHelper {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TEXT_DIR_NAME = "sources/text";
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.util.file.TXTHelper INSTANCE = null;
    
    private TXTHelper() {
        super();
    }
    
    private final java.lang.String readTXTFromFile(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    public final boolean deleteFileFromDirectory(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
        return false;
    }
    
    private final java.io.File createTXTSourcesDirectory(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String saveToSourcesDirectory(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String readFromSourcesDirectory(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
}