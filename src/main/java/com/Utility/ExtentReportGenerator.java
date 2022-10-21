package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getreport() {
		
		String path="C:\\Users\\SMART\\eclipse-workspace\\p_Framwork\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);            // this class is use for report name,report title, theme (decorative work)
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Test prakash Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		ExtentReports extent=new ExtentReports();                           // this class is use for Envirmentol information
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Test prakash project");
		extent.setSystemInfo("O.S.", "Windows");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("QA", "Prakash");
		return extent;
                                    // ExtentTest class  // We make Referance of this class & This class through we provide information on report
	}

}
