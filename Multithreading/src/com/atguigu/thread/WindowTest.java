package com.atguigu.thread;

public class WindowTest {
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
class Window extends Thread{
    private static int ticket = 100;//使用static关键字使票数始终是100张，多个线程调用也不会增加
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(getName()+"卖票，票号为： "+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
