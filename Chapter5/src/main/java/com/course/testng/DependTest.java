package com.course.testng;

import org.testng.annotations.Test;
/**
 * 依赖测试
 * test2方法基于test1进行执行
 * 如果test1执行失败test2将被忽略
 * 可以做为登陆失败前置条件
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
