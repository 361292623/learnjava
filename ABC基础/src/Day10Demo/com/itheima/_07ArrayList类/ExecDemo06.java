package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;

/*
   能够使用ArrayList类作为形式参数：


*  给你一个String类型元素的集合，输出里面的内容
*  以以下格式输出：["李涛涛" , "王伟" , "邓伟" ]
* */
public class ExecDemo06 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("李涛涛");
        names.add("王伟");
        names.add("邓伟");

        printList(names);
    }

    public static void printList(ArrayList<String> names){
        System.out.print("[");
        for(int i = 0 ; i < names.size() ; i++) {
            // 如果是最后一个元素是无需加上，
            /*if(i == names.size() - 1) {
                // 最后一个元素
                System.out.print(names.get(i));
            }else{
                System.out.print(names.get(i)+",");
            }*/
            System.out.print(i == names.size() - 1?names.get(i):names.get(i)+",");
        }
        System.out.println("]");
    }
}
