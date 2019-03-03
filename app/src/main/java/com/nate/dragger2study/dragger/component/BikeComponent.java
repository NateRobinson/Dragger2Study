package com.nate.dragger2study.dragger.component;

import com.nate.dragger2study.dragger.module.BikeModule;
import com.nate.dragger2study.entity.Bike;
import dagger.Component;

/**
 * Created by Nate Gu on 2019/2/28
 */
@Component(modules = {BikeModule.class})
public interface BikeComponent {
  void inject(Bike bike);
}
