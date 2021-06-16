package com.feng.exer2;

import com.feng.exer.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

    @Test
    public void testMethod() throws Exception{
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object china = show.invoke(person, "China");
        System.out.println(china);
    }
}
