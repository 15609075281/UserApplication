package com.joker.user.ui.activity.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.joker.user.MainActivity;
import com.joker.user.R;
import com.joker.user.ui.activity.BaseActivity;
import com.joker.user.ui.activity.login.LoginActivity;
import com.joker.user.ui.activity.register.RegisterActivity;

/**
 * Created by Administrator on 2018/4/23.
 */
public class GuiDeOneActivity extends BaseActivity {

    private static final String TAG = "GuiDeOneActivity";

    private Activity activity;
    private Context context;

    private ImageView guide_one_login;
    private ImageView guide_one_signup;
    private TextView guide_one_skip;

    @Override
    public int intiView() {
        return R.layout.guideone_xml;
    }

    @Override
    public void findView() {
        activity = GuiDeOneActivity.this;
        context = getApplicationContext();

        guide_one_login = (ImageView) findViewById(R.id.guide_one_login);
        guide_one_signup = (ImageView) findViewById(R.id.guide_one_signup);
        guide_one_skip = (TextView) findViewById(R.id.guide_one_skip);

        guide_one_login.setOnClickListener(listener);
        guide_one_signup.setOnClickListener(listener);
        guide_one_skip.setOnClickListener(listener);
    }

    @Override
    public void onKeyDown() {

    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.guide_one_login:
                    intent(activity, LoginActivity.class);
                    break;
                case R.id.guide_one_signup:
                    intent(activity, RegisterActivity.class);
                    break;

                case R.id.guide_one_skip:
                    intent(activity, MainActivity.class);
                    break;

                default:
            }
        }
    };

    private void intent(Activity activity, Class cl) {
        startActivity(new Intent(activity, cl));
    }
}
