package Day10Demo.com.itheima._05Random生成随机数的类;

import java.util.Random;

/*
  题目：
    获取1-n之间的随机数，包含n

* */
public class ExecDemo02 {
    public static void main(String[] args){
        int n = 10 ;  // 1 - 10

        // (1) 创建一个随机数对象
        Random ran = new Random();
        // (2)调用方法得到一个随机的整数
        // num (0 - 9)  + 1
        int num = ran.nextInt(n) + 1;
        System.out.println(num);
    }
}
