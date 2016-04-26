package hu.bme.dszenasi.circleandroid.login.module;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.dszenasi.circleandroid.login.ui.LoginActivity;
import hu.bme.dszenasi.circleandroid.login.ui.LoginPresenter;

/**
 * Created by mszenasi on 2016-04-26.
 */
@Singleton
@Component(modules = {LoginModule.class})
public interface LoginComponent {
    void inject(LoginActivity baseActivity);
}
