package com.itheima;
/*
* 异常几乎都是要有的。
*
*
* */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try{
            int c = 10 / 0 ;
            System.out.println(c);

            String name ="iheima";
            System.out.println(name);

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("程序结束");
    }
}
