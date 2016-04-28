package hu.bme.dszenasi.circleandroid.login.ui;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;
import hu.bme.dszenasi.circleandroid.login.repository.ILoginRepository;
import hu.bme.dszenasi.circleandroid.login.repository.LoginRepository;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class LoginPresenterImpl implements LoginPresenter {
    ILoginRepository loginRepository;
    LoginView loginView;

    public LoginPresenterImpl(ILoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void login(String user, String pass) {
        try {
            loginRepository.isConnect();
            loginView.onLoginSucces();
        } catch (CommunicationException e) {
            e.printStackTrace();
        }
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
