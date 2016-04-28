package hu.bme.dszenasi.circleandroid.vmlist.module;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.dszenasi.circleandroid.login.module.LoginModule;
import hu.bme.dszenasi.circleandroid.login.ui.LoginActivity;
import hu.bme.dszenasi.circleandroid.vmlist.ui.VmListActivity;

/**
 * Created by mszenasi on 2016-04-28.
 */
@Singleton
@Component(modules = {VmListModule.class})
public interface VmListComponent {
    void inject(VmListActivity baseActivity);
}