package _01File类的详细使用;

import java.io.File;

/*
* 分隔符：
*    路径分隔符：
 *    \ : 在Java中\是特殊字符，\n(换行) \t(空格)
 *        Java认为如果\就只想作为一个分隔符。
 *        应该在\的前面再加上一个\
 *        \\ ： \是说明后面的\就是一个分隔符(转义)
 *    /： 可以直接使用
 *    File的API:
 *
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File f1 = new File("src\\dlei.txt");
        System.out.println(f1.exists());

        File f2 = new File("src/dlei.txt");
        System.out.println(f2.exists());

        // 跨平台。
        File f3 = new File("src"+File.separator+"dlei.txt");
        System.out.println(f3.exists());
    }
}
