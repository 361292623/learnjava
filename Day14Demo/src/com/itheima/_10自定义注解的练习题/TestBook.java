package com.itheima._10自定义注解的练习题;

import org.junit.BeforeClass;

/*

*
*特殊属性及其注意事项：
    - 如果属性有默认值，则使用注解的时候，这个属性可以不用赋值。
    - 如果属性没有默认值，那么在使用注解时一定要给属性赋值。

 特殊属性：
        * 如果注解中只有一个属性且名字叫value，则在使用该注解时可以直接给该属性赋值，
             而不需要给出属性名。
        * 如果注解中除了value属性之外还有其他属性且只要有一个属性没有默认值，
         则在给属性赋值时 value属性名也不能省略了。
        小结：如果注解中只有一个属性时，一般都会将该属性名命名为value

*
*
* */
@MyBook(value = "sas", name="Java从入门到精通",price = 200.2
        , authors = {"徐磊","蜘蛛精"})
@Book("徐磊")
//@Book(value="徐磊")
public class TestBook {
}
