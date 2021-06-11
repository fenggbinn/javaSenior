package com.feng.RandomAccessFileTest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test2 {
    @Test
    public void test() throws IOException {
            RandomAccessFile f = new RandomAccessFile("randomAccessFile2.txt","rw");
            f.write(("今天是2021-06-11 10:53 晴 星期五").getBytes());
            f.close();
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile f = new RandomAccessFile("randomAccessFile2.txt","rw");
        f.write(("明天").getBytes());
        f.close();
    }

    @Test//调用seek方法，指定插入位置
    public void test3() throws IOException {
        RandomAccessFile f = new RandomAccessFile("randomAccessFile2.txt","rw");
        f.seek(2);
        f.write(("明天").getBytes());
        f.close();
    }

    @Test//在中间添加
    public void test4(){
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("randomAccessFile3.txt","rw");
            file.seek(3);   //指针指向3这个位置，保存后面的值到StringBuilder；
            StringBuilder builder = new StringBuilder((int) new File("randomAccessFile3.txt").length());
            byte[] bytes = new byte[1024];
            int len;
            while((len=file.read(bytes))!=-1){
                builder.append(new String(bytes,0,len));
            }
            file.seek(3);//刚刚保存文件到builder的时候把指针指向到了末尾了，重新指向3开始添加
            file.write("123".getBytes());
            //现在指针就是在添加好的值的末尾
            file.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
