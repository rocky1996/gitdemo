package com.acat.gitdemo.domain;

import java.io.Serializable;

public class Apper implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
