package com.joker.user.persene.login;

import com.joker.user.R;
import com.joker.user.view.login.LoginView;

/**
 * Created by Administrator on 2018/4/23.
 */
public class LoginPersene {

    private LoginView loginView;

    public LoginPersene(LoginView loginView) {
        this.loginView = loginView;
    }

    public void setImage() {
        loginView.setLogin_fp(R.mipmap.login_fp);
        loginView.setLogin_f(R.mipmap.login_f);
        loginView.setLogin_g(R.mipmap.login_g);
        loginView.setLoginContinue(R.mipmap.login_continue_false);
        loginView.onSuccess("登录成功");
    }

}
