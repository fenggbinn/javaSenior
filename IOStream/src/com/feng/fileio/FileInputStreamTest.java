package com.feng.fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

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
}
