package com.feng.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *Set
 * 	存储无序的、不可重复的数据。-->高中讲的“集合”
 * 		Hashset
 * 			HashSet:作为Set接口的主要实现类;线程不安全的;可以存储null值。
 * 		LinkedHashset
 * 			linkedHashSet:作为HashSet的子类;遍历其内部数据时，可以按照添加的顺序遍历。
 * 		Treeset
 * 			Treeset:可以按照添加对象的指定属性,进行排序。
 */
public class SetTest {
    @Test
    public void test1(){
        Set hashset = new HashSet();
//        Set hashset = new LinkedHashSet();
        hashset.add("AA");
        hashset.add("dd");
        hashset.add("cc");
        hashset.add("BB");
        hashset.add(new User(101,"晴天"));
        System.out.println(hashset);

        System.out.println("--------------");
        Iterator iterator = hashset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
