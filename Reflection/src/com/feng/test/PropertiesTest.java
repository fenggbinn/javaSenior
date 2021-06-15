package com.feng.test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test1() throws Exception{
        Properties pros = new Properties();
//        FileInputStream fin = new FileInputStream("test.properties");
        FileInputStream fin = new FileInputStream("src/testSrc.properties");
        pros.load(fin);
        String name = pros.getProperty("name");
        System.out.println(name);
//        String age = pros.getProperty("age");
//        System.out.println(age);
    }

    @Test
    public void test2() throws Exception{
        Properties pros = new Properties();
        //类加载器的方式
        //获取当前类的构造器
        ClassLoader classLoader = PropertiesTest.class.getClassLoader();
        //读取相应的文件为输入流的方式
        InputStream in = classLoader.getResourceAsStream("testSrc.properties");
        //properties文件加载
        pros.load(in);
        String name = pros.getProperty("name");
        System.out.println(name);
        String date = pros.getProperty("date");
        System.out.println(date);
    }
}
