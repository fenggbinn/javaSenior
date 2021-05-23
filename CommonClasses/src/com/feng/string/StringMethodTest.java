package com.feng.string;

import org.junit.Test;

public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = "";
        String s2 = "hello world";
        System.out.println("输出s2字符串长度："+s2.length());
        System.out.println("输出s2索引值："+s2.charAt(3));
        System.out.println("判断字符串是否为空："+s1.isEmpty());
        System.out.println("判断字符串是否为空："+s2.isEmpty());
    }

    @Test
    public void test2(){
        String s1 = "abcde";
        String s2 = "ABCDE";
        String s3 = "abCdE";

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
    }

    @Test
    public void test3(){
        String s1 = "  abc  ";
        System.out.println("s1: "+s1);
        String s2 = s1.trim();
        System.out.println("s2(s1.trim()): "+s2);
    }

    @Test
    public void test4(){
        String s1 = "abcD";
        String s2 = "abcd";
        System.out.println("没有忽略大小写比较："+s1.equals(s2));
        System.out.println("忽略大小写比较："+s1.equalsIgnoreCase(s2));
    }

    @Test
    public void test5(){
        String s1 = "abc";
        String s2 = s1.concat("def");
        String s3 = s1+"def";
        System.out.println("使用concat方法："+s2);
        System.out.println("使用+："+s3);
    }

    @Test
    public void test6(){
        String s1 = "abc";
        String s2 = "def";
        String s3 = "xyzz";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s1));
    }

    @Test
    public void test7(){
        String s1 = "今天是凉爽的一天，上午下了一点雨，现在已经停了，地面也开始干了。";
        String s2 = s1.substring(9);
        String s3 = s1.substring(9,16);//左闭右开，从9，到15
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
