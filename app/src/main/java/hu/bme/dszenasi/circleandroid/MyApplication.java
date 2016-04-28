package hu.bme.dszenasi.circleandroid;

import android.app.Application;

import hu.bme.dszenasi.circleandroid.login.module.DaggerLoginComponent;
import hu.bme.dszenasi.circleandroid.login.module.LoginComponent;
import hu.bme.dszenasi.circleandroid.vmlist.module.DaggerVmListComponent;
import hu.bme.dszenasi.circleandroid.vmlist.module.VmListComponent;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class MyApplication extends Application {
    LoginComponent logincomponent;
    VmListComponent vmListComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        logincomponent = DaggerLoginComponent.builder().build();
        vmListComponent= DaggerVmListComponent.builder().build();
    }

    public LoginComponent getloginComponent() {
        return logincomponent;
    }
    public VmListComponent getVmListComponent() {
        return vmListComponent;
    }
}