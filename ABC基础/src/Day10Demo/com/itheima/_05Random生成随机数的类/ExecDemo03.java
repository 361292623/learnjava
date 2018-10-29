package Day10Demo.com.itheima._05Random生成随机数的类;

import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏
    游戏开始时，会随机生成一个1-100之间的整数 number 。
    玩家猜测一个数字 guessNumber ，会与 number 作比
    较，系统提示大了或者小了，直到玩家猜中，游戏结束 。

    一步一步的解决问题。
    线性化思维。
     思路：
    （1） 游戏开始
    （2） 随机生成一个1-100之间的整数 number 。
     (3) 玩家必须反复的猜测，直到猜中为主。


*
*/
public class ExecDemo03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("开始游戏");
        // （1） 随机生成一个1-100之间的整数 number 。
        Random ran = new Random();
        // (2) 调用它的nextInt(边界参数)得到随机数（1-100）
        int number = ran.nextInt(100) + 1 ;
        //(3) 玩家必须反复的猜测，直到猜中为主。
        while(true){
            // 玩家要先猜测一个数字
            System.out.println("请输入您的猜测数字:");
            // 接收用户输入的数字
            int guessNumber = scan.nextInt();
            // 判断用户的猜测数字的情况
            if(guessNumber > number){
                System.err.println("您猜测的数字过大！");
            }else if(guessNumber < number){
                System.err.println("您猜测的数字过小！");
            }else{
                System.out.println("恭喜您，您很棒哦，猜对了！");
                System.out.println("号码就是："+number);
                break;
            }
        }
    }
}
