package com.delta.deepread.center.read.bookshelf.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/Bookshelf;", "Lcom/delta/deepread/common/BaseFragment;", "Lcom/delta/deepread/databinding/BookstoreBinding;", "Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$OnItemClickListener;", "Lcom/delta/deepread/util/file/Selector$onHandleUri;", "()V", "bookshelfAdapter", "Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter;", "dateFormat", "Ljava/text/SimpleDateFormat;", "selector", "Lcom/delta/deepread/util/file/Selector;", "viewModel", "Lcom/delta/deepread/center/read/ReadViewModel;", "getViewModel", "()Lcom/delta/deepread/center/read/ReadViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initView", "", "loaded", "loading", "onBookClick", "novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "onDeleteNovel", "onFooterClick", "onHandle", "fileName", "", "uri", "Landroid/net/Uri;", "app_release"})
public final class Bookshelf extends com.delta.deepread.common.BaseFragment<com.delta.deepread.databinding.BookstoreBinding> implements com.delta.deepread.center.read.bookshelf.ui.BookshelfAdapter.OnItemClickListener, com.delta.deepread.util.file.Selector.onHandleUri {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.delta.deepread.center.read.bookshelf.ui.BookshelfAdapter bookshelfAdapter;
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.util.file.Selector selector = null;
    @org.jetbrains.annotations.NotNull
    private final java.text.SimpleDateFormat dateFormat = null;
    
    public Bookshelf() {
        super(0, null);
    }
    
    private final com.delta.deepread.center.read.ReadViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void loading() {
    }
    
    @java.lang.Override
    public void loaded() {
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onBookClick(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
    
    @java.lang.Override
    public void onFooterClick() {
    }
    
    @java.lang.Override
    public void onDeleteNovel(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
    
    @java.lang.Override
    public void onHandle(@org.jetbrains.annotations.Nullable
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
}