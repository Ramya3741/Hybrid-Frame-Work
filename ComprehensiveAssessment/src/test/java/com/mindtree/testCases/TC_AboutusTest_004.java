package com.mindtree.testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.Aboutus;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.utilities.HelperClass;

public class TC_AboutusTest_004  extends BaseClass{
	@Test

	public void StudyTest() throws InterruptedException
	{
		
		log.info("Test Case 4  Excuted Started ");
		Test.info("Test Case 4  Excuted Started ");
		Thread.sleep(3000);
		 Aboutus abs=new  Aboutus(driver);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		 abs.setaboutus();
		 Test.log(Status.PASS, "Succesfully Navigated to Aboutus ");
		 HelperClass.captureScreenshots(driver);
		Thread.sleep(4000);
		log.info("Successfully excuted Test Cases 4");
		Test.log(Status.PASS, "Testcase-4  successfully Excuted");
		driver.close();
	}

}
