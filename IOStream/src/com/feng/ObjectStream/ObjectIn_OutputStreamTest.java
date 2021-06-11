package com.feng.ObjectStream;

import org.junit.Test;

import java.io.*;

public class ObjectIn_OutputStreamTest {
    @Test
    public void test1(){
        //ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            //ois = new ObjectInputStream(new FileInputStream("hello.txt"));
            oos = new ObjectOutputStream(new FileOutputStream("oos.dat"));
//            byte[] chars = new byte[10];
//            int len;
//            while ((len=ois.read(chars))!=-1) {
//                oos.write(chars,0,len);
//            }
            oos.writeObject(new String("kdf看看"));
            oos.writeObject(new Person(101,"留白",99,"女"));//java.io.NotSerializableException: com.feng.ObjectStream.Person
            oos.writeObject(new String("test对象流的读取方式"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                if (ois != null) {
//                    ois.close();
//                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("oos.dat"));
            Object o = null;
            Person person=null;
            //Person person2=null;
            String str=null;
            try {
                o = ois.readObject();
                person = (Person)ois.readObject();
                /**
                 * java.lang.ClassCastException: java.lang.String cannot be cast to com.feng.ObjectStream.Person
                 */
                //person2 = (Person)ois.readObject();
                /**
                 * kdf看看
                 * Person{id=101, name='留白', age=99, gender='女'}
                 * test对象流的读取方式
                 */
                str = (String)ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println((String)o);
            System.out.println(person);
           // System.out.println(person2);
            System.out.println(str);
            /*int len;
            byte[] bytes = new byte[10];
            while ((len=ois.read(bytes))!=-1){
                String str = new String(bytes,0,len);
                System.out.println(str);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
