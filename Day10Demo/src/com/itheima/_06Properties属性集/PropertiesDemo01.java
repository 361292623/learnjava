package com.itheima._06Properties属性集;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Properties;

/*
* Properties属性集:
*     很重要，但是自己很少用。
*     几乎大型的框架技术都会使用它来处理属性文件。
*
*     Properties属性集其实是一个Map集合。
*     完全可以当Map集合使用，但是意义不大。
*
*     Properties在Java中是用来代表一个属性文件的。
*     属性文件是Java技术人在大型项目中几乎一定会用到的系统配置文件。
*     属性文件中的数据全部是：键值对（字符串）
*                        后缀应该是.properties.
*
*     Properties属性集的常用功能:
*       （1）把内存中Properties集合中的数据保存到一个属性文件中去。
*       （2）把属性文件中的数据读取到一个Properties集合中去。
*
*  Properties集合常用方法
     *  Object setProperty(String key, String value)
     * 存储键值对，如果键存在，则使用新值替换旧值

     *  String getProperty(String key)
     * 根据键获得值,如果键不存在，返回null

     *  public void store(OutputStream out, String comments)
     * 将集合中的数据保存到流关联的目标文件中
     * comments：描述信息字符串，一般给null

     * void load(InputStream inStream)
     * 从流关联的目标文件中加载数据到集合中
  */
public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception {
        // 做一个用户名和密码的属性文件。
        Properties pro = new Properties();

        pro.setProperty("userName","孙悟空");
        pro.setProperty("passWord","003197");
        pro.setProperty("className","98期");

        OutputStream os = new FileOutputStream("src/users.properties");
       // 把内存中Properties集合中的数据保存到一个属性文件中去。
       // store(OutputStream out, String comments)
        // 参数一：保存的管道
        // 参数二：保存心得。
        pro.store(os,"我成功的保存了一个属性文件，我很爽！I am very Good!");

        os.close();

    }
}
