package Day07Demo._05父类不可被继承的内容;
/*
* 并不是父类的所有内容都可以给子类继承的,以下2个内容不能被子类继承:
*   1. 被private修饰的成员是不能被继承的：因为私有的东西只能当前类中访问！
    2. 构造器不能被继承，子类有自己的构造器
* */
public class Animal {
    private String name ;

    private void eat(){
        System.out.println("动物吃东西！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
