package com.itheima._02字符缓冲流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* 需求：
*   请把一个乱序的出师表文件内容，排序后放到一个新的文件中去。
*
*   解题思路：
*   （1）定义一个缓冲字符输入流读取源文件，
*       然后一行一行的读取。
*   （2）定义一个集合来存储每一行数据。
*   （3）对集合中的全部元素，按照元素的第一个数字字符进行大小排序。
*   （4）遍历集合中的每个元素，依次写入到新的文件中去。
*
*
* */
public class ExecDemo01 {
    public static void main(String[] args) throws Exception {
        /* （1）定义一个缓冲字符输入流读取源文件，
               然后一行一行的读取。*/
        BufferedReader br = new BufferedReader(new FileReader("src/csb.txt"));
        /*  (2）定义一个集合来存储每一行数据。*/
        List<String> datas = new ArrayList<>();
        String line = null ;
        while((line = br.readLine())!=null){
            datas.add(line);
        }

        List<String> zwNumsSize = new ArrayList<>();
        Collections.addAll(zwNumsSize,"零","一","二","三","四","五","六","七","八","九","十");

        /* （3）对集合中的全部元素，按照元素的第一个数字字符进行大小排序。 */
        /*Collections.sort(datas);
        System.out.println(datas);*/
       /* Collections.sort(datas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 一，冯绍峰
                // o2 九，第三方把书..
                // indexOf是取这个元素在list集合中的索引值。
                return zwNumsSize.indexOf(o1.charAt(0)+"") - zwNumsSize.indexOf(o2.charAt(0)+"");
            }
        });*/

        Collections.sort(datas, (o1 , o2) ->  zwNumsSize.indexOf(o1.charAt(0)+"") - zwNumsSize.indexOf(o2.charAt(0)+""));
        System.out.println(datas);

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/csbnew.txt"));
        for(String ln : datas){
            bw.write(ln);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
