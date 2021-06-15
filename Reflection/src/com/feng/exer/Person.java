package com.feng.exer;

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String> ,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){

    }

//    @MyAnnotation(value = "tom")
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

//    @MyAnnotation
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
}
