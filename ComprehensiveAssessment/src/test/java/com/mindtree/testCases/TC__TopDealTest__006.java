package com.mindtree.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.TopDeals;
import com.mindtree.utilities.HelperClass;

public class TC__TopDealTest__006  extends BaseClass {
	@Test
	public void TopdealTest() throws InterruptedException
	{
		
		 log.info("Test Case 6  Excuted Started ");
		 Test.info("Test Case 6  Excuted Started ");
     TopDeals tp=new TopDeals(driver);
     tp.setTopdeal();
     Thread.sleep(3000);
     tp.setsTvunit();
     HelperClass.captureScreenshots(driver);
     Test.info("Taken a Screenshot ");
     Thread.sleep(5000);
     Test.info("Successfully excuted Test Cases 6 ");
     log.info("Successfully excuted Test Cases 6 ");
     Test.log(Status.PASS, "Testcase-6  successfully Excuted");
 	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)");
     System.out.println(driver.getWindowHandles());
     HelperClass.captureScreenshots(driver);
    driver.navigate().back();
     driver.close();
}
}