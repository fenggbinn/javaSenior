package com.feng.fileio;

import org.junit.Test;

import java.io.*;

//使用流对图片复制加密
public class EncryptionPicture {
    @Test
    public void test1(){
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(new File("01_io.png")));
            bo = new BufferedOutputStream(new FileOutputStream(new File("security.png")));

            byte[] bytes = new byte[1024];
            int len;

            while ((len=bi.read(bytes))!=-1){
                for (int i = 0; i < len; i++) {
                    bytes[i] = (byte)(bytes[i]^5);
                }
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
        }


    }
}
