// Generated code from Butter Knife. Do not modify!
package com.tophawks.vm.visualmerchandising.Modules.Attendance;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tophawks.vm.visualmerchandising.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AttendanceHomeActivity_ViewBinding implements Unbinder {
  private AttendanceHomeActivity target;

  @UiThread
  public AttendanceHomeActivity_ViewBinding(AttendanceHomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AttendanceHomeActivity_ViewBinding(AttendanceHomeActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabs, "field 'tabLayout'", TabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AttendanceHomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.tabLayout = null;
    target.viewPager = null;
  }
}
