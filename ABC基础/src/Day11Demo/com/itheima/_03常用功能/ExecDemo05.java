package Day11Demo.com.itheima._03常用功能;


import java.util.Scanner;

/*
  练习题：
* 键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
*
* 思路：
*    （1）键盘录入一个字符串
*    （2）统计大写字母出现的个数
*    （3）统计小写字母出现的个数
*    （4）统计数字字符出现的个数
*/
public class ExecDemo05 {
    public static void main(String[] args){
        // (1)键盘录入一个字符串
        // 创建一个扫描器扫描键盘的输入。
        Scanner scan = new Scanner(System.in);
        // 提示用户输入
        System.out.print("请您输入您喜欢的字符串：");
        String str = scan.next();

        // （2）统计大写字母出现的个数
        // 定义一个变量用于保存大写字母出现的次数
        int countUpper = 0 ;
        // 定义一个变量用于保存小写字母出现的次数
        int countLower = 0 ;
        // 定义一个变量用于保存数字字符出现的次数
        int countNum = 0 ;

        // str = "abcAaBC123"
        for(int i = 0 ; i < str.length() ; i++ ) {
            // 获取每一个字符。开始统计分析
            // 字符本身就是一个编号，所以字符可以直接比较大小
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                countLower++;
            }else if(ch >= 'A' && ch <= 'Z'){
                countUpper++;
            }else if(ch >= '0' && ch <= '9'){
                countNum++;
            }
        }

        System.out.println("大写次数："+countUpper);
        System.out.println("小写次数："+countLower);
        System.out.println("数字次数："+countNum);

    }
}
