package com.itheima.作业;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoPredicate {

        public static void main(String[] args) {
            Stream<String> original = Stream.of("柯镇恶", "朱聪",
                    "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");
            Stream<String> original1 = Stream.of("柯镇恶", "朱聪",
                    "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");;
            System.out.println(original.count());
            System.out.println(Arrays.toString(
                    original1.limit(3).toArray(String[]::new)));

            Stream<String> original2 = Stream.of("柯镇恶", "朱聪",
                    "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");
            System.out.println(Arrays.toString(
                    original2.skip(3).toArray(String[]::new)));
            Integer[] i=  {10,20,30,40};
            Stream<Integer> integerStream = Arrays.stream(i);
            //String[] sss = integerStream.map(String::valueOf).toArray(String[]::new);
            String[] sss = integerStream.map(s->Integer.toString(s)).toArray(String[]::new);
            System.out.println(Arrays.toString(sss));
        }
    }

