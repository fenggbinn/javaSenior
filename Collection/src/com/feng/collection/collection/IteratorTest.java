package com.feng.collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test1(){
        Collection col = new ArrayList();
        col.add("1");
        col.add("2");
        col.add("3");
        System.out.println(col);
        System.out.println("-----------------");

        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
