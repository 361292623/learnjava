package Day07Demo._13抽象类;
// 父类：
public abstract class Student {
    private String name ;

    // 学生都有学习能力
    // 但是不同的学生它的学习能力不同
    // 抽象类并不清楚继承者的学习能力怎么样，所以
    // 这个行为必须定义成抽象行为，交给具体的子类去实现
    // 抽象方法：只有方法签名，没有方法体，有abstract修饰
    public abstract void study();

    public abstract void go();

    // 抽象方法不能是静态的
    //public static abstract void go1();

  /*  public void study(){
        System.out.println("学生学习能力都很强！");
    }*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
