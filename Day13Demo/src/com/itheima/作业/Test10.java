package com.itheima.作业;

import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {
        Stream<String> original1 = Stream.of("柯镇恶", "朱聪",
                "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");;
                original1.forEach(s -> System.out.println(s));
    }
}
