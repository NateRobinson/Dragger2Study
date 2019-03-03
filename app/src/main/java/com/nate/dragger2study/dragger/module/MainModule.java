package com.nate.dragger2study.dragger.module;

import android.arch.lifecycle.LifecycleOwner;
import com.nate.dragger2study.dragger.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Nate Gu on 2019/2/28
 */
@Module
public class MainModule {

	private LifecycleOwner mLifecycleOwner;

	public MainModule(LifecycleOwner lifecycleOwner) {
		this.mLifecycleOwner = lifecycleOwner;
	}

	@Provides
	@ActivityScope
	LifecycleOwner provideLifecycleOwner() {
		return mLifecycleOwner;
	}
}
