package com.nate.dragger2study.dragger.module;

import android.app.Application;
import com.nate.dragger2study.lib.Gson;
import com.nate.dragger2study.lib.OkClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Nate Gu on 2019/2/28
 */
@Module
public class AppModule {

	public Application mApplication;

	public AppModule(Application application) {
		this.mApplication = application;
	}

	@Singleton
	@Provides Gson provideGson() {
		return new Gson();
	}

	@Singleton
	@Provides OkClient provideOkClient() {
		return new OkClient();
	}

	@Singleton
	@Provides Application provideApplication() {
		return mApplication;
	}
}
