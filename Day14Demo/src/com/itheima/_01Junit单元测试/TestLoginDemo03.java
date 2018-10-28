package com.itheima._01Junit单元测试;

import org.junit.*;

/*
* 测试类
*
* */
public class TestLoginDemo03 {

    // 每个方法测试之前都会先执行这个方法
    @Before // 修饰实例方法
    public void beforeTest(){
        System.out.println("==before==");
    }

    // 每个方法测试之后都会先执行这个方法
    @After // 修饰实例方法
    public void afterTest(){
        System.out.println("==After==");
    }

    // 每个方法测试之前都会先执行这个方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("==beforeClass==");
    }

    // 每个方法测试之后都会先执行这个方法
    @AfterClass
    public static void AfterClass(){
        System.out.println("==AfterClass==");
    }

    // 测试方法
    // 测试方法：必须加上@Test注解
    //         必须public void ，不能有返回值。不能有形参。
    @Test
    public void testLogin(){
        String rs = LoginDemo02.login("admin","003197");
        /*
          断言:
        * 参数一：错误提示
        * 参数二：预期结果
        * 参数三：被测试方法的结果
        * */
        Assert.assertEquals("期望值和实际值不一致","success",rs);
    }

    @Test
    public void testChu(){
        LoginDemo02.chu(10,2);
    }

}
