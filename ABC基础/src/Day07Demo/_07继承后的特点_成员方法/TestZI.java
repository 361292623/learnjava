package Day07Demo._07继承后的特点_成员方法;
/*
* 子类与父类的成员方法特点：
*   子类会优先使用自己的方法。
*
* */
public class TestZI {
    public static void main(String[] args){
        Zi zi = new Zi();
        zi.eat();
        zi.run();
        zi.run1();
    }
}
