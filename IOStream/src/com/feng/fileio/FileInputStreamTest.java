package com.feng.fileio;

import org.junit.Test;

import java.io.*;

/**
 * 结论:|
 * 1．对于文本文件( .txt,.java,.c,.cpp)，使用字符流处理
 * 2．对于非文本文件(.jpg,.mp3 ,.mp4 ,.avi,.doc,.ppt,...)，使用字节流处理
 */
public class FileInputStreamTest {
    @Test
    public void test1(){
       //使用FileInputStream不适合读取文本文件，文本文件最好使用字符流
        FileInputStream fi = null;
        try {
            File file = new File("hi.txt");
            fi = new FileInputStream(file);
//            byte[] bytes = new byte[4];//使用FileInputStream不适合读取文本文件，文本文件最好使用字符流
            byte[] bytes = new byte[1024];
            int len;
            while ((len=fi.read(bytes))!=-1){
                String str = new String(bytes,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //使用FileInputStream适合读取图片等等类型文件
    @Test
    public void test2(){

        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            File file = new File("01_io.png");
            File file2 = new File("02_io.png");
            fi = new FileInputStream(file);
            fo = new FileOutputStream(file2);//第一次忘记写这一句实例化fo对象，报了空指针异常
//            byte[] bytes = new byte[4];//使用FileInputStream不适合读取文本文件，文本文件最好使用字符流
            byte[] bytes = new byte[5];
            int len;
            while ((len=fi.read(bytes))!=-1){
//                String str = new String(bytes,0,len);
//                System.out.print(str);
                fo.write(bytes,0,len);
                /**
                 * ava.lang.NullPointerException
                 * 	at com.feng.fileio.FileInputStreamTest.test2(FileInputStreamTest.java:57)
                 * 	...
                 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fo!=null){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
