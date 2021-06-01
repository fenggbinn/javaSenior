package com.feng.genericMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class test1 {
    @Test
    public void test1(){
//        <T> T[] = new <T>;
//        List<String> list = new ArrayList<>();
//        E[] arr = new E[];
        Integer[] ints = new Integer[]{1,2,5};
        List<Integer> es = testGenericMethod(ints);
    }
    public <E> List<E> testGenericMethod(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e :
                arr) {
            list.add(e);
        }
        return list;
    }
}
