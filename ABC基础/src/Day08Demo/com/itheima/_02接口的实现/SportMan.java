package Day08Demo.com.itheima._02接口的实现;
/*
* 定义接口:
*   接口存在的意义是为了被实现。
*/
public interface SportMan {
    // 定义一些抽象方法
    void run();
    // eat
    void eat();
    // 比赛
    String compition(String name, String country);
}
