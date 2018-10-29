package Day07Demo._14发红包案例;

public class Member extends User {

    public Member(String name , double money){
        super(name,money);
    }

    // 发钱
    @Override
    public double[] sendMoney(double money, int num) {
        return new double[0];
    }

    // 收钱
    @Override
    public void receiveMoney(double money) {
        // 更新金额
        this.setMoney(this.getMoney() + money);
    }
}
