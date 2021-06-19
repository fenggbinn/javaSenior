package com.feng.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"晴天","女",19));
        list.add(new Employee(102,"雨天","女",18));
        list.add(new Employee(103,"阴天","女",18));
        list.add(new Employee(103,"阴天","女",18));
        list.add(new Employee(104,"多云","男",28));
        list.add(new Employee(105,"冰雹","男",33));
        return list;
    }
}
