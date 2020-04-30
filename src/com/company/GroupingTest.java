package com.company;

import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"sanityTest"})
    void Test1(){
        System.out.println("Running Test 1...");
    }
    @Test(groups = {"functionalTest"})
    void Test2(){
        System.out.println("Running Test 2...");
    }

    @Test(groups = {"sanityTest"})
    void Test3(){
        System.out.println("Running Test 3...");
    }
    @Test(groups = {"functionalTest"})
    void Test4(){
        System.out.println("Running Test 4...");
    }
}
