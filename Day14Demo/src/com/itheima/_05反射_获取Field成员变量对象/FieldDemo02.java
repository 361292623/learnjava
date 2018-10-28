package com.itheima._05反射_获取Field成员变量对象;

import java.lang.reflect.Field;

/*
* 成员 变量赋值和取值:必须有对象！！
* 反射是会破坏封装性的。
*    void  set(Object obj, Object value)
*    Object get(Object obj)
 * */
public class FieldDemo02 {
    public static void main(String[] args) throws Exception {
        Student stu = new Student("孙悟空",1111,"98期");

        Class<?> stuClazz = stu.getClass(); // Student.class
        // 获取了成员变量
        // // Student.class -> name
        Field nameF = stuClazz.getDeclaredField("name");
        nameF.setAccessible(true);

        // 赋值 stu.setName -> nameF.set(stu,值)
        nameF.set(stu,"猪八戒");


        // 取值
        // 参数：所在对象！
        String nameFValue = (String) nameF.get(stu);
        System.out.println(nameFValue);

        System.out.println(stu);
    }
}
