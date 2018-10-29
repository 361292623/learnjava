package Day09Demo.com.itheima._05内部类;
public class Demo05 {
    public static void main(String[] args) {
        Body.Heart heart = new Body().new Heart();
        heart.jump();
    }
}

class Body { // 身体
    private int weight = 30;

    // 在成员位置定义一个类
    class Heart {
        private int weight = 20;

        public void jump() {
            int weight = 10;
            System.out.println("心脏在跳动 " + weight); // 10
            System.out.println("心脏在跳动 " + this.weight); // 20
            // 外部类.this 外部类对象
            // 外部类.this.weight
            System.out.println("心脏在跳动 " + Body.this.weight); // 30
        }
    }
}
