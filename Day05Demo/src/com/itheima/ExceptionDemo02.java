package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
* 异常的牛逼之处：
*
* */
public class ExceptionDemo02 {
    public static void main(String[] args) {

        while(true){
            Scanner scan =  new Scanner(System.in);
            try{
                System.out.print("请您输入您要买的商品编号：");
                int code = scan.nextInt();
                System.out.println("您要买："+code+"成功！");
               // break;
            }catch (Exception e){
                // 说明用户瞎搞了
                System.err.println("请不要乱搞！");
            }
        }

    }
}
