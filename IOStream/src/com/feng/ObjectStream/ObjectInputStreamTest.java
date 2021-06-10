package com.feng.ObjectStream;

import org.junit.Test;

import java.io.*;

public class ObjectInputStreamTest {
    @Test
    public void test1(){
        //ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            //ois = new ObjectInputStream(new FileInputStream("hello.txt"));
            oos = new ObjectOutputStream(new FileOutputStream("oos.dat"));
//            byte[] chars = new byte[10];
//            int len;
//            while ((len=ois.read(chars))!=-1) {
//                oos.write(chars,0,len);
//            }
            oos.writeObject(new String("kdf看看"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                if (ois != null) {
//                    ois.close();
//                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
