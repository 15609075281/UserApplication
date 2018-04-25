package com.joker.user.ui.activity.login;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.joker.user.MainActivity;
import com.joker.user.R;
import com.joker.user.persene.login.LoginPersene;
import com.joker.user.ui.activity.BaseActivity;
import com.joker.user.ui.activity.forgotpassword.ForGotPWActivity;
import com.joker.user.ui.activity.guide.GuiDeOneActivity;
import com.joker.user.view.login.LoginView;

/**
 * Created by Administrator on 2018/4/21 0021.
 * mark:joker
 */
public class LoginActivity extends BaseActivity implements LoginView {

    private static final String TAG = "LoginActivity";


    private Context context;

    private LoginPersene loginPersene;

    private TextView title_bar;
    private ImageView back;

    private EditText login_username;
    private EditText login_password;
    private ImageView login_fp;
    private ImageView login_f;
    private ImageView login_g;

    private ImageView login_continue;

    @Override
    public int intiView() {
        return R.layout.loginactivity;
    }

    @Override
    public void findView() {
        context = this;
        loginPersene = new LoginPersene(LoginActivity.this);

        title_bar = (TextView) findViewById(R.id.title_bar);
        title_bar.setText("LOG IN");
        back = (ImageView) findViewById(R.id.back);

        login_username = (EditText) findViewById(R.id.login_username);
        login_password = (EditText) findViewById(R.id.login_password);
        login_fp = (ImageView) findViewById(R.id.login_fp);
        login_f = (ImageView) findViewById(R.id.login_f);
        login_g = (ImageView) findViewById(R.id.login_g);
        login_continue = (ImageView) findViewById(R.id.login_continue);

        back.setOnClickListener(listener);
        login_fp.setOnClickListener(listener);
        login_continue.setOnClickListener(listener);
    }

    @Override
    public void onKeyDown() {

    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.back:
                    Toast.makeText(context, "返回", Toast.LENGTH_LONG).show();
                    loginPersene.setImage();
                    startActivity(new Intent(LoginActivity.this, GuiDeOneActivity.class));
                    finish();
                    break;
                case R.id.login_fp:
                    startActivity(new Intent(LoginActivity.this, ForGotPWActivity.class));
                    break;

                case R.id.login_continue:
                    loginPersene.setImage();
                    break;

                default:
            }
        }
    };

    @Override
    public String getUserName() {
        return login_username.getText().toString();
    }

    @Override
    public String getPassword() {
        return login_password.getText().toString();
    }

    @Override
    public void setLogin_fp(int id) {
        login_fp.setImageResource(id);

    }

    @Override
    public void setLogin_f(int id) {
        login_f.setImageResource(id);

    }

    @Override
    public void setLogin_g(int id) {
        login_g.setImageResource(id);
    }

    @Override
    public void setLoginContinue(int id) {
        login_continue.setImageResource(id);
    }

    @Override
    public void onSuccess(String result) {
        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
        startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    public void onError(String error) {

    }
}
