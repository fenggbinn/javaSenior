package com.feng.java;

import com.feng.annotation.MyAnnotation;

//@MyAnnotation
//@MyAnnotation("000")
@MyAnnotation(value = "abc")
public class Goods implements Comparable {
    private int gid;
    private String gname;
    private Double price;

    public Goods(int gid, String gname, Double price) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
    }

    public Goods() {
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                '}';
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods)o;
            if (this.price>goods.price){
                return 1;
            }else if (this.price<goods.price){
                return -1;
            }else{
                return 0;
            }
        }
        return -2;
    }
}
