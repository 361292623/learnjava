package Day11Demo.com.itheima._01String类的详细使用;
/*
* String概述
java.lang.String 类代表字符串。
字符串：就是一系列字符串起来。

Java程序中所有的字符串文字（例如 "abc" ）
都可以被看作是实现此类的实例。

类String中包含了处理字符串的各种API:
   获取字符串的长度
   提取字符串中的某个字符
   截取字符串中的某段字符串。
   把字符串转换大小写
   对字符串进行分割。
   对字符串进行遍历。
   ....

创建对象：
    构造器：
    查看构造方法
    String() 创建一个空的字符串对象
    String(String original) 根据字符串来创建一个字符串对象
    北京市昌平区建材城西路金燕龙办公楼一层  电话：400-618-9090
    String(char[] value) 通过字符数组来创建字符串对象
    String(byte[] bytes) 通过字节数组来构造新的字符串对象
    String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
*/
public class StringDemo01 {
    public static void main(String[] args){
        // 此时itheima就会自动变成字符串的实例。
        // 1.这种是最常用的，也是应该这样用的。
        String name = "itheima";
        System.out.println(name);

        // 2String() 创建一个空的字符串对象
      /*  String name1 = new String();
        String name2 = "";
        name1 = "aaa";
        System.out.println(name1);*/

        // 3.String(String original) 根据字符串来创建一个字符串对象
       /* String name2 = new String("itheima");
        System.out.println(name2);*/

      /*  // false name 和 name2不是同一个对象！
        System.out.println(name ==  name2);*/


      // 4 String(char[] value) 通过字符数组来创建字符串对象
        // 可以把字符数组直接转成一坨字符串。
       /* char[] buffer = new char[]{'我','爱','中','国','a','e'};
        String rs = new String(buffer);
        System.out.println(rs);*/


        //  5.String(byte[] bytes) 通过字节数组来构造新的字符串对象
     /*   byte[] buffer = new byte[]{97,98,99,65,66,67};
        // 可以把字节数组全部转成对应的字符串。
        String rs = new String(buffer);
        System.out.println(rs);*/

        // 6. String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
        byte[] buffer = new byte[]{97,98,99,100,101,102,103};
        // 可以把字节数组的一部分转成字符串！
        // 参数一：需要转换的字节数组
        // 参数二：从哪个位置开始
        // 参数三：转多少个！
        String rs = new String(buffer,0,4);
        System.out.println(rs);


    }
}
