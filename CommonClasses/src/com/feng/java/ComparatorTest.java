package com.feng.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    @Test
    public void test1(){
        String[] str = new String[]{"e","d","c","b","a"};
        System.out.println(Arrays.toString(str));
        System.out.println("--------------------------");

        //定义匿名内部类：进行排序
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return -o1.compareTo(o2);//逆序
                return o1.compareTo(o2);//正序
            }
        });

        System.out.println(Arrays.toString(str));
    }

    /**
     * 一定要注意空指针：GoodsNew[] goods = new GoodsNew[34]; 数组定义太大，赋值没有付完，导致后面有空的
     */
    @Test
    public void test2(){
        /*GoodsNew[] goods = new GoodsNew[34];
        goods[0] = new GoodsNew(101,"苹果",4.6);
        goods[1] = new GoodsNew(102,"黄杏",2.75);
        goods[2] = new GoodsNew(103,"李子",5.5);*/
        Goods[] goods = new Goods[3];
        goods[0] = new Goods(101,"苹果",4.6);
        goods[1] = new Goods(102,"黄杏",2.75);
        goods[2] = new Goods(103,"李子",5.5);
        System.out.println(Arrays.toString(goods));
        System.out.println("----------------------");

        /**
         * 调用Goods类中默认重写的排序方法
         */
//        Arrays.sort(goods);

        /**
         * 调用排序方法，并重写排序方法，ps:里面也可以使用默认的排序方法（Goods类重写过的）。
         */
        Arrays.sort(goods, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
//                System.out.println(o1.getGid());
                if (o1.getGname()==o2.getGname()){
                    return Double.compare(o1.getPrice(),o2.getPrice());
                }else {
                    return o1.getGname().compareTo(o2.getGname());
                }

            }
        });
        /*Arrays.sort(goods, new Comparator<GoodsNew>() {
            @Override
            public int compare(GoodsNew o1, GoodsNew o2) {
                if (o1 instanceof GoodsNew && o2 instanceof GoodsNew){
                    return o1.compareTo(o2);
                }throw new RuntimeException("数据不对");

            }
        });*/
        System.out.println(Arrays.toString(goods));
    }
}
