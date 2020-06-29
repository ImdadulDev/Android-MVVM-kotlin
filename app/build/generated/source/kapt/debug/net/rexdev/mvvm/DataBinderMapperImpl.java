package net.rexdev.mvvm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.rexdev.mvvm.databinding.ActivityLoginBindingImpl;
import net.rexdev.mvvm.databinding.ActivitySignupBindingImpl;
import net.rexdev.mvvm.databinding.ItemQuoteBindingImpl;
import net.rexdev.mvvm.databinding.ProfileFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYSIGNUP = 2;

  private static final int LAYOUT_ITEMQUOTE = 3;

  private static final int LAYOUT_PROFILEFRAGMENT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.rexdev.mvvm.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.rexdev.mvvm.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.rexdev.mvvm.R.layout.item_quote, LAYOUT_ITEMQUOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(net.rexdev.mvvm.R.layout.profile_fragment, LAYOUT_PROFILEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_signup_0".equals(tag)) {
            return new ActivitySignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMQUOTE: {
          if ("layout/item_quote_0".equals(tag)) {
            return new ItemQuoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_quote is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEFRAGMENT: {
          if ("layout/profile_fragment_0".equals(tag)) {
            return new ProfileFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "quote");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_login_0", net.rexdev.mvvm.R.layout.activity_login);
      sKeys.put("layout/activity_signup_0", net.rexdev.mvvm.R.layout.activity_signup);
      sKeys.put("layout/item_quote_0", net.rexdev.mvvm.R.layout.item_quote);
      sKeys.put("layout/profile_fragment_0", net.rexdev.mvvm.R.layout.profile_fragment);
    }
  }
}
