package com.itheima._07StringBuilder类;
/*
* 反转 插入数据
* */
public class StringBuilderDemo02 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("itheima").reverse().reverse();
        // 插入一些数据
        sb.insert(1,"EEE");
        // i E E Eiheima
        // 0 1 2 3
        sb.delete(1,3); // 包前不包后

        String rs = sb.toString();
        System.out.println(rs);

        // 把内容进行反转
        //sb.reverse() ;
    }
}
