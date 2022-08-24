package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void Bs() throws Exception {
		 config=new ConfigDataProvider();
		 excel=new ExcelDataProvider();
	}
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 //driver.get("https://www.facebook.com/login/");
		 
		   driver.get(config.get_BaseUrl_QA1());
		// driver.get(config.get_BaseUrl_QA2());
		   driver.manage().window().maximize();
		 
		
	}
	@AfterTest
	public void TearDown() {
		driver.close();
	}

}
