package _02递归;
/*
* 递归求1到n的和
* 递归的三个核心点:
*         公式： f(n) = f(n-1) + n
*         递归的终结点： f(1) = 1
*         递归的方向：必须走向终结点。
*
* 公式： f(n) = 1 + 2 + 3 + 4 + ... + (n-1) + n;
*       f(n) = f(n-1) + n
*
*
*  // 1 - 4
*  f(4) = f(3) + 4 = 1 + 2 + 3 + 4
*  f(3) = f(2) + 3 = 1 + 2 +3
*  f(2) = f(1) + 2 = 1 + 2
*
*
*/
public class ExecDemo05 {
    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static int f(int n){
        if(n == 1) {
            return 1 ;
        }else{
            return f(n-1) + n ;
        }
    }
}
