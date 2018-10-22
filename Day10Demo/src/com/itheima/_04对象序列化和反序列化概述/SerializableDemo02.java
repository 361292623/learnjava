package com.itheima._04对象序列化和反序列化概述;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * IO流的分类：
 *       字节流                                            字符流
 * 字节输入流             字节输出流                 字符输入流          字符输出流
 * InputStream          OutputStream             Reader            Writer    (抽象类)
 * FileInputStream      FileOutputStream         FileReader        FileWriter (实现类)
 * BufferedInputStream  BufferedOutputStream     BufferedReader    BufferedWriter (实现类)
 *                                               InputStreamReader OutputStreamWriter
 * ObjectInputStream    ObjectOutputStream
 *
 * 对象序列化和反序列化概述:
 *     对象序列化：把内存中的对象数据保存到磁盘文件中去。
 *        -- 使用ObjectOutputStream（对象字节输出流）:把对象保存到磁盘文件中去。
 *        构造器： ObjectOutputStream(OutputStream out)
 *
 *     对象反序列化:把磁盘对象文件的数据又读取出来恢复成内存对象。
 *        -- 使用ObjectInputStream（对象字节输入流）：把对象的文件数据读入到内存恢复成对象。
 *
 * 注意：
 *      对象如果要序列化，对象必须实现序列化接口。
 *      只要对象序列化，对象的数据将以规范方式保存。
 *      对象应该指定自己的序列化版本号：
 *          private static final long serialVersionUID =1L;
 *      对象反序列化的版本号必须与对象文件的版本号一致，否则报错。
 *      transient 修饰的成员变量不参与序列化。
 *      transient关键字格式
 *          修饰符 transient 数据类型  变量名;
 *      如果一个对象中又包含了其他对象，如果对象需要序列化，那么所有关联对象都需要实现序列化接口。
 *
 *
 */
public class SerializableDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.定义原始的字节输入流
        InputStream is = new FileInputStream("src/obj.dat");
        // 2.把字节输入管道包装对象对象字节输入管道
        ObjectInputStream  ois  = new ObjectInputStream(is);

        // 对象反序列化：把对象数据读取回来。
        User u = (User) ois.readObject();

        System.out.println(u);

    }
}
