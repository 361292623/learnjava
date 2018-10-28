
package com.itheima.作业.训练4;
import java.util.Random;
/*1. 定义一个函数式接口NumberSupplier，其中抽象方法int getNum(int...nums)，使用注解 @FunctionalInterface
2. 在测试类中定义static void getRandomNumFromOne(int num , NumberSupplier ns)， 该方法的功能是使 用ns得到一个从1到num(包含1和num)之间的随机数并打印。
3. 在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns)， 该方法的功能是 使用ns得到一个从a到b(包含a和b)之间的随机数并打印。
4. 在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns), 该方法的功能是 使用ns从数组nums中获取一个随机元素并打印。
5. 调用以上三个方法，使用方法引用完成需求 */
public class Test4 {
    public static void main(String[] args) {
      /*      getRandomNumFromOne(8, new NumberSupplier() {
                @Override
                public int getNum(int... nums) {

                    return new RandmoUtil().nextInt(nums);
                }
            });*/

        getRandomNumFromOne(8,new RandmoUtil()::nextInt);
        getRandomNumFromAToB(6,9, new RandmoUtil()::nextInt);
        getRandomNumFromArray(new int[]{1,2,3},new RandmoUtil()::nextInt);


    }
    static void getRandomNumFromOne(int num , NumberSupplier ns){
        System.out.println(ns.getNum(num));
    }
    static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
        System.out.println(ns.getNum(a,b));
    }
    static void getRandomNumFromArray(int[] nums, NumberSupplier ns){
        System.out.println(ns.getNum(nums));
    }
}





@FunctionalInterface
interface NumberSupplier{
    int getNum(int...nums);
}



class RandmoUtil {
    private Random random = new Random();
    public int nextInt(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("pls认真一点！");
        }
//生成1到nums[0](包含1和nums[0])之间的随机数
        if (nums.length == 1) return random.nextInt(nums[0]) + 1;
//生成nums[0]到nums[1](包含nums[0]和nums[1])之间的随机数
        if (nums.length == 2)
            return random.nextInt(nums[1] + 1 - nums[0]) + nums[0];
//从数组nums中取出一个随机元素
        return nums[random.nextInt(nums.length)];
    }
}
