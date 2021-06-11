package com.feng.IP_InetAddress;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    @Test
    public void test1() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("192.168.124.1");
        System.out.println(inetAddress);
        InetAddress localhost = InetAddress.getByName("127.0.0.1");
        System.out.println(localhost);
        InetAddress localhost2 = InetAddress.getLocalHost();
        System.out.println(localhost2);
        System.out.println("----两个常用方法----");
        System.out.println(localhost2.getHostAddress());
        System.out.println(localhost2.getAddress());

    }
}
