package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public  void stu1(){
        System.out.println("GroupsOnClass2中的stu11111运行了");
    }
    public  void stu2(){
        System.out.println("GroupsOnClass2中的stu22222运行了");
    }
}
