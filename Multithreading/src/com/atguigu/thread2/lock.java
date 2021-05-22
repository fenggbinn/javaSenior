package com.atguigu.thread2;


import java.util.concurrent.locks.ReentrantLock;

public class lock {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");
        window1.start();
        window2.start();
        window3.start();
    }
}

//创建多线程的方式一：继承Thread类
class Window1 extends Thread{
    private static int ticket = 100;//使用static关键字使票数始终是100张，
    private static Object obj = new Object();

    /**
     * lock
     */
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
//            show();
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
            finally{
                lock.unlock();
            }
        }
    }

    /*private void show() {
        //synchronized (this){
        synchronized (obj){
            if (ticket > 0){
                //休息一会
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖票，票号为： "+ticket);
                ticket--;
            }
        }
    }*/

    /*private static synchronized void show() {
        //synchronized (this){
        //synchronized (obj){
            if (ticket > 0){
                //休息一会
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖票，票号为： "+ticket);
                ticket--;
            }
        //}
    }*/

    /**
     * 下面的使用lock对线程加锁
     * 202105211111
     */
   /* private static void show() {
        //synchronized (this){
        //synchronized (obj){
        lock.lock();
        if (ticket > 0){
            //休息一会
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票，票号为： "+ticket);
            ticket--;
        }
        //}
    }*/
}
