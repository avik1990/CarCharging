package com.app.carcharging.common;

import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Created by user2 on 16-05-2018.
 */

public class BindingAdapterTag {
  @BindingAdapter("specialTag")
  public static void setSpecialTag(View view, Object value) {
    view.setTag(value);
  }
}
