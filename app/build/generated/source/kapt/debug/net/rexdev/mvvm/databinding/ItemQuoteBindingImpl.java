package net.rexdev.mvvm.databinding;
import net.rexdev.mvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemQuoteBindingImpl extends ItemQuoteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemQuoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemQuoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.author.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.quote.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.quote == variableId) {
            setQuote((net.rexdev.mvvm.data.db.entities.Quote) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuote(@Nullable net.rexdev.mvvm.data.db.entities.Quote Quote) {
        this.mQuote = Quote;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.quote);
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
        net.rexdev.mvvm.data.db.entities.Quote Quote1 = mQuote;
        java.lang.String javaLangStringQuoteQuote = null;
        java.lang.String javaLangStringQuoteAuthor = null;
        java.lang.String quoteAuthor = null;
        java.lang.String javaLangStringQuoteQuoteJavaLangString = null;
        java.lang.String quoteQuote = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (Quote1 != null) {
                    // read quote.author
                    quoteAuthor = Quote1.getAuthor();
                    // read quote.quote
                    quoteQuote = Quote1.getQuote();
                }


                // read ("-") + (quote.author)
                javaLangStringQuoteAuthor = ("-") + (quoteAuthor);
                // read ("'") + (quote.quote)
                javaLangStringQuoteQuote = ("'") + (quoteQuote);


                // read (("'") + (quote.quote)) + ("'")
                javaLangStringQuoteQuoteJavaLangString = (javaLangStringQuoteQuote) + ("'");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.author, javaLangStringQuoteAuthor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quote, javaLangStringQuoteQuoteJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quote
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}