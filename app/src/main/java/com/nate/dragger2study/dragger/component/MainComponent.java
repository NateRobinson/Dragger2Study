package com.nate.dragger2study.dragger.component;

import com.nate.dragger2study.MainActivity;
import com.nate.dragger2study.dragger.ActivityScope;
import com.nate.dragger2study.dragger.module.MainModule;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Nate Gu on 2019/2/28
 */
@ActivityScope
@Subcomponent(modules = {MainModule.class })
public interface MainComponent {
	void inject(MainActivity mainActivity);
}
