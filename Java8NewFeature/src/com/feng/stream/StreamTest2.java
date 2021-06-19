package com.feng.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
       /* stream.filter(e -> e.getAge()>18).forEach(System.out::println);

        System.out.println("---------------");

        employees.stream().limit(2).forEach(System.out::println);

        System.out.println("----------------");

        employees.stream().skip(3).forEach(System.out::println);

        System.out.println("----------------");*/

        employees.stream().distinct().forEach(System.out::println);
    }
}
