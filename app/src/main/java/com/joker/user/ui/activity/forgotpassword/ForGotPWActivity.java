package com.joker.user.ui.activity.forgotpassword;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.joker.user.R;
import com.joker.user.ui.activity.BaseActivity;

/**
 * Created by Administrator on 2018/4/25.
 */
public class ForGotPWActivity extends BaseActivity {

    private TextView title_bar;
    private ImageView back;

    @Override
    public int intiView() {
        return R.layout.forgotpassword_xml;
    }

    @Override
    public void findView() {
        title_bar = (TextView) findViewById(R.id.title_bar);
        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(listener);
    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.back:
                    finish();
                    break;
                default:
            }
        }
    };

    @Override
    public void onKeyDown() {

    }
}
