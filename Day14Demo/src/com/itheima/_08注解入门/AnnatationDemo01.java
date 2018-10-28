package com.itheima._08注解入门;
/*
* 注解：
*   - 注解是新技术必须具备的形式。
*   - 注解是JDK1.5的新特性。
    - 注解相当一种标记，是类的组成部分，可以给类携带一些额外的信息。
    - 标记(注解)可以加在包，类，成员变量，方法，方法参数以及局部变量上。
       接口。
  常用注解及其：
    - 1.生成帮助文档：@param @return
    - 2.编译检查：@Override
    - 3.框架的配置(框架=代码+配置)  @Test


*
*/
/**
 *  文档注释：后期方法类上的注释都应该用文档注释，
 *  成员变量，方法的注释都应该用文档注释，最专业的
 *  而且文档注释的内容是可以提取到开发文档中去的。
 *
 * @author dlei
 * @version 1.0
 * @from http://www.itheim.com
 * @qq 251425887
 * @tel 18665616520
 * @desc 这是一个注解类来测试文档注释
 */
public class AnnatationDemo01 {
    /**
    *  这是一个main方法
    *  这是dlei写的牛逼的方法
    *@param args 没啥用
    * */
    public static void main(String[] args) {

    }

    /**
     * @param name 唱歌的名称
     * @return "返回一个字符串结果"返回唱歌的情况
     *
     */
    public String sing(String name){
        return "aaaa";
    }
}
