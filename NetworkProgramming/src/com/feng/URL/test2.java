package com.feng.URL;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class test2 {
    @Test
    public void DownloadPicture(){
        InputStream is=null;
        FileOutputStream fo = null;
        try {
            URL url = new URL("https://lupic.cdn.bcebos.com/20191203/3015714485_14.jpg");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.connect();
            is = con.getInputStream();

//            fo = new FileOutputStream("d:/idea/code/javaSenior/NetworkProgramming/src/com/feng/URL/test2/downloadpicture1.jpg");
            fo = new FileOutputStream("downloadpicture1.jpg");
            byte[] bytes = new byte[1024];
            int len;
            while ((len=is.read(bytes))!=-1){
                fo.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                is.close();
                }
                if (fo != null) {
                    fo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
