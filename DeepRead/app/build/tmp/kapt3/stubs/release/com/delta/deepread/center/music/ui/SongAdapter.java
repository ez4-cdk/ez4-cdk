package com.delta.deepread.center.music.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001e\u001f !B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/delta/deepread/center/music/ui/SongAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onSongClickImpl", "Lcom/delta/deepread/center/music/ui/SongAdapter$onSongClickInterface;", "(Lcom/delta/deepread/center/music/ui/SongAdapter$onSongClickInterface;)V", "songNamesSet", "", "", "songs", "Ljava/util/ArrayList;", "Lcom/delta/deepread/center/music/data/Song;", "addSong", "", "song", "contains", "", "songName", "getItemCount", "", "getItemViewType", "position", "initSongs", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "FooterViewHolder", "SongViewHolder", "onSongClickInterface", "app_release"})
public final class SongAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.center.music.ui.SongAdapter.onSongClickInterface onSongClickImpl = null;
    private static final int TYPE_SONG = 0;
    private static final int TYPE_FOOTER = 1;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.delta.deepread.center.music.data.Song> songs;
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<java.lang.String> songNamesSet = null;
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.center.music.ui.SongAdapter.Companion Companion = null;
    
    public SongAdapter(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.ui.SongAdapter.onSongClickInterface onSongClickImpl) {
        super();
    }
    
    public final void initSongs(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.deepread.center.music.data.Song> songs) {
    }
    
    public final void addSong(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.data.Song song) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull
    java.lang.String songName) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/deepread/center/music/ui/SongAdapter$Companion;", "", "()V", "TYPE_FOOTER", "", "TYPE_SONG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/delta/deepread/center/music/ui/SongAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/deepread/databinding/SongFooterBinding;", "(Lcom/delta/deepread/center/music/ui/SongAdapter;Lcom/delta/deepread/databinding/SongFooterBinding;)V", "bind", "", "app_release"})
    public final class FooterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.deepread.databinding.SongFooterBinding binding = null;
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.deepread.databinding.SongFooterBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/delta/deepread/center/music/ui/SongAdapter$SongViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/delta/deepread/databinding/SongBinding;", "(Lcom/delta/deepread/center/music/ui/SongAdapter;Lcom/delta/deepread/databinding/SongBinding;)V", "bind", "", "song", "Lcom/delta/deepread/center/music/data/Song;", "showDeleteDialog", "app_release"})
    public final class SongViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.delta.deepread.databinding.SongBinding binding = null;
        
        public SongViewHolder(@org.jetbrains.annotations.NotNull
        com.delta.deepread.databinding.SongBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.delta.deepread.center.music.data.Song song) {
        }
        
        private final void showDeleteDialog(com.delta.deepread.center.music.data.Song song) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/delta/deepread/center/music/ui/SongAdapter$onSongClickInterface;", "", "onFooterClick", "", "onSongClick", "song", "Lcom/delta/deepread/center/music/data/Song;", "onSongRemove", "index", "", "app_release"})
    public static abstract interface onSongClickInterface {
        
        public abstract void onSongClick(@org.jetbrains.annotations.NotNull
        com.delta.deepread.center.music.data.Song song);
        
        public abstract void onFooterClick();
        
        public abstract void onSongRemove(int index);
    }
}