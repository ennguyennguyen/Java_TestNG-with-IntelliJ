# TestNG
This project is about basic understanding and commands of using TestNG

#### Table of Content:
- Define a simple test case and set Priority
- install TestNG XML plugin and use TestNG XML to run test
- Configure IntelliJ to generate reports:
   + go to Run -> Edit Configuration -> under Listeners, add the following:
        1. EmailableReporter
        2. FailedReporter
   + after running the test case, observer test-output -> open report by any browser to see the result.
- Annotations: BeforeMethod/AfterMethod, BeforeClass/AfterClass
- Dependencies
- Grouping Tests using the xml file with the following structure:
   + Include
   + Exclude
   
```
    <test verbose="2" preserve-order="true" name="GroupingTest">
        <groups>
            <run>
                <include name="sanityTest"/>
            </run>
        </groups>
        <classes>
            <class name = "com.company.GroupingTest"/>
        </classes>
    </test>
```
```
    <test verbose="2" preserve-order="true" name="GroupingTest">
        <groups>
            <run>
                <exclude name="sanityTest"/>
            </run>
        </groups>
        <classes>
            <class name = "com.company.GroupingTest"/>
        </classes>
    </test>
```
- AssertTrue / AssertFalse: need to import the jar file for Selenium
```
System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
Assert.assertTrue(logo.isDisplayed());
```
    