package com.delta.playandroid.databinding;
import com.delta.playandroid.R;
import com.delta.playandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SignupBindingImpl extends SignupBinding implements com.delta.playandroid.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.usernameLayout, 5);
        sViewsWithIds.put(R.id.passwordLayout, 6);
        sViewsWithIds.put(R.id.rePasswordLayout, 7);
        sViewsWithIds.put(R.id.jump, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener passwordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.pwdInput.getValue()
            //         is signUpViewModel.pwdInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(password);
            // localize variables for thread safety
            // signUpViewModel.pwdInput.getValue()
            java.lang.String signUpViewModelPwdInputGetValue = null;
            // signUpViewModel.pwdInput != null
            boolean signUpViewModelPwdInputJavaLangObjectNull = false;
            // signUpViewModel.pwdInput
            androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelPwdInput = null;
            // signUpViewModel
            com.delta.playandroid.viewmodel.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelPwdInput = signUpViewModel.getPwdInput();

                signUpViewModelPwdInputJavaLangObjectNull = (signUpViewModelPwdInput) != (null);
                if (signUpViewModelPwdInputJavaLangObjectNull) {




                    signUpViewModelPwdInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener rePasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.rePwdInput.getValue()
            //         is signUpViewModel.rePwdInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(rePassword);
            // localize variables for thread safety
            // signUpViewModel.rePwdInput.getValue()
            java.lang.String signUpViewModelRePwdInputGetValue = null;
            // signUpViewModel.rePwdInput
            androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelRePwdInput = null;
            // signUpViewModel.rePwdInput != null
            boolean signUpViewModelRePwdInputJavaLangObjectNull = false;
            // signUpViewModel
            com.delta.playandroid.viewmodel.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelRePwdInput = signUpViewModel.getRePwdInput();

                signUpViewModelRePwdInputJavaLangObjectNull = (signUpViewModelRePwdInput) != (null);
                if (signUpViewModelRePwdInputJavaLangObjectNull) {




                    signUpViewModelRePwdInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.usnInput.getValue()
            //         is signUpViewModel.usnInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // signUpViewModel.usnInput != null
            boolean signUpViewModelUsnInputJavaLangObjectNull = false;
            // signUpViewModel.usnInput
            androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelUsnInput = null;
            // signUpViewModel.usnInput.getValue()
            java.lang.String signUpViewModelUsnInputGetValue = null;
            // signUpViewModel
            com.delta.playandroid.viewmodel.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelUsnInput = signUpViewModel.getUsnInput();

                signUpViewModelUsnInputJavaLangObjectNull = (signUpViewModelUsnInput) != (null);
                if (signUpViewModelUsnInputJavaLangObjectNull) {




                    signUpViewModelUsnInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public SignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private SignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[8]
            , (android.widget.Button) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.login.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.password.setTag(null);
        this.rePassword.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.delta.playandroid.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.signUpViewModel == variableId) {
            setSignUpViewModel((com.delta.playandroid.viewmodel.SignUpViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignUpViewModel(@Nullable com.delta.playandroid.viewmodel.SignUpViewModel SignUpViewModel) {
        this.mSignUpViewModel = SignUpViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.signUpViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignUpViewModelPwdInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSignUpViewModelUsnInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSignUpViewModelRePwdInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignUpViewModelPwdInput(androidx.lifecycle.MutableLiveData<java.lang.String> SignUpViewModelPwdInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignUpViewModelUsnInput(androidx.lifecycle.MutableLiveData<java.lang.String> SignUpViewModelUsnInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSignUpViewModelRePwdInput(androidx.lifecycle.MutableLiveData<java.lang.String> SignUpViewModelRePwdInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        java.lang.String signUpViewModelPwdInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelPwdInput = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelUsnInput = null;
        com.delta.playandroid.viewmodel.SignUpViewModel signUpViewModel = mSignUpViewModel;
        java.lang.String signUpViewModelRePwdInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> signUpViewModelRePwdInput = null;
        java.lang.String signUpViewModelUsnInputGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (signUpViewModel != null) {
                        // read signUpViewModel.pwdInput
                        signUpViewModelPwdInput = signUpViewModel.getPwdInput();
                    }
                    updateLiveDataRegistration(0, signUpViewModelPwdInput);


                    if (signUpViewModelPwdInput != null) {
                        // read signUpViewModel.pwdInput.getValue()
                        signUpViewModelPwdInputGetValue = signUpViewModelPwdInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (signUpViewModel != null) {
                        // read signUpViewModel.usnInput
                        signUpViewModelUsnInput = signUpViewModel.getUsnInput();
                    }
                    updateLiveDataRegistration(1, signUpViewModelUsnInput);


                    if (signUpViewModelUsnInput != null) {
                        // read signUpViewModel.usnInput.getValue()
                        signUpViewModelUsnInputGetValue = signUpViewModelUsnInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (signUpViewModel != null) {
                        // read signUpViewModel.rePwdInput
                        signUpViewModelRePwdInput = signUpViewModel.getRePwdInput();
                    }
                    updateLiveDataRegistration(2, signUpViewModelRePwdInput);


                    if (signUpViewModelRePwdInput != null) {
                        // read signUpViewModel.rePwdInput.getValue()
                        signUpViewModelRePwdInputGetValue = signUpViewModelRePwdInput.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.login.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.password, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.rePassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, rePasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, signUpViewModelPwdInputGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rePassword, signUpViewModelRePwdInputGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, signUpViewModelUsnInputGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // signUpViewModel
        com.delta.playandroid.viewmodel.SignUpViewModel signUpViewModel = mSignUpViewModel;
        // signUpViewModel != null
        boolean signUpViewModelJavaLangObjectNull = false;



        signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
        if (signUpViewModelJavaLangObjectNull) {


            signUpViewModel.signUp();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signUpViewModel.pwdInput
        flag 1 (0x2L): signUpViewModel.usnInput
        flag 2 (0x3L): signUpViewModel.rePwdInput
        flag 3 (0x4L): signUpViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}