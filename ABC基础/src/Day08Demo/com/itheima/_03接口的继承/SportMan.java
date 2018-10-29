package Day08Demo.com.itheima._03接口的继承;
/*
* 接口的继承:
*    接口与接口之间是继承关系（extends） : 接口是多继承的
*    接口与类之间是实现关系（implements）：接口是多实现的。
*
*    接口的多继承和多实现弥补了Java单继承的不足！
*
*
*
*/
public interface SportMan extends LawInterface , GoBroad {
    // 定义一些抽象方法
    void run();
    // eat
    void eat();
    // 比赛
    String compition(String name, String country);


}
