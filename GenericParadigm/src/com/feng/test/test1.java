package com.feng.test;

import org.junit.Test;

import java.util.ArrayList;

public class test1 {

    @Test
    public void test11(){//java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        ArrayList arrayList = new ArrayList();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add("strr");
        for (Object obj :
                arrayList) {
            int x = (Integer)obj;
            System.out.println(x);
        }
    }

    @Test
    public void test2(){
//        ArrayList<Integer> arrayList = new ArrayList();//这种写法也没有错误
//        ArrayList<Integer> arrayList = new ArrayList<>();//默认写这种
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(23);
//        arrayList.add("strr");
        for (Object obj :
                arrayList) {
            int x = (Integer)obj;
            System.out.println(x);
        }
    }
}
