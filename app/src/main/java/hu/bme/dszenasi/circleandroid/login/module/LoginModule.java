package hu.bme.dszenasi.circleandroid.login.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.dszenasi.circleandroid.login.repository.LoginRepository;
import hu.bme.dszenasi.circleandroid.login.ui.LoginPresenter;
import hu.bme.dszenasi.circleandroid.login.ui.LoginPresenterImpl;

/**
 * Created by mszenasi on 2016-04-26.
 */
@Module
public class LoginModule {

    @Provides
    public LoginRepository providesLoginRepository() {
        return new LoginRepository();
    }
    @Provides
    public LoginPresenter providesLoginPresenter(LoginRepository loginRepository) {
        return new LoginPresenterImpl(loginRepository);
    }

}
