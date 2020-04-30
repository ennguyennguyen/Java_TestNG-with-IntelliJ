package com.company;

// IN ORDER TO USE THE DATA PROVIDER, WE USE THE "Data Provider" annotation
// EXAMPLE 1: Data provider is defined within the same class

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    // Step 1: write a test case using dataProvider param to identify the data provider method
    // @Test(dataProvider = "dataProvider")    // internal dataProvider method
    @Test(dataProvider = "customerDataProvider", dataProviderClass = CustomerDataProvider.class)    // external dataProvider method
    void testLogin(String username, String password){
        System.out.println("username: " + username + ", password: " + password);
    }

    // Step 2: create the method using "DataProvider" annotation
    @DataProvider(name = "dataProvider")
    public Object[][] getData(){
        Object[][] data = {{"nguyen@gmail.com", "abc123"}, {"baonguyen@gmail.com", "abc123"}};
        return data;
    }
}
