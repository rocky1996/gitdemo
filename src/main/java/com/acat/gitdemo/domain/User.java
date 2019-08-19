package com.acat.gitdemo.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 2L;

    private String id;
    private int age;
    private String score;

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
}
