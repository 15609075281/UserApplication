package com.joker.user.ui.bean.child;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/24.
 */
public class OneImageInfo implements Serializable {

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "OneImageInfo{" +
                "image='" + image + '\'' +
                '}';
    }
}
