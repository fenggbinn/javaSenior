package com.feng.annotation;

public @interface MyAnnotation {
//    String value();
    String value() default "hello";
}
