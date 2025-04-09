package com.delta.playandroidpro.login.widget.ExpandableCardView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/delta/playandroidpro/login/widget/ExpandableCardView/ExpandableCardView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button", "Landroid/widget/ImageButton;", "mOnClickListener", "Lcom/delta/playandroidpro/login/widget/ExpandableCardView/ExpandableCardView$onClickListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "textView", "Landroid/widget/TextView;", "setData", "", "data", "", "Lcom/delta/playandroidpro/login/bean/User;", "setOnItemClickListener", "onClickListener", "app_debug"})
public final class ExpandableCardView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull
    private android.widget.ImageButton button;
    @org.jetbrains.annotations.NotNull
    private android.widget.TextView textView;
    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.Nullable
    private com.delta.playandroidpro.login.widget.ExpandableCardView.ExpandableCardView.onClickListener mOnClickListener;
    
    @kotlin.jvm.JvmOverloads
    public ExpandableCardView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.delta.playandroidpro.login.bean.User> data) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.delta.playandroidpro.login.widget.ExpandableCardView.ExpandableCardView.onClickListener onClickListener) {
    }
    
    @kotlin.jvm.JvmOverloads
    public ExpandableCardView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExpandableCardView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/delta/playandroidpro/login/widget/ExpandableCardView/ExpandableCardView$onClickListener;", "", "onClick", "", "user", "Lcom/delta/playandroidpro/login/bean/User;", "app_debug"})
    public static abstract interface onClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        com.delta.playandroidpro.login.bean.User user);
    }
}