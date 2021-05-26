package com.feng.stringother;

public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        System.out.println(s1);
        s1.setCharAt(0,'z');
        System.out.println(s1);
        s1.append("defghij");
        System.out.println(s1);

    }
}
