package Day07Demo._14发红包案例;
/*



* 群主发普通红包 :
*     用户类： 被继承的。
*          姓名：name
*          账户：money
*          发红包：sendMoney()，行为应该定义成抽象的。
*          收红包：receiveMoney()，行为应该定义成抽象的。
*
*     群主类： 创建群主对象 。
*
*     成员类： 创建群成员的
*
*
* */
public abstract class User {
    private String name ;
    private double money ;

    // 定义抽象方法
    // 发红包：sendMoney()，行为应该定义成抽象的。
    // 方法的参数： 发多少钱！ 发多少个   9.0  3
    // 方法的返回值：就是一个数组总共多少份钱！  [3.0 , 3.0 , 3.0]
    public abstract double[] sendMoney(double money,int num);

    // 收红包：receiveMoney()，行为应该定义成抽象的。
    // 参数：收到了多少钱。
    public abstract void receiveMoney(double money);

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
