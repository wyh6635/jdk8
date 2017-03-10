package com.awangyh.jdk8.datedemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;

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

        System.out.println("程序员日是一年中的256天:" + LocalDate.of(2017, 1, 1).plusDays(255));

        System.out.println();

        //小心
        System.out.println("输出：" + LocalDate.of(2016, 1, 31).plusMonths(1));
        System.out.println("输出：" + LocalDate.of(2016, 3, 31).minusMonths(1));

        System.out.println("返回今天是星期几：" + LocalDate.now().getDayOfWeek().getValue());

        System.out.println("输出：" + LocalDate.of(2000, 2, 29).plusYears(1));
        System.out.println("输出：" + LocalDate.of(2000, 2, 29).plusYears(4));
        System.out.println("输出：" + LocalDate.of(2000, 2, 29).plusYears(5));

        if ( IsoChronology.INSTANCE.isLeapYear(2000)) {
            System.out.println("润年");
        } else {
            System.out.println("非润年");
        }

    }
}
