package com.feng.file;

import org.junit.Test;

import java.io.File;

/**
 * public booLean isDirectory():判断是否是文件目录
 * public boolean isFile() :判断是否是文件
 * public booLean exists() :判断是否存在
 * public boolean canRead() :判断是否可读
 * public boolean canwrite() :判断是否可写
 * public boolean isHidden() :判断是否隐藏
 */
public class fileMethodsJudge {
    @Test
    public void test1(){
        File file = new File("kk.txt");
        File file2 = new File("D:/idea/other/io/file");
        System.out.println(file.isDirectory());
        System.out.println(file2.isDirectory());
    }
}
