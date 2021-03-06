package _02递归;
/*
* 递归经典案例：
*     猴子吃桃问题。
*     猴子第一天去桃园摘下了若干个桃子，当即吃下了一半，觉得好不过瘾，又多吃了一个。
*     第二天又吃前天剩余桃子的一半，觉得又不过瘾，又多吃了一个。
*     以后每天都是吃前天剩余桃子的一半，觉得不过瘾，又多吃一个。
*     等到第10天想再吃的时候发现只有一个桃子了。
*     请问猴子第一天摘了多少个桃子?
*
*     f(x+1) = f(x) - f(x) / 2 - 1 ;
*     2f(x+1) = 2f(x) - f(x) - 2
*     f(x) = 2f(x+1) + 2
*
* 递归的三个核心点:
*         公式： f(x) = 2f(x+1) + 2
*         递归的终结点： f(10) = 1
*         递归的方向：必须走向终结点。
*
* 有局限性：上述递归思想只适合规律化递归。不适合复杂递归，复杂递归请自己分析解决。
*
* 作业（爱做不做，非规律化递归）：
*    啤酒2元一瓶，2个空瓶可以换一瓶，4个盖子可以换一瓶
*    请问10元可以喝多少瓶？剩余多少瓶子和盖子。
*
*    15瓶 1个空瓶 3个盖子。
*
*    简洁 是优雅。
*    复杂：代码冗余，思维混乱
*    线性化代码：可读性好。
*
* */
public class DiGuiDemo04 {

    public static void main(String[] args) {
        System.out.println(f(1));
    }

    public static int f(int x){
        if(x == 10) {
            return 1 ;
        }else{
            return 2*f(x+1) + 2 ;
        }
    }
}
