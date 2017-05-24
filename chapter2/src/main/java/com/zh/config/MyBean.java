package com.zh.config;

import java.util.List;

/**
 * Created by zh on 2017-05-21.
 */
public class MyBean {
    private String name;
    private String address;
    private Integer age;
    private List<String> sexy;
    private String[] arrs;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSexy(List<String> sexy) {
        this.sexy = sexy;
    }
}
