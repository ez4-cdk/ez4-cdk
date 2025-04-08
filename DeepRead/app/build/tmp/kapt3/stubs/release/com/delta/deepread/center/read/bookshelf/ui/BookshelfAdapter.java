package com.delta.deepread.center.read.bookshelf.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0010\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$OnItemClickListener;", "(Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$OnItemClickListener;)V", "Novels", "Ljava/util/ArrayList;", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "Lkotlin/collections/ArrayList;", "addBooks", "", "", "bookChange", "it", "containsNovel", "", "novelName", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookViewHolder", "Companion", "FooterViewHolder", "OnItemClickListener", "app_release"})
public final class BookshelfAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.center.read.bookshelf.ui.BookshelfAdapter.OnItemClickListener listener = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.delta.deepread.center.read.bookshelf.data.Novel> Novels;
    private static final int TYPE_BOOK = 0;
    private static final int TYPE_FOOTER = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.center.read.bookshelf.ui.BookshelfAdapter.Companion Companion = null;
    
    public BookshelfAdapter(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.ui.BookshelfAdapter.OnItemClickListener listener) {
        super();
    }
    
    public final void addBooks(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.deepread.center.read.bookshelf.data.Novel> Novels) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void bookChange(@org.jetbrains.annotations.Nullable
    com.delta.deepread.center.read.bookshelf.data.Novel it) {
    }
    
    public final boolean containsNovel(@org.jetbrains.annotations.NotNull
    java.lang.String novelName) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/deepread/databinding/BookBinding;", "(Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter;Lcom/delta/deepread/databinding/BookBinding;)V", "bind", "", "novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "showDeleteDialog", "app_release"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.deepread.databinding.BookBinding binding = null;
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.deepread.databinding.BookBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.deepread.center.read.bookshelf.data.Novel novel) {
        }
        
        private final void showDeleteDialog(com.delta.deepread.center.read.bookshelf.data.Novel novel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$Companion;", "", "()V", "TYPE_BOOK", "", "TYPE_FOOTER", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/deepread/databinding/NovelFooterBinding;", "(Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter;Lcom/delta/deepread/databinding/NovelFooterBinding;)V", "bind", "", "app_release"})
    public final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.deepread.databinding.NovelFooterBinding binding = null;
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.deepread.databinding.NovelFooterBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/delta/deepread/center/read/bookshelf/ui/BookshelfAdapter$OnItemClickListener;", "", "onBookClick", "", "novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "onDeleteNovel", "onFooterClick", "app_release"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onBookClick(@org.jetbrains.annotations.NotNull
        com.delta.deepread.center.read.bookshelf.data.Novel novel);
        
        public abstract void onFooterClick();
        
        public abstract void onDeleteNovel(@org.jetbrains.annotations.NotNull
        com.delta.deepread.center.read.bookshelf.data.Novel novel);
    }
}