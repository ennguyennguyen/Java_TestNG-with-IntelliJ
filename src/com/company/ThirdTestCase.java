package com.company;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Requirement 1: Run a method that will be executed before execute each method -> use @BeforeMethod annotation
// Requirement 2: Run a method that will be executed after execute each method -> use @AfterMethod annotation

public class ThirdTestCase {

    @BeforeMethod
    void preTest(){
        System.out.println("Running pre checking process....");
    }

    @AfterMethod
    void postTest(){
        System.out.println("Running post checking process....");
    }

    @Test
    void test1(){
        System.out.println("Running test method 1....");
    }

    @Test
    void test2(){
        System.out.println("Running test method 2....");
    }
}
