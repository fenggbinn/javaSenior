package com.feng.RandomAccessFileTest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test2 {
    @Test
    public void test() throws IOException {
            RandomAccessFile f = new RandomAccessFile("randomAccessFile2.txt","rw");
            f.write(("今天是2021-06-11 10:53 晴 星期五").getBytes());
            f.close();
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile f = new RandomAccessFile("randomAccessFile2.txt","rw");
        f.write(("明天").getBytes());
        f.close();
    }
}
