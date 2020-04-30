package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;

    // Step 1: To use Parameter, pass the parameters into the annotation Parameter
    @BeforeClass
    @Parameters({"browser", "url"})
    // Step 2: create a method with appropriate params
    void setup(String mBrowser, String mUrl){
        // Step 3: make use of the parameters
        if(mBrowser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(mBrowser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver","C:/firefox_win32/firefoxdriver.exe");
            driver = new FirefoxDriver();
        }
        // Step 3: make use of the parameters
        driver.get(mUrl);
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
