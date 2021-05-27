package com.feng.other;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class CalendarTest1 {
    @Test
    public void test1(){
        Calendar  calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
    }

    /**
     * Calendar的get()方法
     */
    @Test
    public void test2(){
        Calendar  calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        int days1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);
        int days2 = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(days2);
        int days3 = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days3);
    }

    /**
     * Calendar的set()方法
     */
    @Test
    public void test3(){
        Calendar  calendar = Calendar.getInstance();
        int days1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);

        System.out.println("-----set()-----");
        calendar.set(Calendar.DAY_OF_MONTH,20);
        int days2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days2);

        System.out.println("-----add()-----");

        calendar.add(Calendar.DAY_OF_MONTH,3);
        int days3 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days3);
        calendar.add(Calendar.DAY_OF_MONTH,-5);
        int days4 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days4);

        System.out.println("-----getTime()和setTime()-----");

        Date date = calendar.getTime();
        System.out.println(date);

        Date date1 = new Date(3948394394L);
        calendar.setTime(date1);
        int days5 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days5);


    }
}
