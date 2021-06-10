package com.feng.exer;

import org.junit.Test;

import java.io.*;

/**
 *
 * 1.标准的输入、输出流1.1
 * System.in:标准的输入流，默认从键盘输入System.out:标准的输出流，默认从挖制台输出1.2
 * system类的setIn(InputStream is) / setout(PrintStream ps)方式重新指定输入和输出的流。
 * 1.3练习:
 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，直至当输入"e”或者"exit”时，退出程序。
 * 方法一:使用Scanner实现，调用next()返回一个字符串
 * 方法二:使用System.in实现。System.in--->转换流--->BufferedReader的readLine()
 */

public class SystemInTest {
    @Test
    public void test1(){
        BufferedReader bis = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            bis = new BufferedReader(isr);
            System.out.println("请在控制台输入值：");
            while(true){
                String str = bis.readLine();
                if ("e".equalsIgnoreCase(str)||"exit".equalsIgnoreCase(str)){
                    System.out.println("退出输入");
                    break;
                }
                System.out.println("输入结果：\n"+str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
