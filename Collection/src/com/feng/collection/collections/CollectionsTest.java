package com.feng.collection.collections;

import org.junit.Test;

import java.util.*;

/**
 * collections类
 * 	reverse(List):反转List中元素的顺序
 * 	shuffLe(list):对 List集合元素进行随机排序
 * 	sort(List):根据元素的自然顺序对指定List集合元素按升序排序
 * 	sort(List，comparator):根据指定的Comparator产生的顺序对List 集合元素进行排序
 * 	swap(List， int,int):将指定list集合中的i处元素和j处元素进行交换
 * 	object max(collection):根据元素的自然顺序，返回给定集合中的最大元素
 * 	object max(collection，Comparator):根据Comparator指定的顺序，返回给定集合中的最大object min(collection)
 * 	object min(collection,comparator)
 * 	int frequency(collection，object):返回指定集合中指定元素的出现次数
 * 	void copy(List dest,List src):将src中的内容复制到dest中
 * 	boolean replaceAlL(List list, object oldval，object newVal):使用新值替换List对
 */
public class CollectionsTest {

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(-3);
        list.add(87);
        list.add(13);
        list.add(1);

        System.out.println(list);
        System.out.println("----reverse----");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("---shuffle---");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("----copy-----");
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest);
        Collections.copy(dest,list);
        System.out.println(dest);
        System.out.println(list);

        System.out.println("----转换为线程安全----");
        List list1 = Collections.synchronizedList(list);
        System.out.println(list);
        System.out.println(list1);
    }
}
