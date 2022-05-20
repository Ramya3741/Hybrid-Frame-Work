package com.mindtree.testCases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mindtree.pageObject.LoginPage;





public class BaseClass {

	public String baseURL="https://www.urbanladder.com/" ;
	public String username="bandivinod2000@gmail.com";
	public String password="Test@3741";
	public static WebDriver driver;
	public static Logger log;
	public  ExtentReports report;
	public static ExtentTest Test;
	@BeforeSuite
	public void suitesetup()
	{
		ExtentHtmlReporter extent=new ExtentHtmlReporter("Results.html");
		report=new ExtentReports();
		report.attachReporter(extent);
		Test=report.createTest("Comprehensive Assessment ");
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		log=Logger.getLogger("Comprehensive Assessment");
		PropertyConfigurator.configure("log4j.properties");
	driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setLoginIcon();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.setloginbutton();
		lp.setUsername(username);
		lp.setPassword(password);
		lp.setclickbutton();

	}
	
	@AfterSuite
	public void tearDown() {
 	

	}

}
