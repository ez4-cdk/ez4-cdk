package com.delta.deepread.center.read.desk.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/deepread/center/read/desk/ui/Desktop;", "Lcom/delta/deepread/common/BaseFragment;", "Lcom/delta/deepread/databinding/ReadBinding;", "()V", "floatingMenu", "Landroid/widget/LinearLayout;", "floatingView", "Landroid/view/View;", "floatingViewRoot", "lock", "", "viewModel", "Lcom/delta/deepread/center/read/ReadViewModel;", "getViewModel", "()Lcom/delta/deepread/center/read/ReadViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "closeFloatingMenu", "", "expandFloatingMenu", "initView", "loaded", "loading", "FloatingViewDragListener", "app_release"})
public final class Desktop extends com.delta.deepread.common.BaseFragment<com.delta.deepread.databinding.ReadBinding> {
    private android.view.View floatingViewRoot;
    private android.view.View floatingView;
    private android.widget.LinearLayout floatingMenu;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object lock = null;
    
    public Desktop() {
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
    
    private final void expandFloatingMenu() {
    }
    
    private final void closeFloatingMenu() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/delta/deepread/center/read/desk/ui/Desktop$FloatingViewDragListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/delta/deepread/center/read/desk/ui/Desktop;)V", "isDragging", "", "rotationAnimator", "Landroid/animation/ObjectAnimator;", "x", "", "y", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "startRotationAnimation", "", "stopRotationAnimation", "app_release"})
    public final class FloatingViewDragListener implements android.view.View.OnTouchListener {
        private int x = 0;
        private int y = 0;
        private boolean isDragging = false;
        @org.jetbrains.annotations.Nullable
        private android.animation.ObjectAnimator rotationAnimator;
        
        public FloatingViewDragListener() {
            super();
        }
        
        private final void startRotationAnimation() {
        }
        
        private final void stopRotationAnimation() {
        }
        
        @java.lang.Override
        public boolean onTouch(@org.jetbrains.annotations.Nullable
        android.view.View v, @org.jetbrains.annotations.Nullable
        android.view.MotionEvent event) {
            return false;
        }
    }
}