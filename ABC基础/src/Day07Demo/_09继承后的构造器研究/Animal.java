package Day07Demo._09继承后的构造器研究;
/*
* 父类
* */
public class Animal {
    private String name ;
    private int age ;

    public Animal() {
        System.out.println("动物的无参数构造器被执行");
    }
    // 有参数构造器可以初始化对象的数据！
    public Animal(String name, int age) {
        System.out.println("动物的有参数构造器被执行");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
