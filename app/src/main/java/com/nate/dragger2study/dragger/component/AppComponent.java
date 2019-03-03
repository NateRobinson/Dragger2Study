package com.nate.dragger2study.dragger.component;

import com.nate.dragger2study.dragger.module.AppModule;
import com.nate.dragger2study.dragger.module.MainModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Nate Gu on 2019/2/28
 */
@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {
  MainComponent plus(MainModule mainModule);
}
