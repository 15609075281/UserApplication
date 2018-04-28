package com.joker.user.ui.activity.onemenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.joker.user.R;
import com.joker.user.ui.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/26.
 */
public class OneMenuActivity extends BaseActivity {

    private TextView title_bar;
    private ImageView back;

    private ListView onemenu_list;
    private ListView onemenu_list1;

    private List<String> list = null;
    private List<String> list1 = null;

    @Override
    public int intiView() {
        return R.layout.onemenuactivity_xml;
    }

    @Override
    public void findView() {
        title_bar = (TextView) findViewById(R.id.title_bar);
        title_bar.setText("explore");
        back = (ImageView) findViewById(R.id.back);
        onemenu_list = (ListView) findViewById(R.id.onemenu_list);
        onemenu_list1 = (ListView) findViewById(R.id.onemenu_list1);

        date();
        date1();
        ListAdapter1 listAdapter = new ListAdapter1(OneMenuActivity.this,list);
        ListAdapter1 listAdapter1 = new ListAdapter1(OneMenuActivity.this,list1);
        onemenu_list.setAdapter(listAdapter);
//        onemenu_list1.setAdapter(listAdapter1);


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

    private void date() {
        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("number" + i);
        }
    }

    private void date1() {
        list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("phone" + i);
        }
    }


    public class ListAdapter1 extends BaseAdapter {

        private List<String> listf;
        private Context context;

        public ListAdapter1(Context context,List<String> listf) {
            this.listf = listf;
            this.context=context;
        }

        @Override
        public int getCount() {
            return listf.size();
        }

        @Override
        public Object getItem(int i) {
            return listf.get(i);
        }

        @Override
        public long getItemId(int i) {
            return listf.size();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHloder viewHloder = null;
            if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.onemenu_item, viewGroup,false);
                viewHloder = new ViewHloder();
                viewHloder.textView11 = (TextView) findViewById(R.id.onemenu_text);
                view.setTag(viewHloder);
            } else {
                viewHloder = (ViewHloder) view.getTag();
            }
            viewHloder.textView11.setText(listf.get(i));
            return view;
        }

      private   class ViewHloder {
            TextView textView11;

        }
    }
}
