package com.feng.newDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class jdk8NewDateClass {
    @Test
    public void test1(){
        //实例化
        System.out.println("======================");
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

        System.out.println("-----------------------");

        LocalTime localTime1 = localTime.withHour(19);
        System.out.println(localTime);
        System.out.println(localTime1);

        System.out.println("---------------------");

        LocalDateTime localDateTime2 = localDateTime.plusDays(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        System.out.println("--------------------");

        LocalDate localDate2 = localDate.minusWeeks(3);
        System.out.println(localDate);
        System.out.println(localDate2);
    }
}
