package com.feng.test;

import org.junit.Test;

public class ClassLoaderTest {
    @Test
    public void test(){
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        /**
         * //调用系统类加载器的getParent():获取扩展类加载器
         * classLoader classLoader1 = classLoader.getParent();
         * //调用扩展类加载器的getparent():无法获取引导类加载器
         * //引导类加载器主要负责加载java的核心类库，无法加载自定义类的。
         */
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println("无法获取到了：\n"+parent1);
    }
}
