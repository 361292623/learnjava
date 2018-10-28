package com.itheima._12注解的解析重点;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/*
* 什么是注解解析
        * 使用Java技术获得注解上数据的过程则称为注解解析。
    与注解解析相关的接口
        * Annotation: 注解类，该类是所有注解的父类。
        * AnnotatedElement:该接口定义了与注解解析相关的方法
             T getAnnotation(Class<T> annotationClass) 根据注解类型获得对应注解对象
         Annotation[]	getAnnotations()
                * 获得当前对象上使用的所有注解，返回注解数组，包含父类继承的
         Annotation[]	getDeclaredAnnotations()
                * 获得当前对象上使用的所有注解，返回注解数组,只包含本类的
         boolean	isAnnotationPresent(Class<Annotation> annotationClass)
                * 判断当前对象是否使用了指定的注解，如
                * 果使用了则返回true，否则false
*
* */
public class TestMain01 {
    public static void main(String[] args) {
        // 获取Book的class对象
        Class<?> bookClazz = Book.class ;
        // 1.判断这个类上是否有注解MyBook
        if(bookClazz.isAnnotationPresent(MyBook.class)){
            // 2.获取这个MyBook注解对象
            //Annotation mybook = bookClazz.getAnnotation(MyBook.class);
            MyBook mybook = bookClazz.getAnnotation(MyBook.class);
            // 3.获取这个注解的全部属性。
            System.out.println(mybook.name());
            System.out.println(Arrays.toString(mybook.authors()));
            System.out.println(mybook.price());
        }
    }
}
