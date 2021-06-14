package com.feng.UDP;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class test1 {
    @Test
    public void sender() throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getByName("localhost");
        String str = "今天是2021-06-13 11:16  今天晴天，很热";
        byte[] bytes = str.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,ia,9090);
        ds.send(datagramPacket);
        ds.close();
    }

    @Test
    public void receiver() throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        byte[] buffer = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(buffer,0,buffer.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
    }
}
