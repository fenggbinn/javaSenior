package com.feng.exer;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(101,18,"雨晴"));
        dao.save("1002",new User(102,19,"云亿"));
        dao.save("1003",new User(103,17,"空鹤"));
        dao.save("1004",new User(104,16,"应来"));

        dao.update("1004",new User(104,26,"看看"));

        dao.delete("1002");
        List<User> list = dao.list();
        list.forEach(System.out::println);
    }
}
