package com.feng.file;

import org.junit.Test;

import java.io.File;

/**
 * public string getAbsolutePath():获取绝对路径
 * public string getpath() :获取路径
 * public string getName():获取名称
 * public string getParent():获取上层文件目录路径。若无，返回null
 * public long length():获取文件长度(即:字节数)。不能获取目录的长度。
 * public long lastModified() :获取最后一次的修改时间，毫秒值
 * public string[] list():获取指定目录下的所有文件或者文件目录的名称数组
 * public File[]listFiles():获取指定目录下的所有文件或者文件目录的File数组
 */

public class fileMethods {
    @Test
    public void test2(){
        File file1 = new File("fi1.txt");
        File file2 = new File("D:/idea/other/io/file/fi2.txt");

        System.out.println("--------file1的方法：相对路径下---------");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println(file1.list());
        System.out.println(file1.listFiles());

        System.out.println("--------file2的方法：绝对路径下---------");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        System.out.println(file2.list());
        System.out.println(file2.listFiles());

        /**
         * 目前不存在相应的文件，运行结果：
         * --------file1的方法：相对路径下---------
         * D:\idea\code\javaSenior\IOStream\fi1.txt
         * fi1.txt
         * fi1.txt
         * null
         * 0
         * 0
         * null
         * null
         * --------file2的方法：绝对路径下---------
         * D:\idea\other\io\file\fi2.txt
         * D:\idea\other\io\file\fi2.txt
         * fi2.txt
         * D:\idea\other\io\file
         * 0
         * 0
         * null
         * null
         *
         * Process finished with exit code 0
         */

        /**
         * 存在相应的文件，并且文件中有值：
         * --------file1的方法：相对路径下---------
         * D:\idea\code\javaSenior\IOStream\fi1.txt
         * fi1.txt
         * fi1.txt
         * null
         * 51
         * 1622765904775
         * null
         * null
         * --------file2的方法：绝对路径下---------
         * D:\idea\other\io\file\fi2.txt
         * D:\idea\other\io\file\fi2.txt
         * fi2.txt
         * D:\idea\other\io\file
         * 24
         * 1622766123740
         * null
         * null
         */

    }
}
