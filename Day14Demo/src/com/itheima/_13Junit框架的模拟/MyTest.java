package com.itheima._13Junit框架的模拟;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD) // 只能用在方法
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {

}
