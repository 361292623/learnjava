package com.itheima.作业.训练9;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> col  = new ArrayList();
        col.add(11);
        col.add(44);
        col.add(7);
        col.add(199);
        col.add(12);
        col.add(13);
        col.add(14);
        List<Integer> col2 =new ArrayList<>();
        col2.addAll(col);


        System.out.println(col);

        Collections.sort(col);

        System.out.println(col);

        Collections.sort(col, new Comparator<Integer>() {//倒叙
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1<o2){
                    return 1;
                }else if(o1 >o2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(col);


        Collections.shuffle(col);//打乱顺序

        System.out.println(col);

        Collections.reverse(col2);//反转
        System.out.println(col2);




    }
}
