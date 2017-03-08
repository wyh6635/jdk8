package com.awangyh.jdk8.datedemo;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by wangyanhui on 2017/3/8.
 */
public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("当前日期: " + today);
        LocalDate date1 = LocalDate.of(1993, 6,14);
        System.out.println("日期: " + date1);
        date1 = LocalDate.of(1993, Month.APRIL, 14);
        System.out.println("日期: " + date1);
        System.out.println("增加5天后: " + date1.plusDays(5));
        System.out.println("增加-5天后: " + date1.plusDays(-5));
        System.out.println("增加1周后: " + date1.plusWeeks(1));
        System.out.println("增加1月后: " + date1.plusMonths(1));
        System.out.println("减去5天后: " + date1.minusDays(5));
        System.out.println("减去1周后: " + date1.minusWeeks(1));
        System.out.println("减去1月后: " + date1.minusMonths(1));
        System.out.println("将日期中的日改为5: " + date1.withDayOfMonth(5));
        System.out.println("将日期当年第一个月的日期改为5: " + date1.withDayOfYear(5));
        System.out.println("将日期中的月改成1月: " + date1.withMonth(1));
        System.out.println("判断是否润月: " + today.isLeapYear());

    }
}
