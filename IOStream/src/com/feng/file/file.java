package com.feng.file;

import org.junit.Test;

import java.io.File;
import java.lang.annotation.Target;

/**
 * File类的使用
 * 1. File类的一个对象，代表一个文件或一个文件目录(俗称:文件夹)
 * 2.
 */
public class file {
    @Test
    public void test1(){
        //1.相对路径下创建文件
        File file1 = new File("file1.txt");

        //2.绝对路径
        File file2 = new File("D:/idea/code/javaSenior/IOStream/src/com/feng/FileTest/file2.txt");

        //3.子文件
        File file3 = new File("D:/idea/code/javaSenior/IOStream/src/com/feng/FileTest/","file3.txt");

        //4.调用File
        File file4_1 = new File("D:/idea/code/javaSenior/IOStream/src/com/feng/FileTest/");
        File file4 = new File(file4_1,"file4.txt");

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);

    }
}
