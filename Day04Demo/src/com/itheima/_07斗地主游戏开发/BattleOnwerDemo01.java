package com.itheima._07斗地主游戏开发;

import java.util.*;

/*
*  斗地主游戏开发：
*     需求分析：做一个斗地主的洗牌和发牌。
*     业务特征：斗地主的牌总共有54张。
*         每张牌有四种花色："♦","♣","♥","♠"
*         每张牌的大小有："3","4","5","6","7","8","9","10","J","Q","K","A","2"
*         没一副牌有大小王各一张："🤴"  , "🃏"
*         有三个玩家，每个人轮流给牌，最终要剩下三张底牌。
*
*     功能开发：
*        （1） 做牌
*        （2） 洗牌
*        （3） 发牌
*        （4） 玩家牌排序。
*
*         // -----------------------以下功能是拓展
*        （5）打牌逻辑（搞不定）。（打牌的算法，网络编程，界面）
 *
*
*
*
*
* */
public class BattleOnwerDemo01 {

    // 定义花色使用数组。
    static String[] colors = new String[]{"♦","♣","♥","♠"};
    // 定义牌的点数
    static String[] sizes = new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


    public static void main(String[] args) {
        /*
        *  （1） 做牌
        *      定义一个集合用于保存最终做好的54张牌。
        *       ♦3,♣3,♥3,♠3,♦4,♣4,♥4,♠4,.....
        * */
        List<String> cards = new ArrayList<>();
        // 把牌做出来存进去。

        // 做出其他52张牌，花色与点数的组合
        for(String s : sizes){
            for(String c : colors){
                cards.add(c+s);
            }
        }
        // 大小王单独加入到集合中去
        Collections.addAll(cards,"🤴"  , "🃏");
        System.out.println("新牌："+cards);

        /*
        * （2） 洗牌
        *      把做好的牌打乱。
        * */
        Collections.shuffle(cards);
        System.out.println("洗牌后："+cards);

        /*
        * （3） 发牌
        *      需要三个玩家。
        *      然后分别给他们发牌：发出51张牌，留下3张作为底牌。
        */
        // 定义一个集合用于保存令狐冲的牌
        List<String> linghuchong = new ArrayList<>();
        // 定义一个集合用于保存乔峰的牌
        List<String> qiaoFeng = new ArrayList<>();
        // 定义一个集合用于保存过儿的牌
        List<String> guoEr = new ArrayList<>();
        // 然后分别给他们发牌：发出51张牌，留下3张作为底牌。
        // 牌在：cards
        //  [♣10, ♠10, ♠5, ♣7, ♥Q, ♦J, ♠K, ♠A ....
        //    0    1    2   3   4   5   6   7 ....  %  3
        //    0    1    2   0   1   2   0   1
        for(int i = 0 ; i < cards.size() - 3 ; i++) {
            // 得到每一张牌
            String card = cards.get(i);
            // 分析这张牌应该给谁？
            if(i % 3 == 0){
                // 发给 令狐冲
                linghuchong.add(card);
            }else if(i % 3 == 1){
                // 发给 乔峰
                qiaoFeng.add(card);
            }else if(i % 3 == 2){
                // 发给 过儿
                guoEr.add(card);
            }
        }


        /*
        * （5）给每个玩家的牌进行排序：有点难度，必须掌握。
        * */
        sortCards(linghuchong);
        sortCards(qiaoFeng);
        sortCards(guoEr);

        // 底牌在：cards的最后三张 。
        /*
         （4）看牌。
        cards.get(51);
        cards.get(52);
        cards.get(53);


        截取cards集合的最后三张牌到一个新的集合中去
        */
        List<String> lastThreeCards = cards.subList(cards.size()-3,cards.size());
        // 牌发完了，剩余最后三天底牌 。
        System.out.println("底牌："+lastThreeCards);
        System.out.println("令狐冲："+linghuchong);
        System.out.println("乔峰："+qiaoFeng);
        System.out.println("过儿："+guoEr);
    }

    // 自己来指定每张牌的大小规则。
    static Map<String,Integer> roles = new HashMap<>();
    // roles = {♦3=0,♣3=0,♥3=0,♠3=0,♦4=1,♣4=1,♥4=1,♠4=1,....}
    // "♦","♣","♥","♠"
    // "3","4","5","6","7","8","9","10","J","Q","K","A","2"  "🤴"   "🃏"
    //  0   1   2   3   4   5   6   7   8    9  10   11  12   14    13
    static{
        // 静态代码快初始化大小规则roles.
        for(int i = 0 ; i < sizes.length ; i++ ){
            // 得到点数
            String s = sizes[i];
            for(String c : colors){
                roles.put(c+s , i);
            }
        }
        roles.put("🤴",14);
        roles.put("🃏",13);
    }


    private static void sortCards(List<String> cards) {
        // 开始排序： cards ： [♠3, ♠J, ♣2, ♣7, ♣Q, ..
        Collections.sort(cards, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 自己来定义大小规则。
                // o1 : ♠3,
                // o2 : ♥J,
                return roles.get(o1) - roles.get(o2);
            }
        });
    }
}
