package com.feng.collection.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * *创建该类的5个对象，并把这些对象放入 TreeSet集合中（下一章:TreeSet需使用泛型来定义分别按以下两种方式对集合中的元素进行排序，并遍历输出:
 * 1)．使Employee实现Comparable接口，并按name排序
 * 2)．创建TreeSet时传入comparator对象，按生日日期的先后排序。
 */
public class EmployeeTest {

    //1)．使Employee实现Comparable接口，并按name排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("l刘若英",30,new MyDate(1989,1,1));
        Employee e2 = new Employee("g郭富城",42,new MyDate(1999,11,11));
        Employee e3 = new Employee("l黎明",37,new MyDate(1969,4,21));
        Employee e4 = new Employee("l刘德华",47,new MyDate(1982,5,11));
        Employee e5 = new Employee("z张学友",46,new MyDate(1984,8,6));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //2)．创建TreeSet时传入comparator对象，按生日日期的先后排序。
    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    //比较年
                    int minusyear = b1.getYear()-b2.getYear();
                    if (minusyear!=0){
                        return minusyear;
                    }

                    //比较月
                    int minusmonth = b1.getMonth()-b2.getMonth();
                    if (minusmonth!=0){
                        return minusmonth;
                    }

                    //比较日
                    /*int minusday = b1.getDay()-b2.getDay();
                    if (minusday!=0){
                        return minusday;
                    }*/
                    return b1.getDay()-b2.getDay();
                }throw new RuntimeException("上传的值有问题");
            }
        });

        Employee e1 = new Employee("l刘若英",30,new MyDate(1989,1,1));
        Employee e2 = new Employee("g郭富城",42,new MyDate(1999,11,11));
        Employee e3 = new Employee("l黎明",37,new MyDate(1969,4,21));
        Employee e4 = new Employee("l刘德华",47,new MyDate(1984,5,11));
        Employee e5 = new Employee("z张学友",46,new MyDate(1984,5,6));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
