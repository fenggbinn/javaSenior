package com.feng.fileBufferio;

import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    @Test
    public void test1(){
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
            isr = new InputStreamReader(fis,"UTF-8");
//            isr = new InputStreamReader(fis,"gbk");

            char[] chars = new char[10];
            int len;
            while ((len=isr.read(chars))!=-1){
                String str = new String(chars,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
