package com.feng.string;

import com.sun.jndi.ldap.ext.StartTlsResponseImpl;
import org.junit.Test;

public class StringMethodTest2 {
    @Test
    public void test1(){
        String s1="abcdefghijklmnopq";
        System.out.println(s1.endsWith("adk"));
        System.out.println(s1.endsWith("nopq"));

        System.out.println("----------------------------");

        System.out.println(s1.startsWith("aaa"));
        System.out.println(s1.startsWith("abc"));

        System.out.println("----------------------------");

        System.out.println(s1.startsWith("cde",5));
        System.out.println(s1.startsWith("cde",2));
    }

    @Test
    public void test2(){
        String s1 = "akdfkdcde 今天";
        System.out.println(s1.contains("cde"));
        System.out.println(s1.contains("z"));
        System.out.println(s1.contains("今天"));
    }

    @Test
    public void test3(){
        System.out.println("###########indexOf()方法：############");
        String s1 = "akdfkdcde 今后今天";
        System.out.println(s1.indexOf("a"));
        System.out.println("d字符出现的位置："+s1.indexOf("d"));
        System.out.println(s1.indexOf("z"));
        System.out.println(s1.indexOf("今天"));

        System.out.println("----------------------------");

        System.out.println("d字符出现的位置："+s1.indexOf("d",4));

        System.out.println("###########lastIndexOf()方法：############");
        System.out.println("d字符出现的位置："+s1.lastIndexOf("d"));
        System.out.println(s1.lastIndexOf("y"));
        System.out.println("-----------------------------");
        System.out.println("d字符出现的位置："+s1.lastIndexOf("d",6));
    }
}
