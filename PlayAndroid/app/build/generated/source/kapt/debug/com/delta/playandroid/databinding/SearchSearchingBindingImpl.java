package com.delta.playandroid.databinding;
import com.delta.playandroid.R;
import com.delta.playandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchSearchingBindingImpl extends SearchSearchingBinding implements com.delta.playandroid.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hotkey_card, 2);
        sViewsWithIds.put(R.id.hotkey_card_container, 3);
        sViewsWithIds.put(R.id.history_card, 4);
        sViewsWithIds.put(R.id.history_tag, 5);
        sViewsWithIds.put(R.id.history_card_container, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchSearchingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private SearchSearchingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (com.google.android.flexbox.FlexboxLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (com.google.android.flexbox.FlexboxLayout) bindings[3]
            );
        this.clearHistoryTag.setTag(null);
        this.content.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.delta.playandroid.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.searchViewModel == variableId) {
            setSearchViewModel((com.delta.playandroid.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchViewModel(@Nullable com.delta.playandroid.viewmodel.SearchViewModel SearchViewModel) {
        this.mSearchViewModel = SearchViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchViewModel);
        super.requestRebind();
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
        com.delta.playandroid.viewmodel.SearchViewModel searchViewModel = mSearchViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.clearHistoryTag.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // searchViewModel
        com.delta.playandroid.viewmodel.SearchViewModel searchViewModel = mSearchViewModel;
        // searchViewModel != null
        boolean searchViewModelJavaLangObjectNull = false;



        searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
        if (searchViewModelJavaLangObjectNull) {


            searchViewModel.cleanHistory();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}