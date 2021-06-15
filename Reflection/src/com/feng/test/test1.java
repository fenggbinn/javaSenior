package com.feng.test;

import com.feng.bean.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test1 {
    /**
     * Java反射机制提供的功能
     * >在运行时判断任意一个对象所属的类>在运行时构造任意一个类的对象
     * >在运行时判断任意一个类所具有的成员变量和方法
     * >在运行时获取泛型信息
     * >在运行时调用任意一个对象的成员变量和方法
     * >在运行时处理注解
     * >生成动态代理
     */
    @Test
    public void test1(){
        Person person = new Person("cat",1);
        System.out.println(person);
        person.setAge(2);
        System.out.println(person);
        person.show();
    }

    @Test
    public void test2() throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        System.out.println("======newInstance=======");
        Person dog = constructor.newInstance("dog", 3);
        System.out.println(dog);
        dog.show();

     /*   System.out.println("=======getDeclaredField=========");
        Field age = personClass.getDeclaredField("age");
        age.set(personClass,10);
        System.out.println(age);

        System.out.println("=======getDeclaredFields========");
        Field[] declaredFields = personClass.getDeclaredFields();
        declaredFields[0].set(personClass,"files1");
        declaredFields[1].set(personClass,13);
        System.out.println(declaredFields);*/

        /*System.out.println("========getDeclaredMethod=======");
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(personClass);*/

        System.out.println("========getDeclaredConstructor=======");
        Constructor<Person> cons2 = personClass.getDeclaredConstructor();
        cons2.setAccessible(true);
        Person person2 = cons2.newInstance("kdfkd", 20);
        System.out.println(person2);
    }
}
