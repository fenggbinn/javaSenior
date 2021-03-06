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
 *
 * 如下两个方法适用于文件夹：
 * public string[] list():获取指定目录下的所有文件或者文件目录的名称数组
 * public File[]listFiles():获取指定目录下的所有文件或者文件目录的File数组
 */

public class fileMethods {
    @Test
    public void test1(){
        File file1 = new File("fi1.txt");
        File file2 = new File("D:/idea/other/io/file/fi2.txt");

        System.out.println("--------file1的方法：相对路径下---------");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
//        System.out.println(file1.list());
//        System.out.println(file1.listFiles());

        System.out.println("--------file2的方法：绝对路径下---------");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
//        System.out.println(file2.list());
//        System.out.println(file2.listFiles());

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

    @Test
    public void test2(){
        File file = new File("d:/idea/code/javaSenior");
        //获取文件夹的相对路径（文件夹名）
        System.out.println("-----list-----");
//        System.out.println(file.list());
        String[] list = file.list();
        for (String s :
                list) {
            System.out.println(s);
        }
        //获取文件夹的绝对（完整）路径
        System.out.println("-----listFiles-----");
//        System.out.println(file.listFiles());
        File[] files = file.listFiles();
        for (File fi :
                files) {
            System.out.println(fi);
        }

        /**
         * 运行结果：
         * -----list-----
         * .git
         * .gitignore
         * .idea
         * Collection
         * CommonClasses
         * GenericParadigm
         * IOStream
         * javaSenior.iml
         * jdbc.properties
         * jdbc2.properties
         * Multithreading
         * out
         * README.md
         * src
         * -----listFiles-----
         * d:\idea\code\javaSenior\.git
         * d:\idea\code\javaSenior\.gitignore
         * d:\idea\code\javaSenior\.idea
         * d:\idea\code\javaSenior\Collection
         * d:\idea\code\javaSenior\CommonClasses
         * d:\idea\code\javaSenior\GenericParadigm
         * d:\idea\code\javaSenior\IOStream
         * d:\idea\code\javaSenior\javaSenior.iml
         * d:\idea\code\javaSenior\jdbc.properties
         * d:\idea\code\javaSenior\jdbc2.properties
         * d:\idea\code\javaSenior\Multithreading
         * d:\idea\code\javaSenior\out
         * d:\idea\code\javaSenior\README.md
         * d:\idea\code\javaSenior\src
         */
    }

    @Test
    public void test3(){
//        File file1 = new File("hi.txt");//false,这个文件不存在
        File file1 = new File("fi1.txt");//true,并且此文件没有了
//        File file2 = new File("D:/idea/other/io/file/fi2.txt");//false,这个文件已经存在
        File file2 = new File("D:/idea/other/io/file/fi3.txt");//true，此目录下会产生一个文件，名称是fi3.txt,文件是对fi1.txt的剪切

        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }
}
