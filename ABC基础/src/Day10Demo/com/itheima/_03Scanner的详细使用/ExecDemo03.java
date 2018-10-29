package Day10Demo.com.itheima._03Scanner的详细使用;

import java.util.Scanner;

/*
   题目1：

*  键盘录入两个数据并求和
*
*
* */
public class ExecDemo03 {
    public static void main(String[] args) {
        // 创建扫描器对象 去扫描键盘的输入
        Scanner scan = new Scanner(System.in);
        // 接收用户输入两个整数
        System.out.println("请您输入第一个整数：");
        int a = scan.nextInt() ;

        System.out.println("请您输入第二个整数：");
        int b = scan.nextInt() ;

        int c = a + b ;

        System.out.println("您的结果是："+c);

    }
}
