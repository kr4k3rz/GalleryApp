package com.codelite.kr4k3rz.imagegallery;

import java.io.Serializable;


public class Image implements Serializable {
    int res;
    String name;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
