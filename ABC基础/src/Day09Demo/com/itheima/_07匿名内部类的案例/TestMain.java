package Day09Demo.com.itheima._07匿名内部类的案例;

public class TestMain {
    public static void main(String[] args){
        // 只是通过匿名内部类创建了一个按钮对象。
        ButtonDemo buttonDemo = new ButtonDemo() {
            @Override
            public void click() {
                System.out.println("单击登录");
            }

            @Override
            public String dbclick(String name) {
                return name+"双击看详情";
            }
        };
        useButton(buttonDemo,"徐磊");


        ButtonDemo buttonDemo1 = new ButtonDemo() {
            @Override
            public void click() {
                System.out.println("单击删除数据");
            }

            @Override
            public String dbclick(String name) {
                return name+"双击看视频";
            }
        };

        useButton(buttonDemo1,"张三");
    }

    public static void useButton(ButtonDemo btn , String name){
        btn.click();
        System.out.println(btn.dbclick(name));
    }
}
