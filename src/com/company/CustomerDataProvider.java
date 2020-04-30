package com.company;

import org.testng.annotations.DataProvider;

public class CustomerDataProvider {

    @DataProvider(name = "customerDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"customer1@gmail.com", "abc123"}, {"customer2@gmail.com", "abc123"}};
        return data;
    }
}
