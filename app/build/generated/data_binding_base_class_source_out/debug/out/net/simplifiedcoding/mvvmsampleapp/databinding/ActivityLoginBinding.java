// Generated by data binding compiler. Do not edit!
package net.simplifiedcoding.mvvmsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import net.simplifiedcoding.mvvmsampleapp.R;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonSignIn;

  @NonNull
  public final EditText editTextEmail;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final ImageView imageViewLogo;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final CoordinatorLayout rootLayout;

  @NonNull
  public final TextView textViewForgetPassword;

  @NonNull
  public final TextView textViewSignUp;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonSignIn, EditText editTextEmail, EditText editTextPassword,
      ImageView imageViewLogo, LinearLayout linearLayout1, LinearLayout linearLayout2,
      ProgressBar progressBar, CoordinatorLayout rootLayout, TextView textViewForgetPassword,
      TextView textViewSignUp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonSignIn = buttonSignIn;
    this.editTextEmail = editTextEmail;
    this.editTextPassword = editTextPassword;
    this.imageViewLogo = imageViewLogo;
    this.linearLayout1 = linearLayout1;
    this.linearLayout2 = linearLayout2;
    this.progressBar = progressBar;
    this.rootLayout = rootLayout;
    this.textViewForgetPassword = textViewForgetPassword;
    this.textViewSignUp = textViewSignUp;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
