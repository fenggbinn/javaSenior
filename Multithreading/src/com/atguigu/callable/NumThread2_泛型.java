package com.atguigu.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class NumThread2_泛型 {
    public static void main(String[] args) {
        ThreadNew threadNew = new ThreadNew();
        FutureTask<Integer> futureTask = new FutureTask<>(threadNew);
        new Thread(futureTask).start();
        try{
            int sum = futureTask.get();
            System.out.println("总和为："+sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ThreadNew2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}