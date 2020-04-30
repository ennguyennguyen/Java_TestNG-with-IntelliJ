package com.company;

import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("opening browser...");
    }
    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("searching customer.....");
    }
    @Test(priority = 3)
    void addCustomer(){
        System.out.println("adding customer.....");
    }
    @Test(priority = 4)
    void teardown(){
        System.out.println("closing browser...");
    }
}
