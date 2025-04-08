package com.delta.deepread.util.file;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\n0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/delta/deepread/util/file/Selector;", "", "fragment", "Landroidx/fragment/app/Fragment;", "uriHandler", "Lcom/delta/deepread/util/file/Selector$onHandleUri;", "(Landroidx/fragment/app/Fragment;Lcom/delta/deepread/util/file/Selector$onHandleUri;)V", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "selectFileLauncher", "kotlin.jvm.PlatformType", "getFileNameFromUri", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "requestForMP3File", "", "requestForTXTFile", "requestPermissions", "onHandleUri", "app_release"})
public final class Selector {
    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.util.file.Selector.onHandleUri uriHandler = null;
    
    /**
     * 文件选择器
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> selectFileLauncher = null;
    
    /**
     * 权限请求器
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    
    public Selector(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    com.delta.deepread.util.file.Selector.onHandleUri uriHandler) {
        super();
    }
    
    /**
     * 发起文件选择请求
     */
    public final void requestForTXTFile() {
    }
    
    public final void requestForMP3File() {
    }
    
    private final java.lang.String getFileNameFromUri(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    public final void requestPermissions() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/delta/deepread/util/file/Selector$onHandleUri;", "", "onHandle", "", "fileName", "", "uri", "Landroid/net/Uri;", "app_release"})
    public static abstract interface onHandleUri {
        
        public abstract void onHandle(@org.jetbrains.annotations.Nullable
        java.lang.String fileName, @org.jetbrains.annotations.NotNull
        android.net.Uri uri);
    }
}