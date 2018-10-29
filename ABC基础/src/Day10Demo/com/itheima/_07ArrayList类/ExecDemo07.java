package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;

/*
  ArrayList集合类型作为返回值
 定义获取所有偶数元素集合的方法()
*
* */
public class ExecDemo07 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(111);
        list.add(112);
        list.add(114);
        list.add(115);
        list.add(117);
        list.add(118);
        list.add(119);
        System.out.println(list);

        // 把这个集合交给一个方法，然后让这个方法返回一个偶数集合
        ArrayList<Integer> list1 = getArrayList(list);
        System.out.println(list1);
    }

    // 方法的返回值类型： ArrayList<Integer>
    // 方法的参数: ArrayList<Integer>
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        // 创建一个新的集合用于保存所有的偶数并返回
        ArrayList<Integer> list1 = new ArrayList<>();
        // 遍历找list集合中的全部偶数加入到list1集合中去。
        for(int i = 0 ; i < list.size() ; i++ ){
            int num = list.get(i);
            if(num % 2 == 0){
                // 是偶数加入到list1集合中取
                list1.add(num);
            }
        }
        return  list1;
    }
}
