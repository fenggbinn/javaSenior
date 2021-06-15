package com.feng.test;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test1() throws Exception{
        Properties pros = new Properties();
        FileInputStream fin = new FileInputStream("test.properties");
        pros.load(fin);
        String name = pros.getProperty("name");
        System.out.println(name);
        String age = pros.getProperty("age");
        System.out.println(age);
    }
}
