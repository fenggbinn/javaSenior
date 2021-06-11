package com.feng.RandomAccessFileTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class test1 {
    @Test
    public void test(){
        RandomAccessFile raf = null;
        RandomAccessFile raf2 = null;
        try {
            raf = new RandomAccessFile(new File("hello.txt"),"r");
            raf2 = new RandomAccessFile(new File("RandomAccessFileWrite.txt"),"rw");
            byte[] bytes = new byte[1024];
            int len;
            while ((len=raf.read(bytes))!=-1){
                raf2.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (raf != null) {
                raf.close();
                }
                if (raf2 != null) {
                    raf2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
