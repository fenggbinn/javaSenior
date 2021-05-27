package com.feng.newDate;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {
    @Test
    public void test1(){
        //now()获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //atOffset()添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }

    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);

        //获取自1970年1月1日日时e分日秒(UTC)开始的毫秒数
        long e = instant.toEpochMilli();
        System.out.println(e);
    }
}
