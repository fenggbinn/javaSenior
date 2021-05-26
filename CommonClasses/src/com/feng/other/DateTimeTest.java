package com.feng.other;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {

    /**
     * simpleDateFormat 对日期格式转换，字符串转换为日期类型
     * @throws ParseException
     */
    @Test
    public void test1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        System.out.println("==========================");

        String s1 = "2021-05-26 下午08:51";
        Date date2 = simpleDateFormat.parse(s1);
        System.out.println(date2);

        System.out.println("==========================");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format2 = simpleDateFormat2.format(date);
        System.out.println(format2);
        String format3 = simpleDateFormat3.format(date);
        System.out.println(format3);

        System.out.println("--------------------------");

        String s2 = "2021-05-26 21:59:30";
        Date date3 = simpleDateFormat3.parse(s2);
        System.out.println(date3);
    }

    /**
     * 将字符串“2021-05-26”转换为java.sql.Date
     */
    @Test
    public void test2() throws ParseException {
        String birth = "2021-05-26";
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");
        Date bithDate = si.parse(birth);
        java.sql.Date sqlBirth = new java.sql.Date(bithDate.getTime());
        System.out.println(sqlBirth);
    }
}
