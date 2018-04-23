package com.joker.user.ui.activity.register;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.joker.user.R;
import com.joker.user.persene.register.RegisterPersence;
import com.joker.user.ui.activity.BaseActivity;
import com.joker.user.ui.activity.guide.GuiDeOneActivity;
import com.joker.user.ui.activity.login.LoginActivity;
import com.joker.user.view.register.RegisterView;

/**
 * Created by Administrator on 2018/4/21 0021.
 * mark:joker
 */
public class RegisterActivity extends BaseActivity implements RegisterView {

    private static final String TAG = "RegisterActivity";

    private Context context;
    private RegisterPersence registerPersence;

    private TextView title_register;

    private EditText register_first;
    private EditText register_last;
    private EditText register_mail;
    private EditText register_password;
    private EditText register_country;
    private ImageView register_d;

    @Override
    public int intiView() {
        return R.layout.registeractivity_xml;

    }

    @Override
    public void findView() {
        context = getApplicationContext();

        registerPersence = new RegisterPersence(this);
        title_register = (TextView) findViewById(R.id.title_bar);
        title_register.setText("SIGN UP");

        register_first = (EditText) findViewById(R.id.register_first);
        register_last = (EditText) findViewById(R.id.register_last);
        register_mail = (EditText) findViewById(R.id.register_mail);
        register_password = (EditText) findViewById(R.id.register_password);
        register_country = (EditText) findViewById(R.id.register_country);
        register_d = (ImageView) findViewById(R.id.register_d);

        title_register.setOnClickListener(listener);
        register_d.setOnClickListener(listener);
    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.back:
                    intent();
                    break;
                case R.id.register_d:
                    registerPersence.setImage();
                    registerPersence.onRegister();
                    break;

                default:
            }
        }
    };

    @Override
    public void onKeyDown() {
        intent();
    }

    public void intent() {
        startActivity(new Intent(RegisterActivity.this, GuiDeOneActivity.class));
        finish();
    }

    @Override
    public void setTitle(String title) {
        title_register.setText(title);
    }

    @Override
    public String getFirstName() {
        return register_first.getText().toString();
    }

    @Override
    public String getLastName() {
        return register_last.getText().toString();
    }

    @Override
    public String getEmail() {
        return register_mail.getText().toString();
    }

    @Override
    public String getPassWord() {
        return register_password.getText().toString();
    }

    @Override
    public String getCountry() {
        return register_country.getText().toString();
    }

    @Override
    public void setRegister(int id) {
        register_d.setImageResource(id);
    }

    @Override
    public void onSuccess(String result) {
        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        finish();
    }

    @Override
    public void onError(String error) {

    }
}
