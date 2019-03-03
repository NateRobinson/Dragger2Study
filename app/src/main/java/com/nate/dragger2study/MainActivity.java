package com.nate.dragger2study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.nate.dragger2study.dragger.module.MainModule;
import com.nate.dragger2study.lib.Gson;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject Gson mGson;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DemoApp.getInstance().getAppComponent().plus(new MainModule(this)).inject(this);

    //DaggerMainComponent.builder()
    //    .appComponent(DemoApp.getInstance().getAppComponent())
    //    .mainModule(new MainModule(this))
    //    .build()
    //    .inject(this);

    Log.e("MainActivity", mGson.toString());

    //new Bike();
  }
}
