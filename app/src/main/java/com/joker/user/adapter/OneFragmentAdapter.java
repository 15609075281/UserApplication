package com.joker.user.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.joker.user.R;
import com.joker.user.adapter.main.child.ImageAdapter;
import com.joker.user.ui.bean.OneInfo;
import com.joker.user.ui.bean.child.OneImageInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/4/24.
 */
public class OneFragmentAdapter extends RecyclerView.Adapter<OneFragmentAdapter.ViewHolder> {

    private List<OneInfo> list;

    public OneFragmentAdapter(List<OneInfo> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.onefragment_rc_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(list.get(position).getTitle_name());
        List<OneImageInfo> list1 = null;
        list1 = list.get(position).getList();
        if (list1 != null) {
            ImageAdapter imageAdapter = new ImageAdapter(list1);
            holder.rc.setAdapter(imageAdapter);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public RecyclerView rc;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.one_rltext_item);
            rc = (RecyclerView) view.findViewById(R.id.one_rlrl_item);
            //创建默认的线性LayoutManager
            LinearLayoutManager mLayoutManager = new LinearLayoutManager(view.getContext());
            mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            rc.setLayoutManager(mLayoutManager);
            //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
            rc.setHasFixedSize(true);
        }
    }

}
