package com.feng.other;

import org.junit.Test;

import java.util.Calendar;

public class CalendarTest1 {
    @Test
    public void test1(){
        Calendar  calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
    }
}
