package com.feng.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest2 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        FileInputStream f = null;
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
            fo = new FileOutputStream("d:/test/001_out.png");
            b = new byte[1024];
            int len;
            while ((len=in.read(b))!=-1){
                fo.write(b,0,len);
            }
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
