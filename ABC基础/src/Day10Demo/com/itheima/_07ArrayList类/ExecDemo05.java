package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个1~33之间的随机整数,添加到集合,并遍历
*
* 泛型是不能写基本数据类型的：
*     如果写基本数据类型报错
*     必须改成基本数据类型对应的包装类的形式。
*     基本类型   包装类型
*     byte      Byte
*     short     Short
*     int       Integer (整数特殊)
*     long      Long
*     float     Float
*     double    Double
*     char      Character (字符特殊)
*     boolean   Boolean
*
* */
public class ExecDemo05 {
    public static void main(String[] args){
        // 创建一个集合存储6个整数
        ArrayList<Integer> lists = new ArrayList<>();
       /* lists.add(1);
        lists.add(123);
        lists.add(1232323);*/

       Random ran = new Random();

       for(int i = 0 ; i < 6 ; i++ ) {
           // 生成6个1~33之间的随机整数
           int num = ran.nextInt(33) + 1 ;
           // 加入到集合中去
           lists.add(num);
       }

       System.out.println(lists);
       for(int i = 0 ; i < lists.size() ; i++) {
           int rs = lists.get(i);
           System.out.println(rs);
       }

    }
}
