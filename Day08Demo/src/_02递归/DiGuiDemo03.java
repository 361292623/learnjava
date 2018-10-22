package _02递归;
/*
 *   递归的三个核心点:
 *         公式：
 *         递归的终结点：
 *         递归的方向：必须走向终结点。
 *
 *   公式：f(x) = f(x+1) -3 ;
 *   已知：f(1) = 1 ;
 *   求： f(10)= ?
 *
 *   如何解决？
 *   公式需要转换：
 *   f(x -1) = f(x) - 3
 *   f(x) = f(x-1) + 3
 *
 */
public class DiGuiDemo03 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int x){
        if(x == 1) {
            return 1 ;
        }else{
            return f(x - 1) + 3 ;
        }
    }
}
