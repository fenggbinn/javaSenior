package com.feng.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map);

        System.out.println("-------------");
        /*Hashtable hashtable = new Hashtable();//java.lang.NullPointerException
        hashtable.put(null,null);
        System.out.println(hashtable);*/
    }
}
