package com.atguigu.thread;

public class WindowTest7_继承 {
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
class Window7 extends Thread{
    private static int ticket = 100;//使用static关键字使票数始终是100张，
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            show();
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

    private static synchronized void show() {
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
    }
}
