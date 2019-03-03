package com.nate.dragger2study;

import android.app.Application;
import com.nate.dragger2study.dragger.component.AppComponent;
import com.nate.dragger2study.dragger.component.DaggerAppComponent;
import com.nate.dragger2study.dragger.module.AppModule;

/**
 * Created by Nate Gu on 2019/2/28
 */
public class DemoApp extends Application {

	private AppComponent appComponent;
	private static DemoApp mDemoApp;

	@Override public void onCreate() {
		super.onCreate();
		mDemoApp = this;
		appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
	}

	public static DemoApp getInstance() {
		return mDemoApp;
	}

	public AppComponent getAppComponent() {
		return appComponent;
	}
}
