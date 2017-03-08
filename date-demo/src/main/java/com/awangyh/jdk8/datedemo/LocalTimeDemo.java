package com.awangyh.jdk8.datedemo;

import java.time.LocalTime;

/**
 * Created by wangyanhui on 2017/3/8.
 */
public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime rightNow = LocalTime.now();
        LocalTime bedTime  = LocalTime.of(23, 30);
        System.out.println("当前时间(不带日期): " +rightNow);
        System.out.println("休息时间(不带日期): " +bedTime);
        System.out.println("起床时间(不带日期): " +bedTime.plusHours(8));
    }
}
