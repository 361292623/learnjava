package com.itheima.作业;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Test11 {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        Stream<String> stream =coll.stream().parallel();
        Stream<String> stream1 = coll.parallelStream();
    }
}
