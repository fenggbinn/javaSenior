package com.feng.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

//Comparable
public class ComparableTest {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.setGid(1001);
        goods.setGname("桃子");
        goods.setPrice(3.59);

        Goods goods1 = new Goods(1002,"苹果",1.29);
/*
        if (goods==goods1){
            System.out.println("goods==goods1");
        }else {
            System.out.println("NO");
        }*/
        Goods[] arr = new Goods[2];
        arr[0] = goods;
        arr[1] = goods1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
