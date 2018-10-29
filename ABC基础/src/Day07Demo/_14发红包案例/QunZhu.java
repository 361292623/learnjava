package Day07Demo._14发红包案例;

public class QunZhu extends User {

    public QunZhu(String name , double money){
        super(name,money);
    }

    // 发钱的功能
    @Override
    public double[] sendMoney(double money, int num) {
        // 创建一个数组
        double[] redMoneys = new double[num];
        // 算出每一份钱
        double m = money / num;
        // 存入到数组中去
        for(int i = 0 ; i < redMoneys.length ; i++ ){
            redMoneys[i] = m ;
        }
        return redMoneys;
    }

    // 收钱的功能
    @Override
    public void receiveMoney(double money) {

    }
}
