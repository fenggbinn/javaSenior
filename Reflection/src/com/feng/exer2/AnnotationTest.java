package com.feng.exer2;

import com.feng.exer.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    @Test
    public void getPersonAnnotation(){
        Class<Person> pclass = Person.class;
        Method[] declaredMethods = pclass.getDeclaredMethods();
        for (Method a : declaredMethods) {
            System.out.println("进入了method的foreach循环里面");
//            System.out.println(a.getAnnotations());
//            System.out.println(a.getAnnotations()[0]);//java.lang.ArrayIndexOutOfBoundsException: 0
            Annotation[] annotations = a.getAnnotations();
            for (Annotation aa : annotations) {
                System.out.println("进入了annotation的foreach循环里面");
                System.out.println(aa);
            }
        }
    }
}
