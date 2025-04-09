package com.delta.playandroid.databinding;
import com.delta.playandroid.R;
import com.delta.playandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvPageBindingImpl extends RvPageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv, 1);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RvPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private RvPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.articleVM2 == variableId) {
            setArticleVM2((com.delta.playandroid.viewmodel.ArticleViewModel) variable);
        }
        else if (BR.articleVM3 == variableId) {
            setArticleVM3((com.delta.playandroid.viewmodel.CollectViewModel) variable);
        }
        else if (BR.articleVM == variableId) {
            setArticleVM((com.delta.playandroid.viewmodel.TreeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticleVM2(@Nullable com.delta.playandroid.viewmodel.ArticleViewModel ArticleVM2) {
        this.mArticleVM2 = ArticleVM2;
    }
    public void setArticleVM3(@Nullable com.delta.playandroid.viewmodel.CollectViewModel ArticleVM3) {
        this.mArticleVM3 = ArticleVM3;
    }
    public void setArticleVM(@Nullable com.delta.playandroid.viewmodel.TreeViewModel ArticleVM) {
        this.mArticleVM = ArticleVM;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): articleVM2
        flag 1 (0x2L): articleVM3
        flag 2 (0x3L): articleVM
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}