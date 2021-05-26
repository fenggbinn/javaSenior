package com.feng.other;

import org.junit.Test;

import java.sql.Time;
import java.util.Date;

import static java.lang.System.currentTimeMillis;


public class currentTimeTest {
    @Test
    public void test1(){
        long time = currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        Date date = new Date();
        System.out.println("空的Date（）对象返回当前时间："+date);;
        Date date2 = new Date(2309434340999L);
        System.out.println(date2);
        System.out.println(date.getTime());;
        System.out.println(date2.getTime());;
    }
}
