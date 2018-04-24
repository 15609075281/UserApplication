package com.joker.user.ui.bean;

import com.joker.user.ui.bean.child.OneImageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/4/24.
 */
public class OneInfo implements Serializable {

    private String title_name;

    private List<OneImageInfo> list;


    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public List<OneImageInfo> getList() {
        return list;
    }

    public void setList(List<OneImageInfo> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "OneInfo{" +
                "title_name='" + title_name + '\'' +
                ", list=" + list +
                '}';
    }
}
