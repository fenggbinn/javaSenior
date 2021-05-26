package com.feng.other;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习二:"三天打渔两天晒网”1990-01-01xXXx-XX-xx打渔?晒网?举例: 2020-09-e8 ?总天数
 */
public class Fishing2 {

    /*public void FishTest() throws ParseException {

    }*/

    public static void main(String[] args) throws ParseException{
        String date1 = "2015-09-01";
//        String date2 = "2018-06-09";
        Scanner in = new Scanner(System.in);
        String date2 = in.next();
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");

        Date pdate1 = si.parse(date1);
        Date pdate2 = si.parse(date2);

        long dateTime = pdate2.getTime()-pdate1.getTime();

        int days = (int)dateTime/1000/60/60/24;//根据总毫秒数计算天数

        int i = days % (3 + 2);

        if (i>0&&i<4){
            System.out.println("今天我正在打鱼");
        }else if(i==0||i==4){
            System.out.println("今天我在晒网");
        }
    }
}
