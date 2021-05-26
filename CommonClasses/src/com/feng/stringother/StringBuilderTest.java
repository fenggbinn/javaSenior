package com.feng.stringother;

import org.junit.Test;

import java.util.Arrays;

public class StringBuilderTest {

    /**
     * String的方法和StringBuffer、StringBuilder不通用
     */
    @Test
    public void test1(){
        StringBuilder builder1 = new StringBuilder("using string's method: split");
        String s1 = "s1a1b1d1";
        String[] split = s1.split("1");
        System.out.println(Arrays.toString(split));
    }
}
