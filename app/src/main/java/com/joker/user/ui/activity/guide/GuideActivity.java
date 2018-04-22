package com.joker.user.ui.activity.guide;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.joker.user.R;
import com.joker.user.adapter.guide.GuiDeAdapter;
import com.joker.user.ui.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/22 0022.
 */
public class GuideActivity extends BaseActivity {
    List<View> views = null;
    ViewPager viewPager;

    @Override
    public int intiView() {
        return R.layout.guide_xml;
    }

    @Override
    public void findView() {
        viewPager = (ViewPager) findViewById(R.id.guide);
        data();
        GuiDeAdapter guiDeAdapter = new GuiDeAdapter(views);
        viewPager.setAdapter(guiDeAdapter);
    }

    public void data() {
        views = new ArrayList<>();
        View view = LayoutInflater.from(GuideActivity.this).inflate(R.layout.guide1_xml, null);
        View view1 = LayoutInflater.from(GuideActivity.this).inflate(R.layout.guide2_xml, null);
        View view2 = LayoutInflater.from(GuideActivity.this).inflate(R.layout.guide3_xml, null);
        ImageView imageView1= (ImageView) view2.findViewById(R.id.guide_login);
        ImageView imageView2= (ImageView) view2.findViewById(R.id.guide_signup);
        imageView1.setOnClickListener(listener);
        imageView2.setOnClickListener(listener);
        views.add(view);
        views.add(view1);
        views.add(view2);
    }
android.view.View.OnClickListener listener =new android.view.View.OnClickListener(){

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.guide_login:
                Toast.makeText(GuideActivity.this,"LOGIN",Toast.LENGTH_LONG).show();
                break;
            case R.id.guide_signup:
                Toast.makeText(GuideActivity.this,"SIGN UP",Toast.LENGTH_LONG).show();

                break;

            default:
        }
    }
};

}
