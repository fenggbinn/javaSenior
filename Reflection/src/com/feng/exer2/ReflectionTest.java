package com.feng.exer2;

import com.feng.exer.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
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

    @Test
    public void testStaticMethod() throws Exception{
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show2", String.class);
        show.setAccessible(true);
        Object china = show.invoke(person, "China");
        System.out.println(china);
    }


    @Test
    public void testUseConstruct()throws Exception{
        Class<Person> clazz = Person.class;
//        Constructor<Person> con = clazz.getDeclaredConstructor(String.class);//指定newInstance()方法的时候是传入什么参数
        Constructor<Person> con = clazz.getDeclaredConstructor();
        con.setAccessible(true);//这个不要忘记设置了
//        Person person = con.newInstance("tom");
        Person person = con.newInstance();
        System.out.println(person);
    }
}
