package com.feng.fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * —、流的分类:
 * 1.操作数据单位:字节流、字符流2.数据的流向:输入流、输出流3.流的角色:节点流、处理流
 * 二、流的体系结构
 * 抽象基类         节点流（文件流）         缓冲流（处理流的一种）
 * InputStream    FileInputstream       BufferedInputStream
 * outputstream   Fileoutputstream      BufferedOutputStream
 * Reader         FiLeReader            BufferedReader
 * writer         Filewriter            BufferedWriter

 二、方法的四步：
 1.File类的实例化
 2.FileReader流的实例化
 3.读入的操作
 4.资源的关闭

 */
public class FileReaderWriterTest {
    @Test
    //方式一：throws Exception
//    public void test1() throws Exception {
    //方式二：try catch
    public void test1(){
        FileReader reader=null;
        try {
            File file = new File("hi.txt");

            reader = new FileReader(file);
        /*int read = reader.read();
        while (read!=-1){
            System.out.print((char) read);
            read = reader.read();
        }
        reader.close();*/
            int read;
            while ((read=reader.read())!=-1){
                System.out.print((char) read);
    //            read = reader.read();
            }
//            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }

    }

    /**
     * 使用read的重载方法对read()升级
     *char[]数组，字符流，数据存放到数组中，每次读取更多，效率更高
     * 二、方法的四步：
     *  1.File类的实例化
     *  2.FileReader流的实例化
     *  3.读入的操作
     *  4.资源的关闭
     */
    @Test
    public void test2(){
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] cbuffer = new char[5];
            int len;
            while ((len=fr.read(cbuffer))!=-1){
                //fileReader的重载方法的第一种方式：for循环遍历存入char[]数组中的值
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuffer[i]);
//                }
                String str = new String(cbuffer,0,len);
                System.out.print(str);
//                System.out.println(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }

        }

    }
}
