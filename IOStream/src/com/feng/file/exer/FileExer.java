package com.feng.file.exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 1.利用File构造器，new 一个文件目录file
 *      1)在其中创建多个文件和目录
 *      2)编写方法，实现删除file中 指定文件的操作
 * 2.判断指定目录下是否有后缀名为jpg的文件，如果有，就输出该文件名称
 * 3.遍历指定目录所有文件名称，包括子文件目录中的文件。
 *      拓展1:并计算指定目录占用空间的大小
 *      拓展2:删除指定文件目录及其下的所有文件
 */
public class FileExer {

    /**
     * 1.利用File构造器，new 一个文件目录file
     */
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\idea\\other\\io\\file\\fi4.txt");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建fi4.txt成功");
        }
        File file1 = new File(file.getParent(),"fi5.txt");
        if (!file1.exists()){
            file1.createNewFile();
            System.out.println("创建fi5.txt成功");
        }
    }

    // 2.判断指定目录下是否有后缀名为jpg的文件，如果有，就输出该文件名称
    @Test
    public void test2() throws IOException {
        File file = new File("D:\\idea\\other\\io\\file\\images");
        if (file.exists()){
            String[] list = file.list();
            boolean f = true;//用于记录判断文件夹中是否有.jpg文件
            for (String str :
                    list) {
                if (str.endsWith(".jpg")){
                    System.out.println(str);
                    f=false;
                }
            }
            if (f){
                System.out.println("此文件夹中不存在.jpg类型文件");
            }
        }else {
            System.out.println("不存在此文件夹");
            file.mkdir();
            System.out.println("创建images文件夹了");
        }
    }

}
