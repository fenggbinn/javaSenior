package com.feng.collection.collection;

import org.junit.Test;

import java.util.ArrayList;

public class ListMethodTest {
    @Test
    public void test1(){
//        System.out.println("test1");
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();
        a1.add("今天");
        a2.add("是新心情");
        a2.add("今天晴天");

        a1.add(a2);
        System.out.println(a1);

        System.out.println("---------------");

        //如果使用的是add()方法，可以直接删除对应的
        a1.remove(a2);

        a1.addAll(a2);
        System.out.println(a1);

        System.out.println("----------------");

        //如果使用的是addAll()方法，不能直接删除对应的
        a1.remove(a2);
        System.out.println(a1);

    }
}
