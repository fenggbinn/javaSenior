package com.feng.string;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);
        s1 = "hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
