package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentReports extent=ExtentReportGenerator.getreport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();   // for  logging the multiple test cases on one report

	public void onTestStart(ITestResult result) {
		Liabrary.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Liabrary.test);
		
	}
	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test Case pass..");
		extenttest.get().addScreenCaptureFromBase64String(getScreenShot());

		
	}
	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case fail..");
		extenttest.get().addScreenCaptureFromBase64String(getScreenShot());
		
		
	}
	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test case Skip..");
		
		
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	
	}
	
	public static String getScreenShot() {
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
		
		
		
		
	}
}
