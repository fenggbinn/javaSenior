package com.feng.genericMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    @Test
    public void test1(){
        List<?> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(1);
        list2.add("2");
        list=list1;
        System.out.println(list);
        list=list2;
        System.out.println(list);
    }
}
