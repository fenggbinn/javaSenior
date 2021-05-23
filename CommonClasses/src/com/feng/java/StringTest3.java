package com.feng.java;

public class StringTest3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";

        String s3 = s1 + "def";
        String s4 = "abc" + s2;

        String s5 = "abcdef";

        String s6 = (s1+s2).intern();//到常量池调用
        String s7 = (s1+"def").intern();

        System.out.println(s3==s5);//false
        System.out.println(s4==s5);//false
        System.out.println(s6==s5);//true
        System.out.println(s7==s5);//true
    }
}
