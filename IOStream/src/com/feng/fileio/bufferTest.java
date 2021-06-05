package com.feng.fileio;

import org.junit.Test;

import java.io.*;

public class bufferTest {

    /**
     * BufferedInputStream
     * BufferedOutputStream
     */
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

    /**
     * BufferedReader
     * BufferedWriter
     */
    @Test
    public void test2(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("bufferReader1.txt")));
            bw = new BufferedWriter(new FileWriter(new File("bufferWriter1.txt")));

            char[] c = new char[1024];
            //方式一：
            /*int len;
            while ((len = br.read(c))!=-1){
                String str = new String(c,0,len);
                bw.write(str);
            }*/
            //方式二：
            String string;
            while ((string = br.readLine())!= null){
//                String str = new String(c,0,len);
//                bw.write(string);//这个不包含换行符
                //添加换行方法一：
//                bw.write(string+"\n");//这个不包含换行符
                //添加换行方法二：
                bw.write(string);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
