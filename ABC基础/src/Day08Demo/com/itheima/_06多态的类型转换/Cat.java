package Day08Demo.com.itheima._06多态的类型转换;

public class Cat extends Animal {

    @Override
    public void sound(){
        System.out.println("猫可以喵喵的叫~");
    }

    public void catchMouse(){
        System.out.println("抓老鼠！");
    }

}
