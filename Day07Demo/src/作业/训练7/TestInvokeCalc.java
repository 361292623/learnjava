package 作业.训练7;

public class TestInvokeCalc {
    public static void main(String[] args) {
        invokeCalc(130,120,(a,b)-> a-b);


    }

    private static void invokeCalc(int a,int b ,Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是："+result);

    }
}

