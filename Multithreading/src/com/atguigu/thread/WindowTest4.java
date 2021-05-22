package com.atguigu.thread;

import com.sun.org.apache.xpath.internal.objects.XObject;
import jdk.nashorn.internal.ir.CallNode;

/**
 * 使用synchronized 为线程加锁
 */
public class WindowTest4 {
    public static void main(String[] args) {
        Window2 window2 = new Window2();

        Thread thread1 = new Thread(window2);
        thread1.setName("窗口一");

        Thread thread2 = new Thread(window2);
        thread2.setName("窗口二");

        Thread thread3 = new Thread(window2);
        thread3.setName("窗口三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//创建多线程的方式二：实现Runnable接口
class Window4 implements Runnable{
    private int ticket=100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            //为线程加锁 同步代码块
            //synchronized (obj){
            synchronized (this){
                if (ticket > 0){
                    //休息一会
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票，票号为： "+ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}
