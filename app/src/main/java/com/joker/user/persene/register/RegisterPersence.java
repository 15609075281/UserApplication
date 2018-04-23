package com.joker.user.persene.register;

import com.joker.user.R;
import com.joker.user.view.register.RegisterView;

/**
 * Created by Administrator on 2018/4/23.
 */
public class RegisterPersence {

    private RegisterView registerView;

    public RegisterPersence(RegisterView registerView) {
        this.registerView = registerView;
    }


    public void setImage() {
        registerView.setRegister(R.mipmap.register_false);
    }

    public void onRegister() {
        registerView.onSuccess("注册成功");
    }
}
