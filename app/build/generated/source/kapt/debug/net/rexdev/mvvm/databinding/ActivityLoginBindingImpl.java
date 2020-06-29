package net.rexdev.mvvm.databinding;
import net.rexdev.mvvm.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_view_logo, 1);
        sViewsWithIds.put(R.id.linearLayout1, 2);
        sViewsWithIds.put(R.id.linearLayout2, 3);
        sViewsWithIds.put(R.id.edit_text_email, 4);
        sViewsWithIds.put(R.id.edit_text_password, 5);
        sViewsWithIds.put(R.id.text_view_forget_password, 6);
        sViewsWithIds.put(R.id.button_sign_in, 7);
        sViewsWithIds.put(R.id.text_view_sign_up, 8);
        sViewsWithIds.put(R.id.progress_bar, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            );
        this.rootLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}