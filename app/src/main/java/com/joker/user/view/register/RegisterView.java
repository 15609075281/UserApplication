package com.joker.user.view.register;

/**
 * Created by Administrator on 2018/4/23.
 */
public interface RegisterView {


    public abstract void setTitle(String title);

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getEmail();

    public abstract String getPassWord();

    public abstract String getCountry();


    public abstract void setRegister(int id);

    public abstract void onSuccess(String result);

    public abstract void onError(String error);

}
