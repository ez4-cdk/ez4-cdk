package com.delta.deepread;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/deepread/CustomExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultHandler", "createExceptionSourcesDirectory", "Ljava/io/File;", "getLogMessage", "", "thread", "Ljava/lang/Thread;", "throwable", "", "logToFile", "", "uncaughtException", "Companion", "app_debug"})
public final class CustomExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "CustomExceptionHandler";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EXCEPTION_DIR_NAME = "crash_logs";
    @org.jetbrains.annotations.Nullable
    private final java.lang.Thread.UncaughtExceptionHandler defaultHandler = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.CustomExceptionHandler.Companion Companion = null;
    
    public CustomExceptionHandler(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void uncaughtException(@org.jetbrains.annotations.NotNull
    java.lang.Thread thread, @org.jetbrains.annotations.NotNull
    java.lang.Throwable throwable) {
    }
    
    private final void logToFile(java.lang.Thread thread, java.lang.Throwable throwable) {
    }
    
    private final java.io.File createExceptionSourcesDirectory(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getLogMessage(java.lang.Thread thread, java.lang.Throwable throwable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/deepread/CustomExceptionHandler$Companion;", "", "()V", "EXCEPTION_DIR_NAME", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}