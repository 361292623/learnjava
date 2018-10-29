package Day08Demo.com.itheima._07能够完成笔记本电脑案例;
/*
* USB是一个接口，体现的是规范。
*   USB定义鼠标和键盘都应该遵循的规范。
*
* 接下来必须定义鼠标 和 键盘
*
* USB是规范商。（其实就一个计算机硬件协会定制的设计规则）
* 鼠标： USB规范的实现商。
* 键盘： USB规范的实现商。
*
*
* */
public interface USB {
    void open(); // 开启
    void close(); // 关闭
}
