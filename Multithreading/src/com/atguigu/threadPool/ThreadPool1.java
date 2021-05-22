package com.atguigu.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new ThreadRunnable());//适合适用于Runnable

        service.shutdown();//关闭连接池
    }
}

class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
