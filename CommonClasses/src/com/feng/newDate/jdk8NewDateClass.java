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
    }
}
