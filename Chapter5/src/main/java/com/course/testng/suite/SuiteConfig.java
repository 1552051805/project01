package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before Suit运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行了");
    }
}
