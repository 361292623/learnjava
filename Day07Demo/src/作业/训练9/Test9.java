package 作业.训练9;
//list  set  map 集合遍历forEach 遍历方式
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test9 {
    public static void main(String[] args) {
        testList();
        System.out.println();


        testSet();
        testMap();
    }
    private static void testList(){
        List<String> list = new ArrayList<>();
        list.add("112wqewe");
        list.add("ee");
        list.add("rrrr");
        list.add("kkk");
        list.add("ooo");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+",");
            }
        });
    }

    private static void testSet(){
        Set<String> set1 = new HashSet<>();
        set1.add("1111");
        set1.add("1112221");
        set1.add("12233");
        set1.add("5555");
        set1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }


    private static void testMap(){
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("wew",37763);
        map1.put("d",44);
        map1.put("q",2);
        map1.put("uu",3);
        map1.put("uu",5);

        map1.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"---"+integer);
            }
        });



    }
}
