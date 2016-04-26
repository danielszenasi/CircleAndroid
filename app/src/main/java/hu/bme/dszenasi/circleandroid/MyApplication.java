package hu.bme.dszenasi.circleandroid;

import android.app.Application;

import hu.bme.dszenasi.circleandroid.login.module.DaggerLoginComponent;
import hu.bme.dszenasi.circleandroid.login.module.LoginComponent;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class MyApplication extends Application {
    LoginComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerLoginComponent.builder().build();
    }

    public LoginComponent getComponent() {
        return component;
    }
}