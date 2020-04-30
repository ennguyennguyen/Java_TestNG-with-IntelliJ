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
- AssertTrue / AssertFalse: need to import the jar file for Selenium. Example commands:
```
System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
Assert.assertTrue(logo.isDisplayed());
```
- Using Parameters: use the Parameter annotation in your test file, and reconfig the xml file using the ```<parameter>``` tag
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
- Parallel Testing: 
    + Parallel methods: to use parallel testing, in the xml file, add the parallel methods and the thread count at the ```<suite>``` level

    NOTE: If you have 3 test cases but only 2 threads, whichever finish the test case first will be allocated to run the remaining test cases
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
    <suite name="All Test Suite" parallel="methods" thread-count="2">
        <test verbose="2" preserve-order="true"
              name="D:/00_MASTER OF COMPUTER SCIENCE_MUM/00_Projects/13_TestNG/src/ParallelTesting/ParallelTest1.java">
            <classes>
                <class name="ParallelTesting.ParallelTest1">
                </class>
            </classes>
        </test>
    </suite>
    ```
    + Parallel Class: instead of using parallel = "methods", we use the "classes" param
    ```
    <suite name="All Test Suite" parallel="classes" thread-count="2">
    ``` 
    + Parallel Suite: instead of using parallel = "classes", we use the "tests" param
    NOTE: don't forget to use multiple ```<test>``` tag
    ```
    <suite name="All Test Suite" parallel="tests" thread-count="2">
        <test name="test1">
            <classes>
                <class name="ParallelTesting.ParallelTest1"/>
            </classes>
        </test>
    
        <test name="test2">
            <classes>
                <class name="ParallelTesting.ParallelTest2"/>
            </classes>
        </test>
    </suite>
    ```
- Using TestNG Listeners: