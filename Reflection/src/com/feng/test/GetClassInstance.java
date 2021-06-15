package com.feng.test;

import com.feng.bean.Person;
import org.junit.Test;

public class GetClassInstance {
    @Test
    public void test() throws ClassNotFoundException {
        System.out.println("方式一：");
        Class<Person> clazz = Person.class;
        System.out.println(clazz);

        System.out.println("方式二：");
        Person person = new Person();
        Class<? extends Person> clazz2 = person.getClass();
        System.out.println(clazz2);

        System.out.println("方式三：");
        Class<?> clazz3 = Class.forName("com.feng.bean.Person");
        System.out.println(clazz3);


    }
}
