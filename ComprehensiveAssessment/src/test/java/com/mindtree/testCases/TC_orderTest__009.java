package com.mindtree.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.pageObject.orderPage;
import com.mindtree.utilities.HelperClass;

public class TC_orderTest__009 extends  BaseClass{
	@Test

	public void orderTest() throws InterruptedException
	{
		
		log.info("Test Case 9  Excuted Started ");
		Test.info("Test Case 9  Excuted Started ");
		Thread.sleep(3000);
		orderPage op=new orderPage(driver);
		op.setordPg();
		Thread.sleep(3000);
		op.setordp();
		Thread.sleep(3000);
		HelperClass.captureScreenshots(driver);
		log.info("Taken a screenshot");
		Test.info("Successfully navigated to Bulk Order Page");
		log.info("Successfully navigated to Bulk Order Page");
		Test.log(Status.PASS, "Successfully navigated to Bulk Order Page");
		driver.close();
		 
	}
}
