package com.course.testng.paramter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * xml文件参数化测试
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("姓名="+name+","+"年龄="+age);
    }
}
