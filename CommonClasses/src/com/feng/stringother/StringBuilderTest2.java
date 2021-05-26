package com.feng.stringother;

import org.junit.Test;

public class StringBuilderTest2 {
    @Test
    public void test1(){
        StringBuilder builder1 = new StringBuilder("builder1");
        System.out.println(builder1);//builder1
        System.out.println(builder1.toString());//builder1
        System.out.println(builder1.length());//8
    }

    @Test
    public void test2(){
        StringBuilder builder1 = new StringBuilder("builder1");
        builder1.append("builder2");
        System.out.println(builder1);
        builder1.insert(8,"INSERT");
        System.out.println(builder1);
        builder1.delete(7,11);
        System.out.println(builder1);
    }

    @Test
    public void test3(){
        StringBuilder b1 = new StringBuilder("abc");
        StringBuilder b2 = new StringBuilder("abc");
        System.out.println(b1);
        b1.reverse();
        System.out.println(b1);
        b2.replace(2,2,"d");
        System.out.println(b2);
        b2.replace(0,2,"e");//左闭右开[a,b)
        System.out.println(b2);
    }
}
