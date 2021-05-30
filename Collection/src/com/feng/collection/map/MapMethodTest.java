package com.feng.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 常用方法
 * 	添加、删除、修改操作:
 * 		Object put(Object key,Object value):将指定key-value添加到(或修改)当前map对象中
 * 		void putAll(Map m):将m中的所有key-value对存放到当前map中
 * 		Object remove(Object key):移除指定key的key-value对，并返回value
 * 		void clear():清空当前map中的所有数据
 * 	元素查询的操作:
 * 		Object get(Object key):获取指定key对应的value
 * 		boolean containsKey(Object key):是否包含指定的key
 * 		boolean containsValue(Object value):是否包含指定的value
 * 		int size():返回map中key-value对的个数
 * 		boolean isEmpty():判断当前map是否为空
 * 		boolean equals(Object obj):判断当前map和参数对象obj是否相等
 * 	元视图操作的方法:
 * 		Set keySet():返回所有key构成的Set集合
 * 		Collection values():返回所有value构成的Collection集合
 * 		Set entrySet():返回所有key-value对构成的Set集合
 */
public class MapMethodTest {

    /**
     * 添加、删除、修改操作:
     */
    @Test
    public void test1(){
        Map map = new HashMap();
        Map map2 = new HashMap();
        map.put(101,"晴天");
        map2.put(102,"厚厚的云");
        map2.put(103,"斜阳");
//        map2.put(101,"雨天");
        map.putAll(map2);
        System.out.println("----put-putAll----");
        System.out.println(map2);
        System.out.println(map);

        System.out.println("----remove----");
        System.out.println(map);
        Object remove = map.remove(101);
        System.out.println(remove);
        System.out.println(map);
        Object remove2 = map.remove("102");
        System.out.println(remove2);
        System.out.println(map);

        System.out.println("----clear----");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }

    /**
     * 元素查询的操作:
     */
    @Test
    public void test2(){
        Map map = new HashMap();
        Map map2 = new HashMap();
        map.put(101,"晴天");
        map2.put(102,"厚厚的云");
        map2.put(103,"斜阳");
        map.putAll(map2);
        System.out.println("-----test/out-------");
        System.out.println(map);

        System.out.println("-----get-------");//只能根据key值获取value值
        System.out.println(map.get(102));
        System.out.println(map.get("晴天"));

        System.out.println("-----containsKey、Value-------");//返回Boolean值
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("晴天"));


        System.out.println("-----size-------");
        System.out.println(map.size());
        System.out.println(map2.size());


        System.out.println("-----isEmpty()------");
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

        System.out.println("------equals-------");
        System.out.println(map.equals(map2));
        map2.clear();
        System.out.println(map.equals(map2));//都为空结果为：true
    }
}
