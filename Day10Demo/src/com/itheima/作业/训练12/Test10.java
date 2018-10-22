package com.itheima.作业.训练12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "Day10Demo\\src\\com\\itheima\\作业\\test.txt");
        FileOutputStream fos = new FileOutputStream(
                "Day10Demo\\src\\com\\itheima\\作业\\test1.txt");

        InputStreamReader isr = new InputStreamReader(fis);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        List<String> list = new ArrayList<>();

        String str = null;
        while ((str = br.readLine())!=null){
            list.add(str);
        }

        Collections.reverse(list);
        for(String st :list){
            bw.write(st);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
