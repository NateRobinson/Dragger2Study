package com.nate.dragger2study.entity;

import android.util.Log;
import com.nate.dragger2study.dragger.LightColorQualifier;
import com.nate.dragger2study.dragger.component.DaggerBikeComponent;
import com.nate.dragger2study.dragger.component.MainComponent;
import com.nate.dragger2study.dragger.module.BikeModule;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Nate Gu on 2019/2/28
 */
public class Bike {

  @Inject
  Wheel mWheel;

  @LightColorQualifier("red")
  @Inject
  Light mLight;

  //@Inject
  //public void setWheel(Wheel wheel){
  //  this.mWheel = wheel;
  //}

  public Bike() {
    Log.e("Bike", "我是自行车");
    DaggerBikeComponent.builder().bikeModule(new BikeModule()).build().inject(this);
  }
}
