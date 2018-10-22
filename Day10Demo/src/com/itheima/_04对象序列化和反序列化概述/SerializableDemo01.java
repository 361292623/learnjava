package com.itheima._04对象序列化和反序列化概述;

import java.io.*;

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
 *         构造器： ObjectInputStream(InputStream out)
 * 注意：
 *      对象如果要序列化，对象必须实现序列化接口。
 *      只要对象序列化，对象的数据将以规范方式保存。
 *
 */
public class SerializableDemo01 {
    public static void main(String[] args) throws IOException {
        Clazz c = new Clazz("98期就业","java98");
        User u = new User("孙悟空","qtds"
                ,"003197",'男',c);
        // 对象序列化
        // 定义一个原始的字节输出管道
        OutputStream os = new FileOutputStream("src/obj.dat");
        // 把字节输出管道包装成一个对象字节输出管道：就可以保存对象了
        ObjectOutputStream oos = new ObjectOutputStream(os);

        //u.setPassWord(null);
        // 对象序列化：保存对象数据。
        oos.writeObject(u);

        oos.close();
    }
}
