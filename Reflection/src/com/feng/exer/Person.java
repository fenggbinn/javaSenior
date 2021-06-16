package com.feng.exer;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String> ,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){

    }

//    @MyAnnotation(value = "tom")//这个之前不能用注解的原因的我自定义的注解类上面的权限没有打开这个上面能加注解，打开权限（添加相应的权限）就可以添加了如下：
    @MyAnnotation(value = "tom")
    private Person(String name){
        this.name=name;
    }

    Person(String name,int age ){
        this.name=name;
        this.age=age;
    }

    public String display(String interests){
        return interests;
    }

//    @MyAnnotation//同上
    private String show(String nation){
        System.out.println("我的国籍是"+nation);
        return nation;
    }

    @Override
    public int compareTo(String o) {
            return 0;
    }

    @Override
    public void info() {
        System.out.println("I‘m a person");
    }

    private static String show2(String nation){
        System.out.println("我的国籍是"+nation);
        return nation;
    }
}
