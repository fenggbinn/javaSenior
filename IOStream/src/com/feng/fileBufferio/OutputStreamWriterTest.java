package com.feng.fileBufferio;

import org.junit.Test;

import java.io.*;

public class OutputStreamWriterTest {
    @Test
    public void test1(){
        //使用InputStreamReader根据文件的字符集读取文件内容，使用OutputStreamWriter写入想保存的字符类型文件
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            isr = new InputStreamReader(new FileInputStream("hello.txt"),"utf-8");
            osw = new OutputStreamWriter(new FileOutputStream("outputstreamwriter.txt"),"gbk");
            char[] chars = new char[10];
            int len;
            while ((len=isr.read(chars))!=-1){
                String str = new String(chars,0,len);
                System.out.print(str);
                osw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(isr!=null){
                    isr.close();
                }
                if(osw!=null){
                    osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
