package Day09Demo.com.itheima._09引用类型作为方法参数和返回值;

public class TestMain {

    public static void main(String[] args){
       /* Swiming swimer = new Swiming() {
            @Override
            public void swim() {
                System.out.println("开始愉快的游泳");
            }
        };
        start(swimer,"马云");*/

        start(new Swiming() {
            @Override
            public void swim() {
                System.out.println("开始愉快的游泳");
            }
        } ,"马云");

        start(new Swiming() {
            @Override
            public void swim() {
                System.out.println("开始愉快的狗爬式游泳");
            }
        },"杨斌");


        Swiming s = getSwmer();
        s.swim();
    }

    // 引用类型作为方法的返回值
    public static Swiming getSwmer(){
       /* Swiming s = new Swiming() {
            @Override
            public void swim() {
                System.out.println("开始愉快的狗爬式游泳");
            }
        };
        return s ;*/

       return new Swiming() {
           @Override
           public void swim() {
               System.out.println("开始愉快的狗爬式游泳");
           }
       };
    }


    // 引用类型作为方法的参数。
    public static void start(Swiming swimer , String name){
        System.out.println(name);
        swimer.swim();
    }
}
