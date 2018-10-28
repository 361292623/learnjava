package com.itheima._06反射_获取Method方法对象;

import java.lang.reflect.Method;

/*
* 获取方法，然后调用方法。
*    方法属于对象的或者类的
*
* Object invoke(Object obj, Object... args)
      调用指定对象obj的该方法
      args：调用方法时传递的参数
* void setAccessible(true)
     设置是否取消权限检查，true取消权限检查，false表示不取消(暴力反射)
* */
public class MethodDemo02 {
    public static void main(String[] args) throws Exception {
          Class<?> stuClazz = Student.class ;
          // 获取静态方法
          Method test = stuClazz.getDeclaredMethod("test");
          // stuClazz：方法去触发自己在Student.class中自己方法的执行！
          test.invoke(stuClazz);

          // 获取实例方法
          Student stu = new Student("孙悟空",1111,"98期");
          Method sing = stuClazz.getDeclaredMethod("sing");
          sing.invoke(stu);

          Method sing1 = stuClazz.getDeclaredMethod("sing",String.class);
          String rs = (String) sing1.invoke(stu,"青藏高原");
          System.out.println(rs);


    }
}
