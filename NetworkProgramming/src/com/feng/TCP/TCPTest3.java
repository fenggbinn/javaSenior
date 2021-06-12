package com.feng.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest3 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        FileInputStream f = null;
        InputStream inputStream = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),8083);
            os = socket.getOutputStream();
            /*File file = new File("d:\\test\\javaSenior\\NetworkProgramming");
            if (!file.isDirectory()){
                file.mkdir();
            }
            f = new FileInputStream(file+"\\001.png");*/
            f= new FileInputStream("d:/test/001.png");
            byte[] b = new byte[1024];
            int len;
            while ((len=f.read(b))!=-1){
                os.write(b,0,len);
            }

            //判断图片已经传输完
            //socket.shutdownInput();
            /**
             * java.net.SocketException: Socket input is shutdown
             * 	at java.net.Socket.getInputStream(Socket.java:907)
             * 	at com.feng.TCP.TCPTest3.client(TCPTest3.java:35)
             */
            //接收服务器发送的反馈信息
            inputStream = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] b2 = new byte[1024];
            int len2;
            while ((len2=inputStream.read(b2))!=-1){
                baos.write(b2,0,len2);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (os != null) {
                    os.close();
                }
                if (socket != null) {
                    socket.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server(){
        ServerSocket ss = null;
        Socket accept = null;
        InputStream in = null;
        FileOutputStream fo = null ;
        OutputStream outputStream=null;
        byte[] b = new byte[0];
        try {
            ss = new ServerSocket(8083);
            accept = ss.accept();
            in = accept.getInputStream();
            /*File file = new File("d:\\test\\javaSenior\\NetworkProgramming");
            if (!file.isDirectory()){
                file.mkdir();
            }
            fo = new FileOutputStream(file+"\\001_out.png");*/
            fo = new FileOutputStream("d:/test/001_out_反馈.png");
            b = new byte[1024];
            int len;
            while ((len=in.read(b))!=-1){
                fo.write(b,0,len);
            }

            //图片传输完，进行反馈信息的发送
            outputStream = accept.getOutputStream();
            outputStream.write("图片我收到了".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (b != null) {
                    b.clone();
                }
                if (fo != null) {
                    fo.close();
                }
                if (in != null) {
                    in.close();
                }
                if (accept != null) {
                    accept.close();
                }
                if (ss != null) {
                    ss.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
