package com.feng.test;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

public class OrderTest {
    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为object类型
        Order order = new Order();
        order.setOrderT(12);
        order.setOrderT("234");
        System.out.println(order.getOrderT());
    }

    @Test
    public void test2(){
        Order<String> order = new Order<>();
        order.setOrderT("str");
        System.out.println(order);
        Order<Integer> order1 = new Order<>();
        order1.setOrderT(1);
        System.out.println(order1);
    }

    @Test
    public void testSub1(){
//        SubOrder1<Integer> subOrder1 = new SubOrder1();
        SubOrder1 subOrder1 = new SubOrder1();
        subOrder1.setOrderId(2);
        subOrder1.setOrderName("kk");
        subOrder1.setOrderT(34);
        System.out.println(subOrder1);
    }

    @Test
    public void testSub2(){
//        SubOrder2<String> sub2 = new SubOrder2<>(12,"sub2","2");//sub2没有写构造方法，不能使用父类的有参构造方法
        SubOrder2<String> sub2 = new SubOrder2<>();
        sub2.setOrderT("sub2");
        System.out.println(sub2);
    }

    @Test
    public void testSub3(){
        SubOrder3<Integer> sub3 = new SubOrder3<>();
        sub3.setOrderT(3);
        System.out.println(sub3);

        System.out.println("====================");

        //测试泛型数组是否可以
        //测试失败，编译都报错了
        /**
         * 运行报错：
         * Error:(53, 51) java: 不兼容的类型: 无法推断com.feng.test.SubOrder4<>的类型参数
         *     原因: 不存在类型变量T的实例, 以使com.feng.test.SubOrder4<T>与com.feng.test.SubOrder3<java.lang.String[]>一致
         */
        /*SubOrder3<String[]> sub3_2 = new SubOrder4<>();
        String[] str = {"a","b","c"};
        sub3_2.setOrderT(str);
        System.out.println(sub3_2);*/
    }

    @Test
    public void tsetSub4(){
        /*SubOrder4<String[]> sub4 = new SubOrder4<>();
        String[] str = {"a","b","c"};
        sub4.setOrderT(str);*///这个受父类泛型控制，自己定义的泛型失效，相当于不是泛型类
        /**
         * 前面的testSub3里面的 _2不知道为什么不能像下面的这样写，下面的这个编译没有报错
         */
        SubOrder4<String[]> sub4 = new SubOrder4<>();
        String[] str = {"a","b","c"};
        sub4.setOrderT(1);
        System.out.println(sub4);
        System.out.println("---------------------");
        SubOrder4 sub4_2 = new SubOrder4<>();
        sub4_2.setOrderT(2);
        System.out.println(sub4_2);
    }
}
