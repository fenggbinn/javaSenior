package com.feng.ObjectStream;

import java.io.Serializable;

public class Person implements Serializable {

    //最好加上serialVersionUID，不然有修改可能识别不了，系统默认的可能会导致修改之后就不同了
    //可以用private，当然public也可以
    //private static final long serialVersionUID = 12399923L;
    public static final long serialVersionUID = 12399923L;
    private int id;
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }
}
