package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionExample {
    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is displayed correctly");
    }

    @Test(priority = 2)
    void titleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM");
    }

    @AfterClass
    void teardown(){
        driver.close();
    }
}
