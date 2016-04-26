package hu.bme.dszenasi.circleandroid.login.ui;

/**
 * Created by mszenasi on 2016-04-26.
 */
public interface LoginPresenter {
    void login(String user,String pass);
    void attachView(LoginView loginView);
    void detachView();
}
