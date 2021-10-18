package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLayoutBindingImpl extends ItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivImage, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.cardView.setTag(null);
        this.tvCountryName.setTag(null);
        this.tvbDate.setTag(null);
        this.tvdDate.setTag(null);
        this.tvid.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.country == variableId) {
            setCountry((com.example.myapplication.Api.ResponseDTOItem) variable);
        }
        else if (BR.responseItem == variableId) {
            setResponseItem((com.example.myapplication.Api.ResponseDTOItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCountry(@Nullable com.example.myapplication.Api.ResponseDTOItem Country) {
        this.mCountry = Country;
    }
    public void setResponseItem(@Nullable com.example.myapplication.Api.ResponseDTOItem ResponseItem) {
        this.mResponseItem = ResponseItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.responseItem);
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
        java.lang.String responseItemCountryName = null;
        com.example.myapplication.Api.ResponseDTOItem responseItem = mResponseItem;
        java.lang.String responseItemBirthday = null;
        com.example.myapplication.Api.Country responseItemCountry = null;
        java.lang.String responseItemDeathday = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (responseItem != null) {
                    // read responseItem.birthday
                    responseItemBirthday = responseItem.getBirthday();
                    // read responseItem.country
                    responseItemCountry = responseItem.getCountry();
                    // read responseItem.deathday
                    responseItemDeathday = responseItem.getDeathday();
                }


                if (responseItemCountry != null) {
                    // read responseItem.country.name
                    responseItemCountryName = responseItemCountry.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCountryName, responseItemCountryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvbDate, responseItemBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvdDate, responseItemDeathday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvid, responseItemDeathday);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): country
        flag 1 (0x2L): responseItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}