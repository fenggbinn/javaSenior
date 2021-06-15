package com.feng.test;

import com.feng.bean.Person;
import org.junit.Test;

public class NewInstanceTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        /**
         * 要想此方法正常的创建运行时类的对象，要求:
         * 1.运行时类必须提供空参的构造器
         * 2.空参的构造器的访问权限得够。通常，设置为public.
         *
         * 在javabean中要求提供一个public的空参构造器。原因:
         * 1.便于通过反射，创建运行时类的对象
         * 2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
         */
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);
    }
}
