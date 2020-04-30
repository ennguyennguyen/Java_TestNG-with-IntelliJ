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
- Using Parameters: use the Parameter annotation in your test file, and reconfig the xml file using the <parameter> tag
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <parameter name="browser" value="chrome"/>
    <parameter name="url" value="https://opensource-demo.orangehrmlive.com/"/>
    <test verbose="2" preserve-order="true"
          name="D:/00_MASTER OF COMPUTER SCIENCE_MUM/00_Projects/13_TestNG/src/com/company/ParameterExample.java">
        <classes>
            <class name="com.company.ParameterExample">
            </class>
        </classes>
    </test>
</suite>
```
- Use Data Provider: use DataProvider annotation and define the method to get data
   + Internal Data Provider
```
@Test(dataProvider = "dataProvider")
```
   + External Data Provider
```
@Test(dataProvider = "customerDataProvider", dataProviderClass = CustomerDataProvider.class)
```
- Parallel Testing