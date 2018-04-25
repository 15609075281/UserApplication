package com.joker.user.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

/**
 * Created by Administrator on 2018/4/21 0021.
 * mark:joker
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(intiView());
        findView();
    }

    public abstract int intiView();

    public abstract void findView();



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.KEYCODE_BACK == keyCode) {
            onKeyDown();
            return false;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    public abstract void onKeyDown();
}
