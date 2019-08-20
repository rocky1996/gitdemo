package com.acat.gitdemo.util;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Date;

public class TimeUtil {

    private static final Logger logger = LoggerFactory.getLogger(TimeUtil.class);

    public static String getTime(){
        return String.valueOf(new Date());
    }

    public static void main(String[] args){
        System.out.println(TimeUtil.getTime());
    }
}
