package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    // will execute before starting the Test set/batch
    @Override
    public void onStart(ITestContext arg) {
        System.out.println("Start test execution..." + arg.getName());
    }

    // will execute after starting the Test set/batch
    @Override
    public void onFinish(ITestContext arg) {
        System.out.println("Finish test execution..." + arg.getName());
    }

    // will execute before the main test start i.e @Test
    @Override
    public void onTestStart(ITestResult arg) {
        System.out.println("Starting test..." + arg.getName());
    }

    // will execute after the main test start i.e @Test
    @Override
    public void onTestSuccess(ITestResult arg) {
        System.out.println("Finishing test..." + arg.getName());
    }

    // will execute when a test is failed
    @Override
    public void onTestFailure(ITestResult arg) {
        System.out.println("Performing..." + arg.getName());
    }

    // will execute when a test is skipped
    @Override
    public void onTestSkipped(ITestResult arg) {
        System.out.println("Performing..." + arg.getName());
    }

    // ignore this method for now
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        System.out.println("Performing..." + arg.getName());
    }




}
