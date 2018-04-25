package com.joker.user;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.view.View;
import android.widget.ImageView;
import com.joker.user.adapter.main.MainAdapter;
import com.joker.user.ui.activity.BaseActivity;

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

        //初始显示
        setImage();
        two.setImageResource(R.mipmap.two);
        data();
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager(), list);
        main_viewpager.setAdapter(mainAdapter);
        //初始加载页
        main_viewpager.setCurrentItem(1);

        one.setOnClickListener(listeren);
        two.setOnClickListener(listeren);
        there.setOnClickListener(listeren);
        four.setOnClickListener(listeren);

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
        TwoFragment twoFragment = new TwoFragment();
        OneFragment oneFragment = new OneFragment();
        ThereFragment thereFragment = new ThereFragment();
        FourFragment fourFragment = new FourFragment();

        list.add(twoFragment);
        list.add(oneFragment);
        list.add(thereFragment);
        list.add(fourFragment);

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

                default:

            }
        }
    };

    public void setImage() {
        one.setImageResource(R.mipmap.one_true);
        two.setImageResource(R.mipmap.two_true);
        there.setImageResource(R.mipmap.there_true);
        four.setImageResource(R.mipmap.four_true);

    }

    @Override
    public void onKeyDown() {

    }


}
