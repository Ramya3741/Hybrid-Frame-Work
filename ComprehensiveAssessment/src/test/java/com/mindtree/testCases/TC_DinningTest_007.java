package com.mindtree.testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.DinningPage;
import com.mindtree.utilities.HelperClass;
public class TC_DinningTest_007  extends BaseClass{
	@Test
	public void StudyTest() throws InterruptedException
	{
		
		log.info("Test Case 2  Excuted Started ");
		Test.info("Test Case 2  Excuted Started ");
		Thread.sleep(3000);
		DinningPage Dp=new DinningPage(driver);
		Dp.setDinningdrp();
		Dp.setdinningchair();
		 log.info("Successfully navigated to Dinning Chair");
		 Test.log(Status.PASS, "Successfully navigated to Dinning Chair");
		 Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		  HelperClass.captureScreenshots(driver);
		  Test.log(Status.PASS, "Taken a screenshot for evidence ");
		 log.info("Successfully excuted Test Cases 7 ");
		 Test.log(Status.PASS, "Testcase-7 successfully Excuted");
		driver.close();
		
	
	}
}
