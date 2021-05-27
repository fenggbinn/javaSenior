package com.feng.other;

import org.junit.Test;

import java.util.Calendar;

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
}
