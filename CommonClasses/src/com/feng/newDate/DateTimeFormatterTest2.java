package com.feng.newDate;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * DateTimeFormatter自定义 .ofPattern("yyyy-MM-dd");
 */
public class DateTimeFormatterTest2 {
    @Test
    public void test1(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E");//E显示星期几
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String format = dtf.format(now);
        System.out.println(format);
    }

    @Test
    public void test2(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");//hh的值不能大于12 并且小于10必须写成08
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-ddThh:mm:ss");//hh的值不能大于12 并且小于10必须写成08
        String date1 = "2021-05-27 07:40:30";
//        String date2 = "2021-05-27 19:46:30";
        TemporalAccessor parse = dtf.parse(date1);
//        TemporalAccessor parse2 = dtf2.parse(date2);
        System.out.println(parse);
//        System.out.println(parse2);
    }
}
