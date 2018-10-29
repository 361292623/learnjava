package Day10Demo.com.itheima._03Scanner的详细使用;
import java.util.Scanner;

/*
  题目2：
* 键盘录入三个数据并获取最大值 代码如下
* */
public class ExecDemo04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // 提示用户输入三个整数
        System.out.println("请您输入第一个整数：");
        int a = scan.nextInt() ;

        System.out.println("请您输入第二个整数：");
        int b = scan.nextInt() ;

        System.out.println("请您输入第三个整数：");
        int c = scan.nextInt() ;

        // 先求出  a b的最大值 ，再与c比较
        /*int temp = a >= b ? a : b;
        int max = temp >= c ? temp : c ;*/
        int max = a >= b ? (a >= c ? a : c ) : (b >= c ? b : c ) ;
        System.out.println("最大值："+max);
    }
}
