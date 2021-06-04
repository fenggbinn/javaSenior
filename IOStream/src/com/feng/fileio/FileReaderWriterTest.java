package com.feng.fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * —、流的分类:
 * 1.操作数据单位:字节流、字符流2.数据的流向:输入流、输出流3.流的角色:节点流、处理流
 * 二、流的体系结构
 * 抽象基类         节点流（文件流）         缓冲流（处理流的一种）
 * InputStream    FileInputstream       BufferedInputStream
 * outputstream   Fileoutputstream      BufferedOutputStream
 * Reader         FiLeReader            BufferedReader
 * writer         Filewriter            BufferedWriter

 */
public class FileReaderWriterTest {
    @Test
    public void test1() throws Exception {
        File file = new File("hi.txt");
        FileReader reader = new FileReader(file);
        int read = reader.read();
        while (read!=-1){
            System.out.print((char) read);
            read = reader.read();
        }
        reader.close();
    }
}
