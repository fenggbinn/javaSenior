package com.atguigu.exer;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}

/**
 * 输出100以内的偶数
 */
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}

/**
 * 输出100以内的奇数
 */
class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}