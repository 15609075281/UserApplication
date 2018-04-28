package com.joker.user.ui.fragment.one;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.joker.user.MainActivity;
import com.joker.user.R;
import com.joker.user.adapter.OneFragmentAdapter;
import com.joker.user.ui.activity.onemenu.OneMenuActivity;
import com.joker.user.ui.bean.OneInfo;
import com.joker.user.ui.bean.child.OneImageInfo;
import com.joker.user.ui.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/23.
 */
public class OneFragment extends Fragment {

    private View view = null;

    private RecyclerView one_rl;
    private LinearLayoutManager mLayoutManager;
    private OneFragmentAdapter adapter;
    private List<OneInfo> list;

    private LinearLayout one_menuone;
    private LinearLayout one_menutwo;
    private LinearLayout one_menuthere;
    private LinearLayout one_menufour;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.onefragment_xml, container, false);
        }
        findView();
        return view;
    }

    public void findView() {

        one_menuone = (LinearLayout) view.findViewById(R.id.one_menuone);
        one_menutwo = (LinearLayout) view.findViewById(R.id.one_menutwo);
        one_menuthere = (LinearLayout) view.findViewById(R.id.one_menuthere);
        one_menufour = (LinearLayout) view.findViewById(R.id.one_menufour);


        one_rl = (RecyclerView) view.findViewById(R.id.one_rl);
        //创建默认的线性LayoutManager
        mLayoutManager = new LinearLayoutManager(getActivity());
        one_rl.setLayoutManager(mLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        one_rl.setHasFixedSize(true);
        //创建并设置Adapter
        data();
        adapter = new OneFragmentAdapter(list);
        one_rl.setAdapter(adapter);

        one_menuone.setOnClickListener(listener);
        one_menutwo.setOnClickListener(listener);
        one_menuthere.setOnClickListener(listener);
        one_menufour.setOnClickListener(listener);
    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.one_menuone:
                    intent("");
                    break;
                case R.id.one_menutwo:
                    intent("");
                    break;
                case R.id.one_menuthere:
                    intent("");
                    break;
                case R.id.one_menufour:
                    intent("");
                    break;
                default:
            }
        }
    };

    private void intent(String key) {
        startActivity(new Intent(getActivity(), OneMenuActivity.class));
    }

    public void data() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            OneInfo oneInfo = new OneInfo();
            oneInfo.setTitle_name("我是" + i);
            List<OneImageInfo> oneImageInfo = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                OneImageInfo oneImageInfo1 = new OneImageInfo();
                oneImageInfo1.setImage("https://www.baidu.com/img/bd_logo1.png?where=super");
                oneImageInfo.add(oneImageInfo1);
            }
            oneInfo.setList(oneImageInfo);
            list.add(oneInfo);
        }
    }
}
