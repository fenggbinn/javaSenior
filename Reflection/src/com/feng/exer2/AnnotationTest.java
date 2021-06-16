package com.feng.exer2;

import com.feng.exer.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnnotationTest {
    @Test
    public void getPersonAnnotation(){
        Class<Person> pclass = Person.class;
        Method[] declaredMethods = pclass.getDeclaredMethods();
        for (Method a : declaredMethods) {
//            System.out.println("进入了method的foreach循环里面");
//            System.out.println(a.getAnnotations());
//            System.out.println(a.getAnnotations()[0]);//java.lang.ArrayIndexOutOfBoundsException: 0
            Annotation[] annotations = a.getAnnotations();
            for (Annotation aa : annotations) {
                System.out.println("进入了annotation的foreach循环里面");
                System.out.println(aa);
            }

            /*//1.获取权限修饰符
            System.out.print(Modifier.toString(a.getModifiers())+"\t");
            //2.获取返回值类型
            System.out.print(a.getReturnType().getName()+"\t");
            //3.获取方法名
            System.out.println(a.getName());*/
            //4.形参列表
/*            Class<?>[] parameterTypes = a.getParameterTypes();
            if(!(parameterTypes==null&&parameterTypes.length==0)){
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i==parameterTypes.length-1){
                        System.out.println(parameterTypes[i].getName()+" args_"+i);
                        break;
                    }
                    System.out.println(parameterTypes[i].getName()+" args_"+i+",");
                }
            }*/

            //4.抛出的异常
            Class<?>[] exceptionTypes = a.getExceptionTypes();
            if(!(exceptionTypes==null&&exceptionTypes.length==0)){
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i==exceptionTypes.length-1){
                        System.out.println(exceptionTypes[i].getName()+" args_"+i);
                        break;
                    }
                    System.out.println(exceptionTypes[i].getName()+" args_"+i+",");
                }
            }
        }
    }
}
