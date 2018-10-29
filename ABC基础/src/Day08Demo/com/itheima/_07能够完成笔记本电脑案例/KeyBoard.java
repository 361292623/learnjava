package Day08Demo.com.itheima._07能够完成笔记本电脑案例;
/*
* 键盘： USB规范的实现商。
* */
public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("苹果公司设计的键盘，对接USB规范成功！");
    }

    @Override
    public void close() {
        System.out.println("苹果公司设计的键盘，拔掉键盘！");
    }

    public void code(){
        System.out.println("苹果键盘代码敲到烂！");
    }
}
