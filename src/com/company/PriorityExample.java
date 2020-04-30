package com.company;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    void test1(){
        System.out.println("Running test 1....");
    }

    @Test(priority = 2, enabled = false)
    void test2(){
        System.out.println("Running test 2....");
    }

    @Test(priority = 3)
    void test3(){
        System.out.println("Running test 3....");
    }
}
