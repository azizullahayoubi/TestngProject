package com.class04;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

    public  void onTestStart(ITestResult result){
        System.out.println("Starting test with the name "+ result.getName());
    }
    public  void onTestSuccess(ITestResult result){
        System.out.println("Test pass, we take screen shote");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Finished passed "+result.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

   public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

   public void onFinish(ITestContext context) {
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test fail i will report ");
    }

}
