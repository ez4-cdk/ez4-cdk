package com.delta.deepread.center.music.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\b\u00101\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/delta/deepread/center/music/ui/Music;", "Lcom/delta/deepread/common/BaseFragment;", "Lcom/delta/deepread/databinding/MusicBinding;", "Lcom/delta/deepread/center/music/ui/SongAdapter$onSongClickInterface;", "Lcom/delta/deepread/util/file/Selector$onHandleUri;", "()V", "adapter", "Lcom/delta/deepread/center/music/ui/SongAdapter;", "bsb", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "isBound", "", "musicService", "Lcom/delta/deepread/center/music/component/MusicService;", "objectAnimator", "Landroid/animation/ObjectAnimator;", "selector", "Lcom/delta/deepread/util/file/Selector;", "serviceConnection", "Landroid/content/ServiceConnection;", "viewModel", "Lcom/delta/deepread/center/music/MusicViewModel;", "hideBottomSheetIfExpanded", "", "initView", "isPlaying", "loaded", "loading", "onDestroy", "onFooterClick", "onHandle", "fileName", "", "uri", "Landroid/net/Uri;", "onSongClick", "song", "Lcom/delta/deepread/center/music/data/Song;", "onSongRemove", "index", "", "playMusic", "runAnimation", "setUpBottomSheetBehavior", "stopAnimation", "stopMusic", "toggleBottomSheet", "togglePlayPause", "togglePlaybackMode", "Companion", "app_debug"})
public final class Music extends com.delta.deepread.common.BaseFragment<com.delta.deepread.databinding.MusicBinding> implements com.delta.deepread.center.music.ui.SongAdapter.onSongClickInterface, com.delta.deepread.util.file.Selector.onHandleUri {
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.util.file.Selector selector = null;
    private com.delta.deepread.center.music.MusicViewModel viewModel;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> bsb;
    @org.jetbrains.annotations.NotNull
    private final com.delta.deepread.center.music.ui.SongAdapter adapter = null;
    @org.jetbrains.annotations.Nullable
    private android.animation.ObjectAnimator objectAnimator;
    @org.jetbrains.annotations.Nullable
    private com.delta.deepread.center.music.component.MusicService musicService;
    private boolean isBound = false;
    @org.jetbrains.annotations.NotNull
    private final android.content.ServiceConnection serviceConnection = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MODE_SEQUENCE = "\u987a\u5e8f\u64ad\u653e";
    private static final int MODE_SEQUENCE_INT = 0;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MODE_SHUFFLE = "\u968f\u673a\u64ad\u653e";
    private static final int MODE_SHUFFLE_INT = 1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MODE_SINGLE_LOOP = "\u5355\u66f2\u5faa\u73af";
    private static final int MODE_SINGLE_LOOP_INT = 3;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MODE_LIST_LOOP = "\u5217\u8868\u5faa\u73af";
    private static final int MODE_LIST_LOOP_INT = 2;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String OVER = "\u5df2\u7ecf\u64ad\u653e\u5b8c\u6bd5\uff0c\u8bf7\u91cd\u65b0\u9009\u66f2";
    @org.jetbrains.annotations.NotNull
    public static final com.delta.deepread.center.music.ui.Music.Companion Companion = null;
    
    public Music() {
        super(0, null);
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
    
    private final void setUpBottomSheetBehavior() {
    }
    
    private final void togglePlaybackMode() {
    }
    
    private final void toggleBottomSheet() {
    }
    
    private final void togglePlayPause() {
    }
    
    private final boolean isPlaying() {
        return false;
    }
    
    private final void runAnimation() {
    }
    
    private final void stopAnimation() {
    }
    
    private final void playMusic() {
    }
    
    private final void stopMusic() {
    }
    
    private final void hideBottomSheetIfExpanded() {
    }
    
    @java.lang.Override
    public void onSongClick(@org.jetbrains.annotations.NotNull
    com.delta.deepread.center.music.data.Song song) {
    }
    
    @java.lang.Override
    public void onFooterClick() {
    }
    
    @java.lang.Override
    public void onSongRemove(int index) {
    }
    
    @java.lang.Override
    public void onHandle(@org.jetbrains.annotations.Nullable
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/delta/deepread/center/music/ui/Music$Companion;", "", "()V", "MODE_LIST_LOOP", "", "MODE_LIST_LOOP_INT", "", "MODE_SEQUENCE", "MODE_SEQUENCE_INT", "MODE_SHUFFLE", "MODE_SHUFFLE_INT", "MODE_SINGLE_LOOP", "MODE_SINGLE_LOOP_INT", "OVER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}