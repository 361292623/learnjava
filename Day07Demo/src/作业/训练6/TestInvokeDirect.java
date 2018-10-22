package 作业.训练6;

public class TestInvokeDirect {
    public static void main(String[] args) {
        TestInvokeDirect.invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("完整的？");
            }
        });

        TestInvokeDirect.invokeDirect(() ->{
            System.out.println("标准写法？");
        });

        TestInvokeDirect.invokeDirect(() -> System.out.println("省略格式？"));


    }
    private static void invokeDirect(Director director){
        director.makeMovie();

    }
}
