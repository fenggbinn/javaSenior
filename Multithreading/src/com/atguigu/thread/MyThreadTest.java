package com.atguigu.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        /*for (int i = 0; i < 100; i++) {
            System.out.println(i+"----main---");
        }*/
        myThread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}