package hu.bme.dszenasi.circleandroid.login.ui;

import hu.bme.dszenasi.circleandroid.login.repository.LoginRepository;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class LoginPresenterImpl implements LoginPresenter {
    LoginRepository loginRepository;
    LoginView loginView;

    public LoginPresenterImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void login(String user, String pass) {
        loginView.onLoginSucces();
    }

    @Override
    public void attachView(LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void detachView() {
        loginView=null;
    }
}
