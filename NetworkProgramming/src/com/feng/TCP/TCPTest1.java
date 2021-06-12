package com.feng.TCP;

import com.feng.IP_InetAddress.InetAddressTest;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest1 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("localhost");
            socket = new Socket(inet,8085);
            os = socket.getOutputStream();
            os.write("你太坏，我是socket创建的OutputStream对象的write方法".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        try {
            serverSocket = new ServerSocket(8085);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            byte[] bytes = new byte[4];
            int len;
            while ((len = inputStream.read(bytes))!=-1){
                String str = new String(bytes,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                socket.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
