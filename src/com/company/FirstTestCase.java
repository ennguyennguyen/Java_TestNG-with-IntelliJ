package com.company;

import org.testng.annotations.Test;

/*
*  1. Setup - open browser and application
*  2. login
*  3. close
* */
public class FirstTestCase {

    // 1. Need to add Test annotation to identify this one as a test case
    // 2. IntelliJ will run the test cases by Alphabet. Use the Priority annotation to prioritize test cases

    @Test(priority = 1)
    void setup(){
        System.out.println("opening browser...");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("logging in.....");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("closing browser...");
    }
}
