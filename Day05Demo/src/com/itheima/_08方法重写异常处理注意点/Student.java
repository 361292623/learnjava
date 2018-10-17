package com.itheima._08方法重写异常处理注意点;

import java.text.ParseException;

/*
* 子类重写父类的方法
* 与父类的方法结果保持完全一致：这是规范。
*
* 方法重写时异常处理注意事项(针对编译时异常)
*    子类方法抛出的异常应该小于或者等于父类的异常。
*
* */
public class Student extends People {
    @Override
    public void run() throws ParseException{
        System.out.println("学生跑的飞快！！");
    }
}
