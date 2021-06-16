package com.feng.exer2;

import com.feng.exer.Person;
import org.junit.Test;

import java.lang.reflect.Field;

public class ReflectionTest {
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"请天");

        System.out.println(name.get(person));
    }
}
