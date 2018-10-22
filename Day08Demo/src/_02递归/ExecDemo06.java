package _02递归;
/*
*  递归求n的阶乘:
 * 递归的三个核心点:
 *         公式： f(n) = n*f(n-1)
 *         递归的终结点： f(1) = 1
 *         递归的方向：必须走向终结点。
 *
 * 4!=4*3*2*1
 * f(n) = n*(n-1)*....4*3*2*1;
 * f(n) = n*f(n-1)
 *
 * f(4)= 4*f(3) = 4*3*2*1
 * f(3) =3*f(2) = 3*2*1
 * f(2) = 2*f(1)= 2*1
 *
 *
 */
public class ExecDemo06 {
    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static int f(int n){
        if(n == 1) {
            return 1 ;
        }else{
            return n*f(n-1);
        }
    }
}
