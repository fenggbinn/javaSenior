package com.feng.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OtherTest {
    @Test
    public void test1(){
        //映射
        List<String> strings = Arrays.asList("aa", "bb", "cc");
        strings.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
    }
}
