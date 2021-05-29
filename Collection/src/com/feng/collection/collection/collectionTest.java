package com.feng.collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class collectionTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add('a');
        collection.add("bcd");
        collection.add(123);
        collection.add(new Date());

        Collection collection1 = new ArrayList();
        collection1.add("啦啦啦");
        collection1.add("Hello world!");

        collection.addAll(collection1);

        System.out.println(collection);
        System.out.println(collection1);

        System.out.println(collection.size());
        System.out.println(collection1.size());

        System.out.println("----------------------");

        collection1.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection1.isEmpty());
    }
}
