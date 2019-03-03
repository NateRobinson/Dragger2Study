package com.nate.dragger2study.entity;

import android.util.Log;

/**
 * Created by Nate Gu on 2019/2/28
 */
public class Light {

  private String color = "white";

  public Light() {
    Log.e("Light", "我是车灯, 并且颜色是：" + this.color);
  }

  public Light(String color) {
    this.color = color;
    Log.e("Light", "我是车灯, 并且颜色是：" + this.color);
  }
}
