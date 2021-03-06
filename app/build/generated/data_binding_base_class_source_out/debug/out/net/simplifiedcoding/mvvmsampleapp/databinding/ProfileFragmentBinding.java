// Generated by data binding compiler. Do not edit!
package net.simplifiedcoding.mvvmsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import net.simplifiedcoding.mvvmsampleapp.R;
import net.simplifiedcoding.mvvmsampleapp.ui.home.profile.ProfileViewModel;

public abstract class ProfileFragmentBinding extends ViewDataBinding {
  @Bindable
  protected ProfileViewModel mViewmodel;

  protected ProfileFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewmodel(@Nullable ProfileViewModel viewmodel);

  @Nullable
  public ProfileViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ProfileFragmentBinding>inflateInternal(inflater, R.layout.profile_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ProfileFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ProfileFragmentBinding>inflateInternal(inflater, R.layout.profile_fragment, null, false, component);
  }

  public static ProfileFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ProfileFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ProfileFragmentBinding)bind(component, view, R.layout.profile_fragment);
  }
}
