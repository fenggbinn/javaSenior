package com.feng.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream的创建
 */

public class StreamAPITest {

    //创建stream方式一：集合
    @Test
    public void test(){
        List<Employee> employees = EmployeeData.getEmployees();
        //返回一个顺序流
        Stream<Employee> stream = employees.stream();
        //返回一个并行流
        Stream<Employee> parallelEmployeeStream = employees.parallelStream();
    }

    //创建stream方式二：数组
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        IntStream stream = Arrays.stream(arr);

        System.out.println("--------------");

        Employee e1 = new Employee(1001,"tom","男",3);
        Employee e2 = new Employee(1002,"jarry","男",2);
        Employee[] arr2 = new Employee[]{e1,e2};
        Stream<Employee> stream1 = Arrays.stream(arr2);
    }

    //创建stream的方式三：stream的of
    @Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    }

    //创建stream的方式四：创建无限流
    @Test
    public void test4(){
        Stream.iterate(0,t->t+2).limit(11).forEach(System.out::print);

        System.out.println("\n-------------------");

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
