package com.acat.gitdemo.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 2L;

    private String id;
    private int age;
    private String score;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreate_data() {
        return create_data;
    }

    public void setCreate_data(String create_data) {
        this.create_data = create_data;
    }

    private String create_data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public static final String WUJINFAN = "wujinfan";

    public static final String HEYUANHUI = "heyuanhui";
}
