package com.feng.genericClass;

/**
 * 泛型类
 * 类<T>
 *     这里面的T代表占位，到时候可以根据具体需要实现对应的泛型，
 *     如：String，Integer等等
 * @param <T>
 */
public class Order<T> {
    private String OrderName;
    private int OrderId;
    private T OrderT;

    @Override
    public String toString() {
        return "Order{" +
                "OrderName='" + OrderName + '\'' +
                ", OrderId=" + OrderId +
                ", OrderT=" + OrderT +
                '}';
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public T getOrderT() {
        return OrderT;
    }

    public void setOrderT(T orderT) {
        OrderT = orderT;
    }

    public Order(String orderName, int orderId, T orderT) {
        OrderName = orderName;
        OrderId = orderId;
        OrderT = orderT;
    }

    public Order() {
    }
}
