package Day07Demo._05父类不可被继承的内容;

public class TestCat {
    public static void main(String[] args){
        // 创建一只猫对象
        Cat cat = new Cat();
        cat.setName("叮当猫");
        System.out.println(cat.getName());
        cat.cry();
       // cat.eat();
    }
}
