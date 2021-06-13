package com.feng.URL;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 * 1.URL:统一资源定位符，对应着互联网的某一资源地址2.格式:
 * http://Localhost:8080/examples/beauty.jpg?username=Tom
 * 协议    主机名     端口号  资源地址            参数列表
 */
public class test1 {
    @Test
    public void test1(){
        try {
            URL url = new URL("https://www.bilibili.com/video/BV1Kb411W75N?p=629&spm_id_from=pageDriver");

//            一个URL对象生成后，其属性是不能被改变的，但可以通过它给定的方法来获取这些属性:
//                  >public String getProtocol( )
            System.out.println(url.getProtocol());//            获取该URL的协议名
//                    >public String getHost( )
            System.out.println(url.getHost());//            获取该URL的主机名
//                    >public String getPort( )
            System.out.println(url.getPort());//            获取该URL的端口号
//                    >public String getPath( )
            System.out.println(url.getPath());//            获取该URL的文件路径
//            public String geFile( )
            System.out.println(url.getFile());//            获取该URL的文件名
//                    >public String getQuery( )
            System.out.println(url.getQuery());//            获取该URL的查询名

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
