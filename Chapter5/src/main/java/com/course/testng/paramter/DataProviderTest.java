package com.course.testng.paramter;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 对象传递参数化测试
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("姓名："+name+"；年龄"+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] O=new Object[][]{
                {"小白",10},
                {"小黑",20},
                {"小蓝",30},
                {"小红",40}
        };
        return O;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("这个是test1的方法  "+"姓名："+name+"；年龄"+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("这个是test2的方法  "+"姓名："+name+"；年龄"+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
                result=new Object[][]{
                        {"test11",1},
                        {"test12",2},
                        {"test13",3}
                };
        }else if (method.getName().equals("test2")){
            result=new Object[][]{
                    {"test21",1},
                    {"test22",2},
                    {"test23",3}
            };
        }
        return result;

    }
}
