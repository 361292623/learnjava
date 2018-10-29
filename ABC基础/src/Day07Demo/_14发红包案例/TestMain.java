package Day07Demo._14发红包案例;
/*
* 需求：
*    一个群主 给 3个成员发90快钱。 均分！
*
*   代码写10遍！
*
* */
public class TestMain {
    public static void main(String[] args){
        QunZhu dw = new QunZhu("邓伟",100);
        System.out.println(dw.getName() + "-->" + dw.getMoney());

        // 邓伟开始发90快钱！
        double[] redMoneys = dw.sendMoney(90,3);
        System.out.println(redMoneys[0]);
        System.out.println(redMoneys[1]);
        System.out.println(redMoneys[2]);

        // 更新邓伟的余额
        dw.setMoney(dw.getMoney() - 90 );
        System.out.println(dw.getName() + "-->" + dw.getMoney());

        // 发给三个成员
        Member zhuzi = new Member("柱子",20);
        Member dj = new Member("东江",900);
        Member xmm = new Member("徐明明",10000);
        System.out.println("-----------------------------------");
        System.out.println(zhuzi.getName() + "-->" + zhuzi.getMoney());
        System.out.println(dj.getName() + "-->" + dj.getMoney());
        System.out.println(xmm.getName() + "-->" + xmm.getMoney());

        // 收红包
        zhuzi.receiveMoney(redMoneys[0]);
        dj.receiveMoney(redMoneys[1]);
        xmm.receiveMoney(redMoneys[2]);

        System.out.println(zhuzi.getName() + "-->" + zhuzi.getMoney());
        System.out.println(dj.getName() + "-->" + dj.getMoney());
        System.out.println(xmm.getName() + "-->" + xmm.getMoney());
    }
}
