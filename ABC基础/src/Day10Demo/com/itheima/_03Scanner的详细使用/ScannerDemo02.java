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
public class ScannerDemo02 {
    public static void main(String[] args){
       // （1） 创建扫描器对象
        // 扫描键盘的输入
        Scanner scan = new Scanner(System.in);

        //（2）提示用户输入一个编号
        System.out.println("请输入你要购买的商品编号：");

        //（3）接受这个整数编号
        int id = scan.nextInt();
        System.out.println("您要购买的商品编号是："+id);
    }
}
