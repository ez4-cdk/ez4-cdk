package com.delta.deepread.center.read;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000e0\fJ,\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b\u00a8\u0006\u0016"}, d2 = {"Lcom/delta/deepread/center/read/ReadModel;", "", "()V", "deleteBook", "", "requireContext", "Landroid/content/Context;", "novel", "Lcom/delta/deepread/center/read/bookshelf/data/Novel;", "getAllBooks", "context", "_novelList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNovelContent", "_deskbook", "", "MODE", "", "saveNovel", "value", "app_release"})
public final class ReadModel {
    
    public ReadModel() {
        super();
    }
    
    public final void getNovelContent(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> _deskbook, int MODE) {
    }
    
    public final void getAllBooks(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.deepread.center.read.bookshelf.data.Novel>> _novelList) {
    }
    
    public final void saveNovel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel value) {
    }
    
    public final void deleteBook(@org.jetbrains.annotations.NotNull
    android.content.Context requireContext, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.read.bookshelf.data.Novel novel) {
    }
}