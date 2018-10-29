package Day11Demo.com.itheima._04Arrays类;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
* 请使用 Arrays 相关的API，
*    将一个随机字符串中的所有字符升序排列，并倒序打印。
*
*    aedb  -> 升序abde  ->  降序edba
*
* */
public class ExecDemo02 {
    public static void main(String[] args){
        // 使用代码生成一个随机的6位字符串
        String str = "" ;
        Random ran = new Random();
        for(int i = 0 ; i < 25 ; i++ ) {
            // 英文大写字符的编号范围： 65+0 65+25  A - Z
            // 英文小写字符的编号范围： 97+0 97+25  a - z
            // 生成大小写字母也应该是随机的
            int data = ran.nextInt(2); // 0  1
            switch (data){
                case 0:
                    // 大写字母
                    int int1 = 65 + ran.nextInt(26) ;
                    char ch = (char) int1;
                    str += ch ;
                    break;
                case 1:
                    //小写字母
                    int int2 = 97 + ran.nextInt(26) ;
                    char ch2 = (char) int2;
                    str += ch2 ;
                    break;
            }
        }
        System.out.println(str);
        // 升序
        // 把字符串转成字符数组
        char[] buffers = str.toCharArray();
        Arrays.sort(buffers);
        System.out.println(Arrays.toString(buffers));

        // 降序
        for(int i = buffers.length-1 ; i >= 0 ; i-- ){
            System.out.print(buffers[i]);
        }

    }
}
