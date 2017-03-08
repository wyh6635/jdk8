package com.awangyh.jdk8.datedemo;

import java.time.Duration;
import java.time.Instant;

import static java.lang.System.out;

/**
 * Created by wangyanhui on 2017/3/8.
 */
public class InstantDateDemo {

    public static void main(String[] args) throws InterruptedException {

        Instant minInstant = Instant.MIN;
        Instant maxInstant = Instant.MAX;
        Instant currentInstant = Instant.now();

        out.println("当前的时区时间瞬时点 : " + currentInstant);
        out.println("当前的时区时间瞬时点 : " + currentInstant.toEpochMilli());
        out.println("当前时间值: " + System.currentTimeMillis());
        out.println("最小支持时区时间瞬时点 : " + minInstant);
        out.println("最大支持时区时间瞬时点 : " + maxInstant);
        out.println("判断是否相等：" + currentInstant.equals(minInstant));
        out.println("判断是否相等：" + currentInstant.compareTo(minInstant));

        Thread.sleep(2000);
        Instant end = Instant.now();
        Duration duration = Duration.between(currentInstant, end);
        System.out.println("耗时：" + duration.toMillis());

    }
}
