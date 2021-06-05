package com.feng.fileio.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 3.获取文本上每个字符出现的次数
 * 提示: 遍历文本的每一个字符;
 *      字符及出现的次数保存在Map中;
 *      将Map中数据写入文件。
 */
public class GetCountOfChar {
    @Test
    public void test1(){
        FileReader fileReader = null;
        FileWriter fw = null;
        try {
            fileReader = new FileReader(new File("testCount.txt"));
            Map<Character,Integer> map = new HashMap<>();
            char[] chars = new char[1024];
            int len;
            while ((len=fileReader.read(chars))!=-1){
                for (int i = 0; i < len; i++) {
                    char c = chars[i];
    //                if (map.containsKey(c)){
                    if (map.get(c)!=null){
                        map.put(c,map.get(c)+1);
                    }else {
                        map.put(c,1);
                    }
                }
            }

            fw = new FileWriter(new File("getCount.txt"));
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry:
            entries){
                switch (entry.getKey()){
                    case ' ':
                        fw.write("空格: "+entry.getValue());
                        break;
                    case '\t':
                        fw.write("tab键: "+entry.getValue());
                        break;
                    case '\n':
                        fw.write("换行: "+entry.getValue());
                        break;
                    case '\r':
                        fw.write("回车: "+entry.getValue());
                        break;
                    default:
                        fw.write(entry.getKey()+": "+entry.getValue());
                        break;
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
