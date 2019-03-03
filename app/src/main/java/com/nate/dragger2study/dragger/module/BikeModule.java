package com.nate.dragger2study.dragger.module;

import com.nate.dragger2study.dragger.LightColorQualifier;
import com.nate.dragger2study.entity.Light;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Nate Gu on 2019/2/28
 */
@Module
public class BikeModule {

  @LightColorQualifier()
  @Provides
  Light provideLight() {
    return new Light();
  }

  @LightColorQualifier("red")
  @Provides
  Light provideRedLight() {
    return new Light("red");
  }
}
