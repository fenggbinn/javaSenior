package com.feng.newDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class jdk8NewDateClass {
    @Test
    public void test1(){
        //实例化
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println("----------------------");

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,5,27,15,24,5);
        System.out.println(localDateTime1);

        System.out.println("----------------------");

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());

        System.out.println("----------------------");

        LocalDate localDate1 = localDate.withDayOfMonth(31);
        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
