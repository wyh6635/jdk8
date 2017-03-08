package com.awangyh.jdk8.datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by wangyanhui on 2017/3/8.
 */
public class TemporalAdjustersDemo {

    public static void main(String[] args) {
        LocalDate start = LocalDate.now();
        LocalDate firstTuesday = start.withDayOfMonth(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("当前日期: " + start);
        System.out.println("当前月份第一个星期一的日期" + firstTuesday);
        System.out.println("当前月最后一个工作日：" + start.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
