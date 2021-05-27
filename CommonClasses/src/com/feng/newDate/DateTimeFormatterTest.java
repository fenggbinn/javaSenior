package com.feng.newDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    /**
     * DateTimeFormatter:
     * 	格式化或解析日期、时间类似于SimpLeDateFormat
     * 	实例化
     * 		预定义的标准格式。如: ISo_LOCAL_DATE_TIME;ISo_LOCAL_DATE;ISo_LOCAL_TIME
     * 		本地化相关的格式。如: ofLocalizedDateTime(Formatstyle.LONG)
     * 		自定义的格式。如: ofPattern("yyyy-MM-dd hh : mm: ss E”)
     */
    @Test
    public void test1(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTimeFormatter.getClass());
     /*   System.out.println("================");

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDate localDate1 = LocalDate.now();
        String format1 = dateTimeFormatter.format(localDateTime1);
        String format2 = dateTimeFormatter.format(localDate1);
        System.out.println(format1);
        System.out.println(format2);*/
    }
}
