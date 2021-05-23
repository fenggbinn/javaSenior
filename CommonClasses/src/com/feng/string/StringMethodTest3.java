package com.feng.string;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;

public class StringMethodTest3 {
    @Test
    public void test1(){
        String s1 = "hello world";
        System.out.println(s1.replace("l","L"));//替换字符，原来字符串不变
        System.out.println(s1);
        System.out.println("------------------");
        System.out.println(s1.replace("ll","LL"));//替换字符串

        System.out.println("------------------");

        System.out.println(s1.replaceAll("e|o","1"));
        System.out.println(s1.replaceFirst("e|o","1"));

        System.out.println("------------------");

        System.out.println(s1.matches("e"));//

        System.out.println("------------------");

        System.out.println(s1.split("o"));
        System.out.println(s1.split("o",1));
    }
}
