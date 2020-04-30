package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

// Add dependencies: start -> drive -> park -> stop
// using dependsOnMethods = {} to set dependencies

// In case we have a priority test case which we want it to be executed even it depends on some other test case
// use the alwaysRun = True
public class DependenciesExample {

    @Test
    void startCar(){
        System.out.println("Starting car...");
        Assert.fail();       // If test case is failed, all other dependents will be ignored
    }

    @Test(dependsOnMethods = {"parkCar"})
    void stopCar(){
        System.out.println("Stopping car...");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Driving car...");
    }

    @Test(dependsOnMethods = {"driveCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("Parking car...");
    }
}
