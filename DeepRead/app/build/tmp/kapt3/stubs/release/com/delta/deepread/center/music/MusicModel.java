package com.delta.deepread.center.music;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\r0\u000bJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/delta/deepread/center/music/MusicModel;", "", "()V", "deleteSong", "", "context", "Landroid/content/Context;", "song", "Lcom/delta/deepread/center/music/data/Song;", "getAllSongs", "_songs", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "writeMP3ToFile", "app_release"})
public final class MusicModel {
    
    public MusicModel() {
        super();
    }
    
    public final void writeMP3ToFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.data.Song song) {
    }
    
    public final void getAllSongs(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.delta.deepread.center.music.data.Song>> _songs) {
    }
    
    public final void deleteSong(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.data.Song song) {
    }
}