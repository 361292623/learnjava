package _02递归;
/*
* 拓展：
* 递归的核心思想:
*   从数学思维的方式来研究。
*
* 恒等式：
*   f(x) = f(x - 1) + 1 ;
*   已知: f(1) = 1 ;
*   求： f(10) = ?
*
*   解题过程：
*   f(10) = return f(9) +  1; = 9 + 1 = 10
*   f(9)  = return f(8) +  1; = 8 + 1 = 9
*   f(8)  = return f(7) +  1; = 7 + 1 = 8
*   f(7)  = return f(6) +  1; = 6 + 1 = 7
*   f(6)  = return f(5) +  1; = 5 + 1 = 6
*   f(5)  = return f(4) +  1; = 4 + 1 = 5
*   f(4)  = return f(3) +  1; = 3 + 1 = 4
*   f(3)  = return f(2) +  1; = 2 + 1 = 3
*   f(2)  = return f(1) +  1; = 1 + 1 = 2
*   f(1)  = return 1;
*
*   递归的三个核心点:
*         公式：  f(x) = f(x - 1) + 1
*         递归的终结点： f(1) = 1
*         递归的方向：必须走向终结点。
*/
public class DiGuiDemo02 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int x){
        if(x == 1) {
            return 1 ;
        }else{
            return f(x - 1) + 1;
        }
    }
}
