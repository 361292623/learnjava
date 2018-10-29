package Day10Demo.com.itheima._05Random生成随机数的类;

import java.util.Random;

/*
* Random类：
*     生成随机数。
*
* 构造器：
*    public Random()
*
* 方法：
*    public int nextInt()
*
*    public int nextInt(int n)
*    在 0（包括）和指定值（不包括）之间均匀分布的 int 值
*
* */
public class RanDomDemo01 {
    public static void main(String[] args){
        // 创建一个随机数对象
        Random ran = new Random();

        // 调用nextInt()方法得到一个随机的整数
       /* int num = ran.nextInt();
        System.out.println(num);*/

        // num 会生成一个 0-9的随机数。
        int num = ran.nextInt(10);
        System.out.println(num);

        /*while(true){
            int num = ran.nextInt(10);
            System.out.println(num);
        }*/




    }
}
