package com.feng.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class OtherConversion {

    /**
     * String--char[]
     */
    @Test
    public void test1() {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = s1.toCharArray();
        System.out.println(s1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n------------------------");
//        char[] arr2 = new char[]{1,2,3,4,5};
        char[] arr2 = {1,2,3,4,5};
//        char[] arr3 = new char[]{'a','b','c','d','e'};
        char[] arr3 = {'a','b','c','d','e'};
        String s2 = new String(arr2);
//        String s3 = arr3.toString();
        String s3 = new String(arr3);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("------------------------ ");
//        char[] arr4 = {"abc"};
    }

    /**
     * String--byte[]
     */
    @Test
    public void test2() throws UnsupportedEncodingException {
        String s1 = "123abc";
        byte[] b1 = s1.getBytes();
        System.out.println(Arrays.toString(b1));

        System.out.println("----------------");

        String s2 = "中国";
        byte[] b2 = s2.getBytes();
        System.out.println(Arrays.toString(b2));

        System.out.println("---------------");

        String s3 = "I Love You, 中国";
        byte[] b3 = s3.getBytes("gbk");
        System.out.println(Arrays.toString(b3));

        System.out.println("---------------");

        String s4_last = new String(b3);//使用utf-8创建（解码）byte数组（之前是gbk格式的）会乱码
        System.out.println(s4_last);
        String s4 = new String(b3,"gbk");
        System.out.println(s4);
    }
}
