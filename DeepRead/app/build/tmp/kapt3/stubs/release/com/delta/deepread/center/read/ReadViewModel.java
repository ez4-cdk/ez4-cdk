package com.delta.deepread.center.read;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u0011\u001a\u00020\u001aJ\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\tJ\u001e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\'\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\u00170\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/delta/deepread/center/read/ReadViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_deskbook", "Landroidx/lifecycle/MutableLiveData;", "", "_height", "", "_novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "_novelList", "Ljava/util/ArrayList;", "desktopNovel", "Landroidx/lifecycle/LiveData;", "getDesktopNovel", "()Landroidx/lifecycle/LiveData;", "height", "getHeight", "model", "Lcom/delta/deepread/center/read/ReadModel;", "novel", "getNovel", "novelList", "Lkotlin/collections/ArrayList;", "getNovelList", "addNovel", "", "context", "Landroid/content/Context;", "deleteNovel", "requireContext", "getAllNovels", "readNovelContent", "saveNovelProcess", "process", "Companion", "app_release"})
public final class ReadViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.center.read.ReadModel model = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.delta.deepread.center.read.bookshelf.data.Novel> _novel = null;
    private static final int UPLOAD_MODE = 0;
    private static final int READ_MODE = 1;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.deepread.center.read.bookshelf.data.Novel>> _novelList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _deskbook = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _height = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.center.read.ReadViewModel.Companion Companion = null;
    
    public ReadViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.delta.deepread.center.read.bookshelf.data.Novel>> getNovelList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getDesktopNovel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.delta.deepread.center.read.bookshelf.data.Novel> getNovel() {
        return null;
    }
    
    public final void addNovel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
    
    public final void getAllNovels(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void readNovelContent(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
    
    /**
     * 小说阅读进度
     */
    public final void getHeight() {
    }
    
    /**
     * 保存阅读进度
     */
    public final void saveNovelProcess(@org.jetbrains.annotations.NotNull
    android.content.Context context, int process, int height) {
    }
    
    public final void deleteNovel(@org.jetbrains.annotations.NotNull
    android.content.Context requireContext, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/deepread/center/read/ReadViewModel$Companion;", "", "()V", "READ_MODE", "", "UPLOAD_MODE", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}