package com.feng.fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    @Test
    public void test1(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(new File("hi.txt"));
            fw = new FileWriter(new File("writerTest2.txt"));
            //普通文件可以使用char[]字符存储
            char[] cbuffer = new char[1024];
            int len;
            while ((len=fr.read(cbuffer))!=-1){
                String str = new String(cbuffer);
                fw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr!=null){
                fr.close();
                }
                if (fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
