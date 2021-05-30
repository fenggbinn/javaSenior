package com.feng.collection.list;

/**
 * List
 * 	存储有序的、可重复的数据。-->“动态”数组
 * 		ArrayList
 * 		 LinkedList
 * 		Vector
 * 		ArrayList:作为ist接口的主要实现类;线程不安全的，效率高;底层使用Object[] elementData存储
 * 		LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高;底层使用双向链表存储
 * 		Vector:作为List接口的古老实现类;线程安全的，效率低;底层使用Object[] elementData存储
 *
 */

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodTest {

    /**
     * add()和addAll()方法
     */
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

    /**
     * get()
     * remove()
     * indexOf()
     * lastIndexOf()
     * set()
     * subList()
     */
    @Test
    public void test2(){
        ArrayList a1 = new ArrayList();
        a1.add("今天");
        a1.add("星期");
        a1.add("六");
        a1.add(1);
        System.out.println(a1);

        System.out.println("--------get()----------");
        System.out.println(a1.get(1));
        System.out.println(a1.get(2));
//        System.out.println(a1.get(5));//java.lang.IndexOutOfBoundsException: Index: 5, Size: 3

        System.out.println("--------remove()----------");
        System.out.println(a1);
        a1.remove("今天");
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);
        //要通过remove()删除数字，必须通过new Integer(数字)才可以
        a1.remove(new Integer(1));
        System.out.println(a1);


        System.out.println("--------indexOf()----------");
        //返回值第一次出现的下标
        a1.add("六");
        a1.add("六");
        a1.add("六");
        System.out.println(a1);
        System.out.println(a1.indexOf(1));
        System.out.println(a1.indexOf("六"));

        System.out.println("--------lastIndexOf()----------");
        System.out.println(a1);
        System.out.println(a1.lastIndexOf("六"));
        System.out.println(a1.lastIndexOf("9"));


        System.out.println("--------set()----------");
        System.out.println(a1);
        a1.set(0,"六");
        System.out.println(a1);

        System.out.println("--------subList()----------");
        System.out.println(a1);
        List s = a1.subList(0, 3);//左闭右开[a,b)
        System.out.println(s);
        System.out.println(a1);//原来的ArrayList不变，直接产生一个新的子集合

        System.out.println("-----------size()-----------");
        System.out.println(a1);
        System.out.println(a1.size());

        System.out.println("----ArrayList：集合的遍历-----");
        Iterator iter = a1.iterator();
        System.out.println("===iterator()===");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("===foreach()===");
        for (Object list :
                a1) {
            System.out.println(list);
        }
    }
}
