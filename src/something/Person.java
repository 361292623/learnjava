package something;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {


    private String name;

    public Person() {}

    public Person(String name) {

        this.name = name;

    }


    public static void main(String[] args) {
        int size = Stream.of("张三","李四","张三","李四","赵四")

                .map(name->new Person(name))

                .collect(Collectors.toSet())

                .size();

        System.out.println(size);
    }
    }


