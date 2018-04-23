package com.joker.user.view.login;

/**
 * Created by Administrator on 2018/4/23.
 */
public interface LoginView {

    public abstract String getUserName();

    public abstract String getPassword();

    public abstract void setLogin_fp(int id);

    public abstract void setLogin_f(int id);

    public abstract void setLogin_g(int id);

    public abstract void setLoginContinue(int id);


    public abstract void onSuccess(String result);

    public abstract void onError(String error);

}
