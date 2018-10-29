package Day10Demo.com.itheima._03Scanner的详细使用;

import java.util.Scanner;

/*
*  常见API的类：
*     Scanner :
*        这个类叫扫描器，用来扫描用户的键盘输入的。
*
*
*
* */
public class ScannerDemo01 {
    public static void main(String[] args){
        // 创建一个扫描器对象
        // System.in :系统的标准输入，指的是键盘输入。
        // 扫描器扫描键盘输入的对象：sc。
        Scanner sc = new Scanner(System.in);
        // 提示用户输入
        System.out.println("请输入您的姓名：");
        // 开始接收用户的输入
        // 开始接收一行用户的输入
        // 这行代码会停止等待用户的输入，直到用户按回车键截至
        // 接受的结果是一个字符串
        String name = sc.nextLine();

        System.out.println(name+"，欢迎您加入系统！");

    }
}
