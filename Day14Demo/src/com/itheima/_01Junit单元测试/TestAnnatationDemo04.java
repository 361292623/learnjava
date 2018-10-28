package com.itheima._01Junit单元测试;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/*
* 研究四个注解的作用！
*
*
* */
public class TestAnnatationDemo04 {

    private static LoginDemo02 login ;

    // 测试之前执行！
    @BeforeClass
    public static void loginCreate(){
        System.out.println("测试之前初始化login对象！！");
        login = new LoginDemo02();
    }

    @Test
    public void testSing(){
        login.sing();
    }

    @Test
    public void testRun(){
        login.run();
    }

    @AfterClass
    public static void close(){
        System.out.println(login+"对象关闭");
    }
}
