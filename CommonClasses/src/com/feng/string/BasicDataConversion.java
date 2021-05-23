package com.feng.string;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;

public class BasicDataConversion {
    @Test
    public void test(){
        String s1 = "123";
        int num = Integer.parseInt(s1);
        System.out.println("s1: "+s1);//s1: 123
        String s2 = String.valueOf(num);
        System.out.println(num==123);//true
        System.out.println(s2==s1);//false
        System.out.println(s2.equals(s1));//true
        System.out.println(s2.equals(num));//false
    }
}
