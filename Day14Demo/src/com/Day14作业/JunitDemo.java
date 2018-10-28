package com.Day14作业;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
    private static Calculator cal ;
    @BeforeClass
    public static void creatC (){
     cal = new Calculator();
    }
    @Test
    public void jia(){
        cal.jia();
    }

}
