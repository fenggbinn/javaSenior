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

    @Test
    public void test2(){
        Collection col = new ArrayList();
        col.add("1");
        col.add("2");
        col.add("3");
        System.out.println(col);
        System.out.println("-----------------");

        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            if (iterator.next()=="3"){
                iterator.remove();
            }
//            System.out.println(iterator.next());
        }
        //上面while循环迭代器已经遍历到末尾了，需要重新赋值
        iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
