package Day11Demo.com.itheima._02String特点;
/*
* String类是不可变字符串：
*    1. 字符串不变：字符串的值在创建后不能被更改。
*
*    每次都是放弃了原来指向的字符对象，而新是从指向了一个新的字符串对象
*    所以原来创建的字符串对象依然不能改变！
*
*    字符串类做字符串运算的性能不好！
*
*    2. 因为String对象是不可变的，所以它们可以被共享。
*        字符串常量在常量池中只有一个，所以只能被共享。
*
* */
public class StringDemo01 {
    public static void main(String[] args){
        String str = "itheima";
        str += "欢迎"; // str = str + "欢迎"
        str += "您！";
        System.out.println(str);

        String name1 = "itheima";
        String name2 = "itheima";
        System.out.println(name1 == name2); // 被共享 同一个对象 true

        String name3 = new String("itheima");
        System.out.println(name1 == name3); // 不同对象 false
    }
}
