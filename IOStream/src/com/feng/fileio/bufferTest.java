package com.feng.fileio;

import org.junit.Test;

import java.io.*;

public class bufferTest {
    @Test
    public void test1(){
        FileInputStream fi1 = null;
        FileOutputStream fo1 = null;
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            File file1 = new File("buffer1.png");
            File file2 = new File("buffer2.png");
            fi1 = new FileInputStream(file1);
            fo1 = new FileOutputStream(file2);
            bi = new BufferedInputStream(fi1);
            bo = new BufferedOutputStream(fo1);

            byte[] bytes = new byte[10];
            int len;
            while ((len=bi.read(bytes))!=-1){
                bo.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bi!=null){
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bo!=null){
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fi1!=null){
                try {
                    fi1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fo1!=null){
                try {
                    fo1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
