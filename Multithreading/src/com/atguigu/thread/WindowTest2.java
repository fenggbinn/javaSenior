package com.atguigu.thread;

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Thread thread1 = new Thread(window2);
        thread1.setName("窗口一");
        thread1.start();
        Thread thread2 = new Thread(window2);
        thread2.setName("窗口二");
        thread2.start();
        Thread thread3 = new Thread(window2);
        thread3.setName("窗口三");
        thread3.start();
    }
}

//创建多线程的方式二：实现Runnable接口
class Window2 implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖票，票号为： "+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
