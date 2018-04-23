package com.joker.user;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.joker.user.adapter.main.MainAdapter;
import com.joker.user.ui.activity.BaseActivity;
import com.joker.user.ui.fragment.five.FiveFragment;
import com.joker.user.ui.fragment.four.FourFragment;
import com.joker.user.ui.fragment.one.OneFragment;
import com.joker.user.ui.fragment.there.ThereFragment;
import com.joker.user.ui.fragment.two.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private List<Fragment> list = null;

    private ViewPager main_viewpager;

    private ImageView one;
    private ImageView two;
    private ImageView there;
    private ImageView four;
    private ImageView five;


    @Override
    public int intiView() {
        return R.layout.activity_main;
    }

    @Override
    public void findView() {

        main_viewpager = (ViewPager) findViewById(R.id.main_viewpager);
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        there = (ImageView) findViewById(R.id.there);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        //初始显示
        setImage();
        one.setImageResource(R.mipmap.one);
        data();
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager(), list);
        main_viewpager.setAdapter(mainAdapter);
        //初始加载页
        main_viewpager.setCurrentItem(0);

        one.setOnClickListener(listeren);
        two.setOnClickListener(listeren);
        there.setOnClickListener(listeren);
        four.setOnClickListener(listeren);
        five.setOnClickListener(listeren);
        main_viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setImage();
                switch (position) {
                    case 0:
                        one.setImageResource(R.mipmap.one);
                        break;
                    case 1:
                        two.setImageResource(R.mipmap.two);
                        break;
                    case 2:
                        there.setImageResource(R.mipmap.there);
                        break;
                    case 3:
                        four.setImageResource(R.mipmap.four);
                        break;
                    case 4:
                        five.setImageResource(R.mipmap.five);
                        break;
                    default:
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    public void data() {
        list = new ArrayList<>();
        OneFragment oneFragment = new OneFragment();
        TwoFragment twoFragment = new TwoFragment();
        ThereFragment thereFragment = new ThereFragment();
        FourFragment fourFragment = new FourFragment();
        FiveFragment fiveFragment = new FiveFragment();
        list.add(oneFragment);
        list.add(twoFragment);
        list.add(thereFragment);
        list.add(fourFragment);
        list.add(fiveFragment);
    }


    android.view.View.OnClickListener listeren = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setImage();
            switch (view.getId()) {
                case R.id.one:
                    one.setImageResource(R.mipmap.one);
                    main_viewpager.setCurrentItem(0);
                    break;
                case R.id.two:
                    two.setImageResource(R.mipmap.two);
                    main_viewpager.setCurrentItem(1);
                    break;
                case R.id.there:
                    there.setImageResource(R.mipmap.there);
                    main_viewpager.setCurrentItem(2);
                    break;
                case R.id.four:
                    four.setImageResource(R.mipmap.four);
                    main_viewpager.setCurrentItem(3);
                    break;
                case R.id.five:
                    five.setImageResource(R.mipmap.five);
                    main_viewpager.setCurrentItem(4);
                    break;
                default:

            }
        }
    };

    public void setImage() {
        one.setImageResource(R.mipmap.one_true);
        two.setImageResource(R.mipmap.two_true);
        there.setImageResource(R.mipmap.there_true);
        four.setImageResource(R.mipmap.four_true);
        five.setImageResource(R.mipmap.five_true);
    }

    @Override
    public void onKeyDown() {

    }


}
