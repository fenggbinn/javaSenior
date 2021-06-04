package com.feng.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * File类的创建功能
 * public boolean createNewFile():创建文件。若文件存在，则不创建，返回falsepublic boolean mkdir():创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
 * public boolean mkdirs():创建文件目录。如果上层文件目录不存在，一并创建注意事项:如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目路径下。
 * File类的删除功能
 * public boolean delete():删除文件或者文件夹删除注意事项:T
 * Java中的删除不走回收站。
 * 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
 */
public class FileCreate {
    @Test
    public void test1() throws IOException {
//        File file = new File("hi.txt");//存在的文件，不创建返回false。
        File file = new File("hello.txt");//文件不存在，创建新的文件，返回true。
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

    @Test
    public void test2() throws Exception{
        File file = new File("other");//在IOStream文件目录下创建other文件夹
        boolean newFile = file.createNewFile();//idea项目中相对路径创建的不是文件夹
        System.out.println(newFile);
        System.out.println("-------------------");
        File file2 = new File("D:/idea/code/javaSenior/IOStream/other2");//在IOStream文件目录下创建other文件夹
        boolean newFile2 = file2.createNewFile();//idea项目中绝对路径创建的不是文件夹
        System.out.println(newFile2);
        System.out.println("--------------------");
        File file3 = new File("D:/idea/other/io/fileCreate");//在IOStream文件目录下创建other文件夹
        boolean newFile3 = file3.createNewFile();//idea项目中绝对路径创建的不是文件夹
        System.out.println(newFile3);
    }

    //创建文件目录的方法调用错误了：调用了创建文件的方法，应该调用创建文件目录的方法：mkdir，mkdirs
    //下面的才是真正的创建文件目录
    @Test
    public void test3(){
        File file = new File("other");
        if (!file.exists()){
            file.mkdir();//创建文件目录
            System.out.println("文件目录创建成功了");
        }else {
            file.delete();//删除文件目录
            System.out.println("文件目录删除成功");
        }
    }

    @Test
    public void test4(){
        File file = new File("d:/idea/other/io/filetest/filell");
        boolean mkdirs = file.mkdirs();//mkdirs()创建多级目录，当层级目录不存在，可以直接创建，mkdir()不能创建多级目录
        System.out.println(mkdirs);
    }
}
