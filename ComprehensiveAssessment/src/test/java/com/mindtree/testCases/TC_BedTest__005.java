package com.mindtree.testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.*;
import com.mindtree.utilities.HelperClass;

public class TC_BedTest__005 extends BaseClass{
	@Test
	public void BedTest() throws InterruptedException
	
	{
		
		log.info("Test Case 5 excution Started");
		Test.info("Test Case 5 excution Started");
		Bedroom bd=new Bedroom(driver);
		bd.beddrp();
        Thread.sleep(3000);
		bd.kingbed();
		log.info("Successfully Navigated to KingBeds");
		Test.info("Successfully Navigated to KingBeds");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 HelperClass.captureScreenshots(driver);
		 log.info("Taken a screenshot");
		 Thread.sleep(4000);
		 driver.navigate().back();
		 log.info("Successfully Excuted Test Case 5 ");
		 log.info("Successfully Excuted Test Case 5");
		 Test.log(Status.PASS, "Testcase-5  successfully Excuted");
		 driver.close();
	}

}
