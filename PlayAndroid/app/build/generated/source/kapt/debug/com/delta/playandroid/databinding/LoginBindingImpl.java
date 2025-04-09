package com.delta.playandroid.databinding;
import com.delta.playandroid.R;
import com.delta.playandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoginBindingImpl extends LoginBinding implements com.delta.playandroid.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.autoLogin_user, 6);
        sViewsWithIds.put(R.id.login_tag, 7);
        sViewsWithIds.put(R.id.usernameLayout, 8);
        sViewsWithIds.put(R.id.passwordLayout, 9);
        sViewsWithIds.put(R.id.jump, 10);
        sViewsWithIds.put(R.id.freeMode, 11);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener AutoLoginandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.autoLogin.getValue()
            //         is loginViewModel.autoLogin.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = AutoLogin.isChecked();
            // localize variables for thread safety
            // loginViewModel.autoLogin
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginViewModelAutoLogin = null;
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.autoLogin.getValue()
            java.lang.Boolean loginViewModelAutoLoginGetValue = null;
            // loginViewModel.autoLogin != null
            boolean loginViewModelAutoLoginJavaLangObjectNull = false;
            // loginViewModel
            com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelAutoLogin = loginViewModel.getAutoLogin();

                loginViewModelAutoLoginJavaLangObjectNull = (loginViewModelAutoLogin) != (null);
                if (loginViewModelAutoLoginJavaLangObjectNull) {




                    loginViewModelAutoLogin.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener passwordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.pwdInput.getValue()
            //         is loginViewModel.pwdInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(password);
            // localize variables for thread safety
            // loginViewModel.pwdInput
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPwdInput = null;
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.pwdInput.getValue()
            java.lang.String loginViewModelPwdInputGetValue = null;
            // loginViewModel
            com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.pwdInput != null
            boolean loginViewModelPwdInputJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPwdInput = loginViewModel.getPwdInput();

                loginViewModelPwdInputJavaLangObjectNull = (loginViewModelPwdInput) != (null);
                if (loginViewModelPwdInputJavaLangObjectNull) {




                    loginViewModelPwdInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener rememberPasswordandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.rememberPassword.getValue()
            //         is loginViewModel.rememberPassword.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = rememberPassword.isChecked();
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.rememberPassword
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginViewModelRememberPassword = null;
            // loginViewModel.rememberPassword.getValue()
            java.lang.Boolean loginViewModelRememberPasswordGetValue = null;
            // loginViewModel.rememberPassword != null
            boolean loginViewModelRememberPasswordJavaLangObjectNull = false;
            // loginViewModel
            com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelRememberPassword = loginViewModel.getRememberPassword();

                loginViewModelRememberPasswordJavaLangObjectNull = (loginViewModelRememberPassword) != (null);
                if (loginViewModelRememberPasswordJavaLangObjectNull) {




                    loginViewModelRememberPassword.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.usnInput.getValue()
            //         is loginViewModel.usnInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // loginViewModel.usnInput.getValue()
            java.lang.String loginViewModelUsnInputGetValue = null;
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.usnInput != null
            boolean loginViewModelUsnInputJavaLangObjectNull = false;
            // loginViewModel.usnInput
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelUsnInput = null;
            // loginViewModel
            com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelUsnInput = loginViewModel.getUsnInput();

                loginViewModelUsnInputJavaLangObjectNull = (loginViewModelUsnInput) != (null);
                if (loginViewModelUsnInputJavaLangObjectNull) {




                    loginViewModelUsnInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.Button) bindings[3]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.CheckBox) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            );
        this.AutoLogin.setTag(null);
        this.login.setTag(null);
        this.loginPage.setTag(null);
        this.password.setTag(null);
        this.rememberPassword.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.delta.playandroid.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.delta.playandroid.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.delta.playandroid.viewmodel.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelPwdInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelRememberPassword((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeLoginViewModelAutoLogin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeLoginViewModelUsnInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelPwdInput(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPwdInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelRememberPassword(androidx.lifecycle.MutableLiveData<java.lang.Boolean> LoginViewModelRememberPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelAutoLogin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> LoginViewModelAutoLogin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelUsnInput(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelUsnInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPwdInput = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelAutoLoginGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelRememberPasswordGetValue = false;
        java.lang.Boolean loginViewModelAutoLoginGetValue = null;
        java.lang.String loginViewModelUsnInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginViewModelRememberPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginViewModelAutoLogin = null;
        java.lang.String loginViewModelPwdInputGetValue = null;
        java.lang.Boolean loginViewModelRememberPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelUsnInput = null;
        com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.pwdInput
                        loginViewModelPwdInput = loginViewModel.getPwdInput();
                    }
                    updateLiveDataRegistration(0, loginViewModelPwdInput);


                    if (loginViewModelPwdInput != null) {
                        // read loginViewModel.pwdInput.getValue()
                        loginViewModelPwdInputGetValue = loginViewModelPwdInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.rememberPassword
                        loginViewModelRememberPassword = loginViewModel.getRememberPassword();
                    }
                    updateLiveDataRegistration(1, loginViewModelRememberPassword);


                    if (loginViewModelRememberPassword != null) {
                        // read loginViewModel.rememberPassword.getValue()
                        loginViewModelRememberPasswordGetValue = loginViewModelRememberPassword.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.rememberPassword.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelRememberPasswordGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelRememberPasswordGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.autoLogin
                        loginViewModelAutoLogin = loginViewModel.getAutoLogin();
                    }
                    updateLiveDataRegistration(2, loginViewModelAutoLogin);


                    if (loginViewModelAutoLogin != null) {
                        // read loginViewModel.autoLogin.getValue()
                        loginViewModelAutoLoginGetValue = loginViewModelAutoLogin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.autoLogin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelAutoLoginGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelAutoLoginGetValue);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.usnInput
                        loginViewModelUsnInput = loginViewModel.getUsnInput();
                    }
                    updateLiveDataRegistration(3, loginViewModelUsnInput);


                    if (loginViewModelUsnInput != null) {
                        // read loginViewModel.usnInput.getValue()
                        loginViewModelUsnInputGetValue = loginViewModelUsnInput.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.AutoLogin, androidxDatabindingViewDataBindingSafeUnboxLoginViewModelAutoLoginGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.AutoLogin, (android.widget.CompoundButton.OnCheckedChangeListener)null, AutoLoginandroidCheckedAttrChanged);
            this.login.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.password, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.rememberPassword, (android.widget.CompoundButton.OnCheckedChangeListener)null, rememberPasswordandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, loginViewModelPwdInputGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rememberPassword, androidxDatabindingViewDataBindingSafeUnboxLoginViewModelRememberPasswordGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, loginViewModelUsnInputGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;
        // loginViewModel
        com.delta.playandroid.viewmodel.LoginViewModel loginViewModel = mLoginViewModel;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {


            loginViewModel.login();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.pwdInput
        flag 1 (0x2L): loginViewModel.rememberPassword
        flag 2 (0x3L): loginViewModel.autoLogin
        flag 3 (0x4L): loginViewModel.usnInput
        flag 4 (0x5L): loginViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}