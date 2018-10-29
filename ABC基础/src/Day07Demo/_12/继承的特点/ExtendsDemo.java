package Day07Demo._12.继承的特点;
/*
* Java中的继承是单继承。
*   Java只支持单继承，不支持多继承。
*   一个类只能继承一个直接父类。
*   一个类可以有多个子类
*   Java支持多层继承(继承体系，间接继承)
*
*   拓展（面试题）：
*     请问Java是什么继承模式，为什么 ? 
*     Java是单继承模式，一个类只能继承一个直接父类。
*     为什么 ？
*        假如Java是多继承
*        class A {
*           public void test(){
*               System.out.println("A");
*           }
*        }
*        class B {
 *           public void test(){
 *               System.out.println("B");
 *           }
 *        }
 *
 *        public class C extends A , B {
 *           public static void main(String[] args){
 *              C c = new C();
 *              c.test(); // 出现了类的二义性，所以不支持多继承！
 *           }
 *       }
*/
public class ExtendsDemo {
}
