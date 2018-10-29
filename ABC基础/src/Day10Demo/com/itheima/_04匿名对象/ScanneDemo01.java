package Day10Demo.com.itheima._04匿名对象;

import java.util.Scanner;

/*
* 匿名对象：
*     没有名字的对象。
*
* */
public class ScanneDemo01 {
    public static void main(String[] args){
        // 创建扫描器对象 去扫描键盘的输入
        // 接收用户输入两个整数
        /*System.out.println("请您输入第一个整数：");
        int a = new Scanner(System.in).nextInt() ;

        System.out.println("请您输入第二个整数：");
        int b = new Scanner(System.in).nextInt() ;

        int c = a + b ;
        System.out.println("您的结果是："+c);*/

      /*  Scanner scan = new Scanner(System.in);
        recevie(scan);*/

      // 匿名对象。
      recevie(new Scanner(System.in));
    }

    public static void recevie(Scanner scan){
        System.out.println("请您输入一个整数：");
        int b = scan.nextInt();
        System.out.println("接收："+b);
    }
}
