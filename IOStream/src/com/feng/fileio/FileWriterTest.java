package com.feng.fileio;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    @Test
    public void test1(){
        FileWriter fw = null;
        try {
//            fw = new FileWriter(new File("writerTest1.txt"));//文件不存在，fileWriter方法会自动创建
            fw = new FileWriter(new File("writerTest1.txt"),true);
            fw.write("下的雨太小了，还以为要下大雨呢\n");
            fw.write("黑云压得好低啊\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }

        }

    }
}
