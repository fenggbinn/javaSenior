package com.feng.collection.properties;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fin = new FileInputStream("jdbc2.properties");//文件放在整个项目的根目录下（工程目录下）
        properties.load(fin);//加载流文件

        String name = properties.getProperty("name");
        String password = properties.getProperty("password");

        System.out.println("name: "+name+"\npassword: "+password);
    }
}
