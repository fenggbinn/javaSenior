package com.feng.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(null,null);
        System.out.println(map);

        System.out.println("-------------");
        /*Hashtable hashtable = new Hashtable();//java.lang.NullPointerException
        hashtable.put(null,null);
        System.out.println(hashtable);*/

        System.out.println("------------");
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        System.out.println(map);
    }
}
